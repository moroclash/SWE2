package system;

import java.time.LocalDateTime;


// @TahaMagdy: DONE


/**
 * 
 */
public class Log {

    /**
     * Default constructor
     */
    public Log() {
    }

    /**
     * 
     */
    public LocalDateTime date;

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

    /**
     * 
     */
    public int accountID;

    /**
     * 
     */
    public String action;

}