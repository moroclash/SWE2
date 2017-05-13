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
     * @param offer
	 * @return
	 */
	public boolean editOffer(Offer offer) {
         
        boolean flag = false , end =true;  
        // open session
	Session se ;
        try{
         se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();   
        }
        catch(Exception e )
        {
        se = databaseManager.SessionsManager.getSessionFactory().openSession();
        flag = true ; 
        
        }
        try {
            se.beginTransaction();
            if (flag) {
                se.update(offer);
            } else {
                se.merge(offer);
            }
            
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
            end = false ;
        } finally {
            if(flag)
            se.close();
        }

		return end;
	}

}