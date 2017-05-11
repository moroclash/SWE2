package freelaning;

import java.time.LocalDateTime;
import org.hibernate.Query;
import org.hibernate.Session;
import system.Statistics;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)
/**
 *
 */
public class Invoice {
      
        
	/**
	 * Default constructor
	 */
	public Invoice() {
	}

	/**
	 *
	 */
	private Offer offer;

	/**
	 *
	 */
	private int state;

	/**
	 *
	 */
	private LocalDateTime date;

	/**
	 *
	 */
	private Double price;

	private int id;
       
	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
     * @param offer
     * @param emp
	 * @return
	 */
       
    public boolean pay(Offer offer , Employer emp  ) {
	
        // set invoise info
        this.id=3;
        this.date= LocalDateTime.MAX;
        this.price = (double)offer.getNumberOfHours() * offer.getHourCost() ;
        this.state = 0;
        
        
        
        
          Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
         try{
              
                se.getTransaction().begin();
                this.offer = (Offer) se.get(Offer.class, offer.getId());
               
           // add mony to freeLancer
                Freelancer f = (Freelancer) se.get(Freelancer.class, offer.getOwner().getId());
                f.setFirstName("d");
                double freelancerMony = ( offer.getHourCost()*offer.getNumberOfHours()) * 0.9 + f.getBalance()  ;
                //System.out.println("kkkk");
                f.setId(3);
                f.setBalance(freelancerMony);
                //se.merge(f);
                //se.save(f);
//               String q = "Update Freelancer set balance = :b where id =:i";
//               Query hq = se.createQuery(q);
//               hq.setParameter("b" ,freelancerMony);
//                hq.setParameter("i", offer.getOwner().getId());
//               hq.executeUpdate();
           
           // add target to the system
                Statistics s = (Statistics) se.get(Statistics.class ,1);
                double systemTarget = s.getTotalMoney() - (offer.getHourCost()*offer.getNumberOfHours()) * 0.9;
                String  q = "Update Statistics set totalMoney = :b where id = 1";
                Query hq = se.createQuery(q);
                hq.setParameter("b" ,systemTarget);
                hq.executeUpdate();
              //  System.out.println("sssss>>"+ systemTarget);
           
           
         
              // notify freelancer 
               AccNotification not = new AccNotification();
               not.setFromAccount_id(emp);
               not.setToAccount_id(offer.getOwner());
               not.setMassage("your offer is acceted  " + freelancerMony + " added to your account ");
               not.setDate(LocalDateTime.MAX);
               not.setState(true);
               offer.getOwner().addNotification(not);
        
           // save invoice in database
           
           se.save(this);
           
           // save chenges
           se.getTransaction().commit();
             
         }
         catch(Exception e )
         {
           se.getTransaction().rollback();
             System.out.println("freelaning.Invoice.pay()");
         } finally{
            
           se.close();
         }
         

          
         return true ;
         
	}

}
