
import java.util.*;

/**
 * 
 */
public class Freelancer extends ConsumerAccount {

    /**
     * Default constructor
     */
    public Freelancer() {
    }

    /**
     * 
     */
    private ArrayList<String> skills;

    /**
     * 
     */
    private ArrayList<Experience> experience;

    /**
     * 
     */
    private double balance;

    /**
     * 
     */
    private FreelancerProfile profile;














    /**
     * @param task 
     * @param offer
     */
    public void applyTask(Task task, Offer offer) {
        // TODO implement here
    }

    /**
     * @param task
     */
    public void apologizeForTask(Task task) {
        // TODO implement here
    }

    /**
     * @param task
     */
    public void cancelOffer(Task task) {
        // TODO implement here
    }

    /**
     * @param offer 
     * @param hoursNeeded
     */
    public void requestOverTime(Offer offer, int hoursNeeded) {
        // TODO implement here
    }

    /**
     * @param offer 
     * @param rateValue
     */
    public void rateEmployer(Offer offer, int rateValue) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Offers> getWaitingOffers() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Task> getCompletedTasks() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Task> getAcceptedTasks() {
        // TODO implement here
        return null;
    }

    /**
     * @param skill
     */
    public void addSkill(String skill) {
        // TODO implement here
    }

    /**
     * @param skill
     */
    public void deleteSkill(String skill) {
        // TODO implement here
    }

    /**
     * 
     */
    public void listTasks() {
        // TODO implement here
    }

}