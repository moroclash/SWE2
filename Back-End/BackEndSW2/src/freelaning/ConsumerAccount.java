// Done @moroclash
package freelaning;

import freelaning.Complaint;
import freelaning.Account;
import freelaning.AccNotification;
import freelaning.Complaint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

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
	private Set<AccNotification> notifications;

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

	public Set<AccNotification> getNotifications() {
		return notifications;
	}

	public void setNotifications(Set<AccNotification> notifications) {
		this.notifications = notifications;
	}

	/**
	 * not tested
	 *
	 * @moroclash
	 *
	 * @param complaint : this is a complain that will Send
	 * @return : True if Complain send "saved in DB" or False if not Send
	 * "exist Error"
	 */
	public boolean makeComplaint(Complaint complaint) {
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			se.save(complaint);
		} catch (Exception exp) {
			se.getTransaction().rollback();
			se.close();
			return false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return true;
		}
	}

	/**
	 *
	 * private class that use to implement iterator to can display
	 * Collection
	 */
	private class BeIterator implements system.Iterator {

		private List lis;
		private java.util.ListIterator iterator;

		public BeIterator(List lis) {
			this.lis = lis;
			this.iterator = lis.listIterator();
		}

		@Override
		public Object next() {
			return this.iterator.next();
		}

		@Override
		public Object previous() {
			return this.iterator.previous();
		}

		@Override
		public boolean hasNext() {
			return this.iterator.hasNext();
		}

		@Override
		public int getSize() {
			return this.lis.size();
		}

		@Override
		public Object getIndx(int index) {
			return this.lis.get(index);
		}

		@Override
		public List getAll() {
			return this.lis;
		}

		@Override
		public List Clone() {
			return new ArrayList<>(this.lis);
		}

		@Override
		public boolean removeIndex(int Index) {
			try {
				this.lis.remove(Index);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}

	/**
	 * not tested
	 *
	 * @moroclash
	 *
	 * @return BeIterator object that have list of All Offer that fetched
	 * from DB
	 * @return BeIterator object that have Empty List of Offers if exist
	 * exiption
	 */
	public system.Iterator getOfferHistoryIterator() {
		BeIterator iter = new BeIterator(new ArrayList<Offer>());
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			// cariteria to Complain Class 
			Criteria cri = se.createCriteria(Offer.class);
			//make max results is 50
			cri.setMaxResults(50);
			//get All Offer that applied by this emploier
			List OfferList = cri.add(Restrictions.eq("owner", this)).list();
			iter = new BeIterator(OfferList);

		} catch (Exception exp) {
			se.getTransaction().rollback();
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return iter;
		}
	}

	/**
	 * not tested
	 *
	 * @moroclash
	 *
	 * @return : BeItrrator object that have complain List that fetched from
	 * DB
	 * @return : BeItrrator object that have empty list if exist exiptions
	 */
	public system.Iterator getComplainsIterator() {
		BeIterator Biter = new BeIterator(new ArrayList<Complaint>());
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			// cariteria to Complain Class 
			Criteria cri = se.createCriteria(Complaint.class);
			//filter to get Complain that have stat == 2 that have replaied
			Criterion statCri = Restrictions.eq("seenState", 2);
			//filter to get Complain owned by Account
			Criterion senderCri = Restrictions.eq("owner", this);
			//add Logical expretion and
			LogicalExpression loEXP = Restrictions.and(statCri, senderCri);
			List ComplainList = cri.add(loEXP).list();
			Biter = new BeIterator(ComplainList);

		} catch (Exception exp) {
			se.getTransaction().rollback();
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return Biter;
		}
	}

	/**
	 * @return
	 */
	public abstract boolean register();

	/**
	 * Done tested
	 *
	 * @moroclash
	 *
	 * @param notify : this is a notification that will added in
	 * notificationBox
	 * @return : true if notification added or false if not
	 *
	 * @post : this function will update this object in database
	 */
	public boolean addNotification(AccNotification notify) {
		//this try to check if Notification list is assigend to object or not
		try {
			//list is assigend
			this.notifications.add(notify);
		} catch (Exception ex) {
			//assign List to object 	
			this.notifications = new HashSet<>();
			//add notification in the notificationBox
			this.notifications.add(notify);
		}
		//update data in DB
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false, end = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			System.err.println(exp.fillInStackTrace());
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		try {
			//start transaction
			se.getTransaction().begin();
			se.save(notify);
			se.getTransaction().commit();
			end = true;

		} catch (Exception exp) {
			se.getTransaction().rollback();
			end = false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return end;
		}
	}

	/**
	 * not tested
	 *
	 * @moroclash
	 *
	 * @param notify : this is a notification that will added in
	 * NotificationBox of ConsumerAccount.
	 * @param account : this is aConsumer account that will receive
	 * notification.
	 * @return : boolean true if notification added or false if note.
	 */
	public boolean SendNotify(AccNotification notify, ConsumerAccount account) {
		try {
			return account.addNotification(notify);
		} catch (Exception ex) {
			return false;
		}
	}
}
