// Done @moroclash
package freelaning;

import freelaning.Complaint;
import freelaning.Account;
import java.util.ArrayList;
import freelaning.Notification;
import freelaning.Complaint;
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
	private ArrayList<Notification> notifications;

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

	public ArrayList<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(ArrayList<Notification> notifications) {
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
	public Iterator getOfferHistoryIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public Iterator getComplainsIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	abstract boolean register();

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
