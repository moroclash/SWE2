// #Done @moroclash
package freelaning;

import java.time.LocalDateTime;
import org.hibernate.Session;

/**
 *
 */
public class Account implements SystemAccess {

/**
 * Default constructor
 */
public Account() {
}

public Account( int _id ) {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	try {
		// Fetching complaint
		Account newaccount = (Account) session.get(Account.class,_id);
		System.out.println("constructor2; account id: " +newaccount.getId() + " is fetched");

		// Filling the current object
		this.accountState = newaccount.getAccountState();
		this.firstName = newaccount.getFirstName();
		this.lastName = newaccount.lastName;
		this.id = _id;
		this.password = newaccount.getPassword();
		this.phone = newaccount.getPhone();
		this.userName = newaccount.getUserName();




	} 
	catch (Exception e) {
		System.out.println(">>>> " + e);
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}

} // end second account

/**
 *
 */
private String firstName;

/**
 *
 */
private String lastName;

/**
 *
 */
private String phone;

/**
 *
 */
private int id;

/**
 *
 */
private String password;

/**
 *
 */
private String userName;

/**
 *
 */
private int accountState;

/**
 *
 */
private LocalDateTime date;


// This is used to Update an existing complaint
// A complaint that is instantiated with the second constructor
public void update() {

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	
	try {
		// Fetching complaint
		Account updatedAccount = (Account) session.get(Account.class,this.id);
//		System.out.println("Complaint " +complaintDB.getId() + " is fetched");

		// Updating Complaint Object
		// Taking all the attr of the updated obj
		updatedAccount.setAccountState(this.accountState);
		updatedAccount.setDate(LocalDateTime.MAX);
		updatedAccount.setFirstName(this.firstName);
		updatedAccount.setLastName(this.lastName);
		updatedAccount.setPassword(this.password);
		updatedAccount.setPhone(this.phone);
		updatedAccount.setUserName(this.userName);


		// Updatting the database
		session.update(updatedAccount);
		session.getTransaction().commit();
		
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}
} // end update



public  void saveNewComplaint() {

	// Setting a Sessio
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	
	try {
		// Making a new Account
		Account newaccount = new Account();

		// Taking the data into the new account
		// Issues;
		// 2* Need to hash the password
		// 3* Account State -> Umar I need you to update the database.
		newaccount.setAccountState(this.accountState);
		newaccount.setDate(LocalDateTime.MAX);
		newaccount.setFirstName(this.firstName);
		newaccount.setLastName(this.lastName);
		newaccount.setPassword(this.password);
		newaccount.setPhone(this.phone);
		newaccount.setUserName(this.userName);

		


		// Updatting the database
		session.save(newaccount);
		session.getTransaction().commit();
		
	} 
	catch (Exception e) {
		session.getTransaction().rollback();
	} 
	finally {
		session.close();
	}
} // end saveNewObject()
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAccountState() {
		return accountState;
	}

	
	public int  isAccountState() {
		return accountState;
	}

	public void setAccountState(int accountState) {
		this.accountState = accountState;
	}

	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * @return
	 */
	public boolean block() {
		this.accountState = 1;
		return true;
	}

	/**
	 * @return
	 */
	public boolean unblock() {

		this.accountState = 0;
		return true;
	}

	/**
	 * @return
	 */
	public boolean remove() {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean logout() {
		// TODO implement here
		return true;
	}

	/**
	 *
	 */
	public void updateProfile() {
		// TODO implement here
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
} // end Account
