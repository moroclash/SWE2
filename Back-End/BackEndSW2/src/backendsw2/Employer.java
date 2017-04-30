
import java.util.*;

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
    public void createTask(int numberOfHours, double budget, String description, ArrayList<Strings> technologies) {
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
    public bool rejectFinishedTask(Offer offer) {
        // TODO implement here
        return null;
    }

    /**
     * @param offer 
     * @param description 
     * @param ratePercentage
     */
    public void makeFeedback(Offer offer, String description, int ratePercentage) {
        // TODO implement here
    }

}