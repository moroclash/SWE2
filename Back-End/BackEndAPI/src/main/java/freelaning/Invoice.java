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
        this.state = 1;
        
        
        
        // start session
          Session se  ;  boolean flag = true ;
         se = databaseManager.SessionsManager.getSessionFactory().openSession();     
         try{
              
                se.getTransaction().begin();
                this.offer = (Offer) se.get(Offer.class, offer.getId());
               
          // add mony to freeLancer 
                Freelancer f = (Freelancer) se.get(Freelancer.class, offer.getOwner().getId());
                double freelancerMony = ( offer.getHourCost()*offer.getNumberOfHours()) * 0.9 + f.getBalance()  ;
                
                
                f.setBalance(freelancerMony);
            
               

           
           // add target "الربح" to the system
                Statistics s = (Statistics) se.get(Statistics.class ,1);
                // نخصم فلوس الاوفر من التوتال ماني
                s.setTotalMoney(s.getTotalMoney()- (offer.getHourCost()*offer.getNumberOfHours()));
                // نحط الربح في الourmony
                s.setOurMoney((offer.getHourCost()*offer.getNumberOfHours()) * 0.1);
                
           
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
           
             
                if (flag) {
                 se.update(f);
                 se.update(s);
             } else {
                 se.merge(f);
                 se.merge(s);
             }
           // save chenges
           se.getTransaction().commit();
             
         }
         catch(Exception e )
         {
             System.out.println(e);
             se.getTransaction().rollback();
             
             if (flag) {
                 {System.out.println("ddddddd");
                 se.close();
                 }
             }
         }
         

          
         return true ;
         
	}

}
