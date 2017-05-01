package freelaning;

import java.util.List;
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
	private List<Feedback> reviews;
	
	
	

	public int getAverageHourCost() {
		return averageHourCost;
	}

	public void setAverageHourCost(int averageHourCost) {
		this.averageHourCost = averageHourCost;
	}

	public List<Feedback> getReviews() {
		return reviews;
	}

	public void setReviews(List<Feedback> reviews) {
		this.reviews = reviews;
	}

}
