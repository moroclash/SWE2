package freelaning;

import java.time.LocalDateTime;
import java.util.ArrayList;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)


/**
 * 
 */
public class Task {

    /**
     * Default constructor
     */
    public Task() {
    }

    /**
     * 
     */
    private String task;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	public ArrayList<Offer> getOffers() {
		return offers;
	}

	public void setOffers(ArrayList<Offer> offers) {
		this.offers = offers;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public int getTaskID() {
		return taskID;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public ArrayList<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}

    /**
     * 
     */
    // @Taha: It should be unsigend 
    private int timeTaken;

    /**
     * 
     */
    private ArrayList<Offer> offers;

    /**
     * 
     */
    private Employer employer;

    /**
     * 
     */
    private int taskID;

    /**
     * 
     */
    private String category;

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
    public ArrayList<String> technologies;











    /**
     * @return
     */
    public boolean uploadTask() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean cancelTask() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean editTask() {
        // TODO implement here
        return false;
    }

}