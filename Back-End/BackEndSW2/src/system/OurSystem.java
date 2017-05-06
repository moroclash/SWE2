package system;

import freelaning.Complaint;
import freelaning.ConsumerAccount;
import freelaning.Freelancer;
import freelaning.AccNotification;
import freelaning.Account;
import freelaning.Employer;
import freelaning.Offer;
import freelaning.Task;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
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
System.out.println("getOffer is fired from OurSystem");

	// Setting session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	Offer offerDB = new Offer();

	try {
		// Fetching TasOfferk
		offerDB = (Offer) session.get(Offer.class, id);
		System.out.println("This is offerID-> " + offerDB.getId());
		System.out.println("This is offerDescription -> " + offerDB.getDescription());
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}


        return offerDB;
    } // end getOffer






    /**
     * @maintainer TahaMagdy
     * @param mode: determines how do you want to search.
     * 	0 id DONE
     * 	1 username 
     * 	3 phone DONE (get ID from Phone)
     * @return a matching CONSUMER account not null
     * YOU need to cast it to Freelancer or Employer
     */
public Object getAccount(String searchKey, int mode) {


	// swtich accourding to mode

	
	///////////////////////
	    return null;
	///////////////////////
    } // end getAccount()


// @TahaMagdy: helper Function (getAccount)
private Freelancer getFreelancerAccountBy_id( int id ){

	// Setting session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();


	Freelancer freelancerDB = new Freelancer();


	try {
	// getting Freelancer Account By ID
	 freelancerDB = (Freelancer) session.get(Freelancer.class,id);

	System.out.println("getAccount >> " + freelancerDB.getBalance());
	System.out.println("getAccount >> " + freelancerDB.getProfile().getAverageHourCost());
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}


        return freelancerDB;
    } // end getBalancgetFreelancerAccountBy_id()


// @TahaMagdy: helper Function (getAccount)
private Employer getEmployerAccountBy_id ( int id ){


	// Setting session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	Employer emp = new Employer();

	try{
	// getting Freelancer Account By ID
	emp = (Employer) session.get(Employer.class, id);

	System.out.println("getAccount >> " + emp.getFirstName());
	System.out.println("getAccount >> " + emp.getProfile().getDescription());
	}
	catch (Exception e ){
		session.getTransaction().rollback();
	}
	finally{
	session.close();
	}


	
	return emp;


} // end getEmployerAccountBy_id()




// @TahaMagdy: helper Function (getAccount)
// Return -1 if phone number is not existing
// otherwise returns id of the phone
private int get_ID_FromPhone ( String phone ){

	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();
	
	try {
	// Fetching complaint id = 2
	Query selectWherePhone_q = session.createQuery("from Account where phone =?");
	selectWherePhone_q.setString(0, phone);


	List list = selectWherePhone_q.list();

	System.out.println(list.size());
	Account acc = (Account) list.get(0);

	System.out.println("id of phone " + acc.getId());

	return acc.getId();
	
	}
	catch (Exception e){
		session.getTransaction().rollback();
	}

	finally {
	session.close();
	}



	// phone does not exist
	return -1;
} // end get_ID_FromPhone()





// @TahaMagdy: helper Function (getAccount)
// Return -1 if phone number is not existing
// otherwise returns id of the username
private int get_ID_FromUsername ( String username ){
	

	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();
	
	try {
	// Fetching complaint id = 2
	Query selectWherePhone_q = session.createQuery("from Account where username =?");
	selectWherePhone_q.setString(0, username);


	List list = selectWherePhone_q.list();

	System.out.println(list.size());
	Account acc = (Account) list.get(0);

	System.out.println("id of username " + acc.getId());

	return acc.getId();
	}
	catch (Exception e){
		session.getTransaction().rollback();
	}

	finally {
	session.close();
	}



	return -1;
} // end get_ID_FromUsername()











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