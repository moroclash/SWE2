package freelaning;

import java.time.LocalDateTime;
import org.hibernate.Query;
import org.hibernate.Session;
import system.Constraints;
// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

/**
 *
 */
public class Offer {

	/**
	 * Default constructor
	 */
	public Offer() {
	}

	/**
	 *
	 */
	private int hourCost;


	/**
	 *
	 */
	private int numberOfHours;

	/**
	 *
	 */
	private String description;

	/**
	 *
	 */
	private Freelancer owner;

	/**
	 *
	 */
	private Counter counter;

	/**
	 *
	 */
	private Task task;

	/**
	 *
	 */
	private int id;

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
	private int timeNeeded;

	
	public int getHourCost() {
		return hourCost;
	}

	public void setHourCost(int hourCost) {
		this.hourCost = hourCost;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Freelancer getOwner() {
		return owner;
	}

	public void setOwner(Freelancer owner) {
		this.owner = owner;
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
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

	public int getTimeNeeded() {
		return timeNeeded;
	}

	public void setTimeNeeded(int timeNeeded) {
		this.timeNeeded = timeNeeded;
	}
	
	
	/**
	 *
	 */
	public void cancelOffer(Account account ) {
          
           
           
            //getRate
            int rate =  ((Employer) account).getProfile().getRate().getTheRate();
           
          
             Session se = databaseManager.SessionsManager.getSessionFactory().openSession(); 
        try {
             //open session
           
            Query hq ;
            String q  = ""; 
            se.beginTransaction();
            
            // case of Employer
              if(account instanceof  Employer)
            {
                // case of that offer is created on a task, but not assigned
                if(this.state == 0)
                {
                 q = "Update Offer set state = 2  where id = :offerId" ;
                 hq = se.createQuery(q);
                 hq.setParameter("offerId", this.id);
                 hq.executeUpdate();
                }
                // case of  cancelled by Employer during after assigning
                else{ 
                    //get constraints from database
                Constraints constraints  = (Constraints) se.get(Constraints.class  ,1);
                rate = rate - constraints.getEm_cancelRunningTaskPenalty();
                
                // update offer state
                
                 q = "Update Offer set state = 5  where id = :offerId" ;
                 hq = se.createQuery(q);
                 hq.setParameter("offerId", this.id);
                 hq.executeUpdate();
                 
               // panlty Employer 
               
                   q = "Update Rate set theRate = :rate  where id = :rateId" ;
                    hq = se.createQuery(q);
                    hq.setParameter("rate", rate);
                    hq.setParameter("rateId",((Employer) account).getProfile().getId() );
                    hq.executeUpdate();
                    
                    
                 // notify Employer
                 AccNotification not = new AccNotification();
                not.setFromAccount_id(this.getOwner());
                not.setToAccount_id((Employer) account);
                not.setMassage(" your rate is cosumed  to :D "+ rate);
                not.setDate(LocalDateTime.MAX);
                not.setState(true);
                ((Employer)account).addNotification(not);
                 
                 
                }
                
                        
            }
             //case of that the offer  cancelled by freelancer during after assigning
            else if(account instanceof Freelancer) 
            {
                
                 q = "Update Offer set state = 4  where id = :offerId" ;
                 hq = se.createQuery(q);
                 hq.setParameter("offerId", this.id);
                 hq.executeUpdate();
            }
            
           
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

            
              
            
		
	}

	/**
	 *
	 */
        // 
	public void acceptOffer() {
		// TODO implement here استدعي في الامبلوير 
	}

	/**
	 * @return
	 */
	public boolean editOffer(Offer offer) {
            
	Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.merge(offer);
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

		return false;
	}

}