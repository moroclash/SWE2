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
public class ConsumerAccount extends Account {

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
    public ArrayList<Offer> getHistory() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Complaint> getComplaints() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void Abstract register() {
        // TODO implement here
    }

}