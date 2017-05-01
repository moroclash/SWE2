package freelaning;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

	/**
	 *
	 */
	// @Taha: It should be unsigend 
	private int timeTaken;

	/**
	 *
	 */
	private List<Offer> offers;

	/**
	 *
	 */
	private Employer employer;

	/**
	 *
	 */
	private int id;

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
	public Set<Skill> technologies;

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

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
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

	public Set<Skill> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<Skill> technologies) {
		this.technologies = technologies;
	}

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
