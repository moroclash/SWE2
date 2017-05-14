package freelaning;

import java.util.Set;
// @TahaMagdy: DONE

/**
 *
 */
public class FreelancerProfile extends Profile {

	/**
	 * Default constructor
	 */
	public FreelancerProfile() {
	}

	/**
	 *
	 */
	private int averageHourCost;

	/**
	 *
	 */
	private Set<Feedback> reviews;
	
	
	

	public int getAverageHourCost() {
		return averageHourCost;
	}

	public void setAverageHourCost(int averageHourCost) {
		this.averageHourCost = averageHourCost;
	}

	public Set<Feedback> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Feedback> reviews) {
		this.reviews = reviews;
	}

}
