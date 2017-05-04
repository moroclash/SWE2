// Done @moroclash
package freelaning;

import freelaning.Complaint;
import freelaning.Account;
import freelaning.Notification;
import freelaning.Complaint;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import system.Iterator;

/**
 *
 */
public abstract class ConsumerAccount extends Account {

	/**
	 * Default constructor
	 */
	public ConsumerAccount() {
	}

	/**
	 *
	 */
	private String birthDate;

	/**
	 *
	 */
	private String country;

	/**
	 *
	 */
	private String visaNumber;

	/**
	 *
	 */
	private Set<Notification> notifications;
	
	
	
	/**
	 * 
	 * private iterator class
	 */
	
	private class BeIterator implements Iterator
	{

		@Override
		public Object next() {
			return null;
		}

		@Override
		public Object previous() {
			return null;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public int getSize() {
			return 1;
		}

		@Override
		public Object getIndx(int index) {
			return null;
		}

		@Override
		public Set getAll() {
			return null;
		}

		@Override
		public Set Clone() {
			return null;
		}

		@Override
		public boolean removeIndex(int Index) {
			return true;
		}
	}
	

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVisaNumber() {
		return visaNumber;
	}

	public void setVisaNumber(String visaNumber) {
		this.visaNumber = visaNumber;
	}

	public Set<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

	/**
	 * @param complaint
	 */
	public boolean makeComplaint(Complaint complaint) {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public BeIterator getOfferHistoryIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public BeIterator getComplainsIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public abstract boolean register();

	

	public boolean addNotification(Notification notify) {
		//this try to check if Notification list is assigend to object or not
		try{
		    //list is assigend
		    this.notifications.add(notify);
		}catch(Exception ex)
		{
		    //assign List to object 	
		    this.notifications = new HashSet<>();
		    //add notification in the notificationBox
		    this.notifications.add(notify);
		    
		    //update data in DB
		    Session se ;
		    //to check if get current session or open new session 
		    // use to check if close session or not
		    boolean flage =false;
		    try{
			    //if exist session 
			    se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		    }catch(Exception exp)
		    {
			    // if not exist session
			    se = databaseManager.SessionsManager.getSessionFactory().openSession();
			    flage = true;
		    }   
		    se.getTransaction().begin();
		    try{
			     se.update(this);
			     se.getTransaction().commit();
		    }catch(Exception exp){
			    se.getTransaction().rollback();
			    return false;
		    }finally{
			    //check if he open a new session to close it 
			    if(flage)
				    //close the new session
				    se.close();
		    }
		}
		return true;
	}

	
	/**
	 * not tested
	 * @moroclash
	 * 
	 * @param notify : this is a notification that will added in NotificationBox of ConsumerAccount.
	 * @param account : this is aConsumer account that will receive notification.  
	 * @return : boolean true if notification added or false if note.
	 */
	public boolean SendNotify(Notification notify, ConsumerAccount account) {
		try{
			account.addNotification(notify);
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
}
