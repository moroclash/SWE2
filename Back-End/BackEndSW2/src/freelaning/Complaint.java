package freelaning;
// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

import java.time.LocalDateTime;
import java.util.Set;
import org.hibernate.Session;
import system.Log;
import system.LogManager;

/**
 *
 */
public class Complaint {

	/**
	 * Default constructor
	 */
	public Complaint() {
	}

	/**
	 *
	 */
	private int id;

	/**
	 *
	 */
	private String message;

	/**
	 *
	 */
	private int seenState;

	/**
	 *
	 */
	private Set<Complaint> replies;

	/**
	 *
	 */
	private LocalDateTime date;

	/**
	 *
	 */
	public ConsumerAccount owner;


	
	/**
	 *
	 */
public boolean seen() {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	
	try {
		// Fetching complaint
		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
		System.out.println("Complaint " +complaintDB.getId() + " is fetched");

		// Updating seen State
		complaintDB.seenState = 0;

		// Updating Complaint
		session.update(complaintDB);
		session.getTransaction().commit();
		
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}

	// Adding the log
	LogManager.Log("Complaint " + this.id + " is seen");

	///////////////
	return true;
	///////////////
} // end seen()

	/**
	 *
	 */
public boolean unseen() {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	
	try {
		// Fetching complaint
		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
		System.out.println("Complaint " +complaintDB.getId() + " is fetched");

		// Updating seen State
		complaintDB.seenState = 1;

		// Updating Complaint
		session.update(complaintDB);
		session.getTransaction().commit();
		
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}



	///////////////
	return true;
	///////////////
	}





	/**
	 * @return: returns true if complaint is seen, otherwise false
	 */
public boolean isSeen() {


	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	
	int flag = -1;

	try {
		// Fetching complaint
		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
		System.out.println("Complaint " +complaintDB.getId() + " is fetched");
		
		flag = complaintDB.seenState;		
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}
		// checking...
		


	
	return flag == 0;
} // end is seen





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSeenState() {
		return seenState;
	}

	public void setSeenState(int seenState) {
		this.seenState = seenState;
	}

	public ConsumerAccount getOwner() {
		return owner;
	}

	public void setOwner(ConsumerAccount owner) {
		this.owner = owner;
	}

	public Set<Complaint> getReplies() {
		return replies;
	}

	public void setReplies(Set<Complaint> replies) {
		this.replies = replies;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	
	

	

}
