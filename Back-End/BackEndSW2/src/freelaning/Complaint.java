package freelaning;
// @TahaMagdy: DONE
// @Note: Any Boolean function returns false 
//        (Change it if you're implementing it)

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;




/**
 * 
 */
public class Complaint {

    /**
     * Default constructor
     */
    public Complaint() {
    }

    /**
     * 
     */
    private String message;

    /**
     * 
     */
    private int seenState;

	public String getMessage() {
		return message;
	}

	public Boolean setMessage(String message) {
		this.message = message;
	return false;
	}

	public int getSeenState() {
		return seenState;
	}

	public Boolean setSeenState(int seenState) {
		this.seenState = seenState;
	return false;
	}

	public Account getOwner() {
		return owner;
	}

	public Boolean setOwner(Account owner) {
		this.owner = owner;
	return false;
	}

	public ArrayList<Complaint> getReplies() {
		return replies;
	}

	public Boolean setReplies(ArrayList<Complaint> replies) {
		this.replies = replies;
	return false;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public Boolean setDate(LocalDateTime date) {
		this.date = date;
	return false;
	}

	public ConsumerAccount getMake() {
		return make;
	}

	public Boolean setMake(ConsumerAccount make) {
		this.make = make;
	return false;
	}

	public Complaint getReply() {
		return reply;
	}

	public Boolean setReply(Complaint reply) {
		this.reply = reply;
	return false;
	}

    /**
     * 
     */
    private Account owner;

    /**
     * 
     */
    private ArrayList<Complaint> replies;

    /**
     * 
     */
    private LocalDateTime date;

    /**
     * 
     */
    public ConsumerAccount make;










    /**
     * 
     */
    public Complaint reply;




    /**
     * 
     */
    public Boolean seen() {
        // TODO implement here
	return false;
    }

    /**
     * 
     */
    public Boolean unseen() {
        // TODO implement here
	return false;
    }

    /**
     * 
     */
    public Boolean isSeen() {
        // TODO implement here


	return false;
    }

}