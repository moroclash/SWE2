package root;

import freelaning.AdminAccount;
import java.util.ArrayList;
import system.Constraints;
import system.Log;
import system.Logs;
import freelaning.SystemAccess;
import java.util.Set;
// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

/**
 * 
 */
public class Root implements SystemAccess, Logs {

    /**
     * Default constructor
     */
    public Root() {
    }

    /**
     * 
     */
    private String password;
    private int id;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




    /**
     * @param admin
     */
    public void createAdmin(AdminAccount admin) {
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
    public boolean logout() {
        // TODO implement here
        return false;
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
    public Set<Log> getLog() {
        // TODO implement here
        return null;
    }

}