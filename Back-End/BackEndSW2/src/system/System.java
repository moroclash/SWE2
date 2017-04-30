package system;

import freelaning.Complaint;
import freelaning.ConsumerAccount;
import freelaning.Freelancer;
import freelaning.Notification;
import freelaning.Offer;
import freelaning.Task;
import java.util.ArrayList;



// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)il.*;


// Singletone Pattern


/**
 * 
 */
public class System {

    /**
     * Default constructor
     */
    public System() {
    }

    /**
     * 
     */
    private Constraints constraints;

    /**
     * 
     */
    private ArrayList<Complaint> unseenComplaints;

    /**
     * 
     */
    private Statistics statistics;

    /**
     * 
     */
    static private System sys;




    /**
     * @param id 
     * @return
     */
    public Task getTask(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    public Offer getOffer(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param searchKey 
     * @param mode 
     * @return
     */
    public ConsumerAccount getAccount(String searchKey, int mode) {
        // TODO implement here
        return null;
    }

    /**
     * @param notification 
     * @return
     */
    public boolean notifyAll(Notification notification) {
        // TODO implement here
        return false;
    }

    /**
     * @param freelancer 
     * @return
     */
    public ArrayList<Task> taskFeed(Freelancer freelancer) {
        // TODO implement here
        return null;
    }

    /**
     * @param technologies 
     * @return
     */
    public ArrayList<Task> taskFilter(ArrayList<String> technologies) {
        // TODO implement here
        return null;
    }

    /**
     * @param category 
     * @return
     */
    public ArrayList<Task> taskFilter(String category) {
        // TODO implement here
        return null;
    }

    /**
     * @param category 
     * @return
     */
    public boolean addCategory(String category) {
        // TODO implement here
        return false;
    }

    /**
     * @param category 
     * @return
     */
    public boolean deleteCategory(String category) {
        // TODO implement here
        return false;
    }

    /**
     * @param technology 
     * @return
     */
    public boolean addTechnology(String technology) {
        // TODO implement here
        return false;
    }

    /**
     * @param technology 
     * @return
     */
    public boolean deleteTechnology(String technology) {
        // TODO implement here
        return false;
    }

    /**
     * @param oldTech 
     * @param newTech 
     * @return
     */
    public boolean updateTechnology(String oldTech, String newTech) {
        // TODO implement here
        return false;
    }

    /**
     * @param oldCate 
     * @param newCatech 
     * @return
     */
    public boolean updateCategory(String oldCate, String newCatech) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public ArrayList<Complaint> getSeenComplaints() {
        // TODO implement here
        return null;
    }

    /**
     * @param userName 
     * @param passwd 
     * @return
     */
    public Object getAccess(String userName, String passwd) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public System GetInstance() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    private void System() {
        // TODO implement here
    }

}