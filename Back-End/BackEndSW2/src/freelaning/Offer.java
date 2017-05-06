package freelaning;

import java.time.LocalDateTime;
import org.hibernate.Session;
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
            if(account instanceof  Employer)
            {
                if(this.state == 0)
                this.state = 2;
                else 
                    this.state = 5;
                
                        
            }
            else if(account instanceof Freelancer) 
            {
                this.state = 4;
            }
            Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.update(this);
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
		// TODO implement here
	}

	/**
	 * @return
	 */
	public boolean editOffer(Offer offer) {
            
	Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.update(offer);
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

		return false;
	}

}