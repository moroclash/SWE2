package freelaning;
// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

import java.time.LocalDateTime;
import java.util.Set;
import org.hibernate.Session;
import system.LogManager;

/**
 *
 */
public class Complaint {

// This Constructor is for a new Complaints
// a new id is generated
public Complaint() {
	}


// This to fetch a specific complaint.
// ** TO edit or view
// This will fill the object.
public Complaint( int _id) {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	try {
		// Fetching complaint
		Complaint complaintDB = (Complaint) session.get(Complaint.class,_id);
		System.out.println("constructor2; Complaint id: " +complaintDB.getId() + " is fetched");

		// Fillint the current object
		this.message   = complaintDB.message;
		this.owner     = complaintDB.owner;
		this.replies   = complaintDB.replies;
		this.seenState = complaintDB.seenState;
		this.id	       = _id;

	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}
} // Complaint(int id)

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
	 * I've found that we don't need to interact with DB in here
	 * Because this is filled by DB operation firstly.
	 */
public boolean seen() {

	// Setting a Session
//	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
//	session.getTransaction().begin();

	
//	try {
		// Fetching complaint
//		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
//		System.out.println("Complaint " +complaintDB.getId() + " is fetched");

		// Updating seen State
//		complaintDB.seenState = 0;

		// Updating Complaint
//		session.update(complaintDB);
//		session.getTransaction().commit();
		
//	} 
//	catch (Exception e) {
//		session.getTransaction().rollback();
//	} 
//	finally {
//		session.close();
//	}


	this.seenState = 0;
	// Adding the log
//	LogManager.Log("Complaint " + this.id + " is seen");

	///////////////
	return true;
	///////////////
} // end seen()

	/**
	 * I've found that we don't need to interact with DB in here
	 * Because this is filled by DB operation firstly.
	 */
public boolean unseen() {

	// Setting a Session
//	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
//	session.getTransaction().begin();

	
//	try {
		// Fetching complaint
//		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
//		System.out.println("Complaint " +complaintDB.getId() + " is fetched");

		// Updating seen State
//		complaintDB.seenState = 1;

		// Updating Complaint
//		session.update(complaintDB);
//		session.getTransaction().commit();
		
//	} 
//	catch (Exception e) {
//		session.getTransaction().rollback();
//	} 
//	finally {
//		session.close();
//	}
	
	this.seenState = 1;



	///////////////
	return true;
	///////////////
	}





	/**
	 * @return: returns true if complaint is seen, otherwise false
	 * I've found that we don't need to interact with DB in here
	 * Because this is filled by DB operation firstly.
	 */
public boolean isSeen() {


	// Setting a Session
//	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
//	session.getTransaction().begin();

	
//	int flag = -1;

//	try {
		// Fetching complaint
//		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
//		System.out.println("Complaint " +complaintDB.getId() + " is fetched");
		
//		flag = complaintDB.seenState;		
//	} 
//	catch (Exception e) {
//		session.getTransaction().rollback();
//	} 
//	finally {
//		session.close();
//	}
		// checking...
		


	
//	return flag == 0;
return this.seenState == 0;
} // end is seen


// This is used to Update an existing complaint
// A complaint that is instantiated with the second constructor
public void update() {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	System.out.println("com_id is :"     + this.id);
	System.out.println("newMessage is :" + this.message);
	
	try {
		// Fetching complaint
		Complaint complaintDB = (Complaint) session.get(Complaint.class,this.id);
//		System.out.println("Complaint " +complaintDB.getId() + " is fetched");

		// Updating Complaint Object
		// issues;
		// * should I update the id?!
		// * Update the owner
		// * Update the replies
		complaintDB.setMessage(this.message);
		complaintDB.setDate(LocalDateTime.MAX);
		complaintDB.setSeenState(this.seenState);
		complaintDB.setReplies(this.replies);
		complaintDB.setOwner(this.owner);


		// Updatting the database
		session.update(complaintDB);
		session.getTransaction().commit();
		
	} 
	catch (Exception e) {
		System.out.println(">>>> " + e);
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}
} // end update


// You should pass the owener !!
public  void saveNewComplaint() {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	
	try {
		Complaint complaintDB = new Complaint();

		complaintDB.setMessage(this.message);
		complaintDB.setDate(LocalDateTime.MAX);
		complaintDB.setSeenState(this.seenState);
		complaintDB.setReplies(this.replies);
		complaintDB.setOwner(this.owner);


		// Updatting the database
		session.save(complaintDB);
		session.getTransaction().commit();
		
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}
} // end saveNewObject()




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
