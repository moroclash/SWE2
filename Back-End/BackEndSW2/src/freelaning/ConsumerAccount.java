// Done @moroclash
package freelaning;

import freelaning.Complaint;
import freelaning.Account;
import freelaning.Notification;
import freelaning.Complaint;
import java.util.Set;
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

	/**
	 * @return
	 */
	public boolean addNotification(Notification notify) {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean SendNotify(Notification notify, ConsumerAccount account) {
		// TODO implement here
		return true;
	}

	
}
