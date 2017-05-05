package freelaning;

import java.util.ArrayList;
import java.util.Set;
import system.Statistics;


// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

/**
 * 
 */
public class AdminAccount extends Account {

    /**
     * Default constructor
     */
    public AdminAccount() {
    }

    /**
     * @return
     */
    public ArrayList<Complaint> showUnseenComplaint() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Complaint> showSeenComplaint() {
        // TODO implement here
        return null;
    }

    /**
     * @param complaint
     */
    public void replyComplaint(Complaint complaint) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Statistics showStatistics() {
        // TODO implement here
        return null;
    }

    /**
     * @param accountID
     */
    public void banConsumer(int accountID) {
        // TODO implement here
    }

    /**
     * @param accountID
     */
    public void unbanConsumer(int accountID) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Set<String> getLog() {
        // TODO implement here
        return null;
    }


}