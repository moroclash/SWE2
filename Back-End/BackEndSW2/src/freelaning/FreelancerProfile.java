package freelaning;
import java.util.ArrayList;
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

	public int getAverageHourCost() {
		return averageHourCost;
	}

	public void setAverageHourCost(int averageHourCost) {
		this.averageHourCost = averageHourCost;
	}

	public ArrayList<Feedback> getReviews() {
		return reviews;
	}

	public void setReviews(ArrayList<Feedback> reviews) {
		this.reviews = reviews;
	}

    /**
     * 
     */
    private ArrayList<Feedback> reviews;



}