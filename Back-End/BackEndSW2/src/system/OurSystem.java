package system;

import freelaning.Complaint;
import freelaning.ConsumerAccount;
import freelaning.Freelancer;
import freelaning.AccNotification;
import freelaning.Offer;
import freelaning.Task;
import java.util.ArrayList;
import org.hibernate.Session;



// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)il.*;


// Singletone Pattern


/**
 * 
 */
public class OurSystem {

    /**
     *  Singleton
     */
    private OurSystem() {
    }



    /**
     * 
     */
    static private OurSystem sysInstance = new OurSystem();

    /**
     * @return
     */
    public static OurSystem getInstance() {

        return sysInstance; 
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
     * @maintainer TahaMagdy
     * @param id 
     * @return
     */
public Task getTask(int id) {
System.out.println("getTask is fired from OurSystem");

	// Setting session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	Task taskDB = new Task();

	try {
		// Fetching Task
		taskDB = (Task) session.get(Task.class, id);
		System.out.println("This is TaskID -> " + taskDB.getId());
		System.out.println("This is TaskCaegory -> " + taskDB.getCategory() );
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}


        return taskDB;
    } // end getTask()

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
    public boolean notifyAll(AccNotification notification) {
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

}