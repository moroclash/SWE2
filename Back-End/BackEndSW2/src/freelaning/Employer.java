package freelaning;

import java.util.ArrayList;


// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it);

/**
 * 
 */

public class Employer extends ConsumerAccount {

    /**
     * Default constructor
     */
    public Employer() {
    }

    /**
     * 
     */
    private EmployerProfile profile;





    /**
     * @param numberOfHours 
     * @param budget 
     * @param description 
     * @param technologies
     */
    public void createTask(int numberOfHours,
	    		   double budget,
			   String description, 
			   ArrayList<String> technologies) {
        // TODO implement here
    }

    /**
     * @param offer
     */
    public void acceptOffer(Offer offer) {
        // TODO implement here
    }

    /**
     * @param offer
     */
    public void rejectOffer(Offer offer) {
        // TODO implement here
    }

    /**
     * @param overTime
     */
    public void acceptOverTime(OverTimeRequest overTime) {
        // TODO implement here
    }

    /**
     * @param overTime
     */
    public void rejectOverTime(OverTimeRequest overTime) {
        // TODO implement here
    }

    /**
     * @param offer 
     * @return
     */
    public Invoice acceptFinishedTask(Offer offer) {
        // TODO implement here
        return null;
    }

    /**
     * @param offer 
     * @return
     */
    public boolean rejectFinishedTask(Offer offer) {
        // TODO implement here
        return false;
    }

    /**
     * @param offer 
     * @param description 
     * @param ratePercentage
     */
    public void makeFeedback(Offer offer, String description, int ratePercentage) {
        // TODO implement here
    }

	@Override
	public boolean register() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}