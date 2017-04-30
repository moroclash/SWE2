package freelaning;
import java.time.LocalDateTime;
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

	public int getOfferID() {
		return offerID;
	}

	public void setOfferID(int offerID) {
		this.offerID = offerID;
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
    private int offerID;

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








    /**
     * 
     */
    public void cancelOffer() {
        // TODO implement here
    }

    /**
     * 
     */
    public void acceptOffer() {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean editOffer() {
        // TODO implement here
        return false;
    }

}