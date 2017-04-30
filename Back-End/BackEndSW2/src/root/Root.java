
import java.util.*;

/**
 * 
 */
public class Root extends Account implements systemAccess, Logs {

    /**
     * Default constructor
     */
    public Root() {
    }

    /**
     * 
     */
    private String password;


    /**
     * @param admin
     */
    public void createAdmin(Admin admin) {
        // TODO implement here
    }

    /**
     * @param constraints
     */
    public void specifyPenalties(Constraints constraints) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<AdminAccount> getBlockedAdims() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public bool logout() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void updateProfile() {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Log> getLog() {
        // TODO implement here
        return null;
    }

}