package freelaning;
// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

import java.time.LocalDateTime;
import java.util.ArrayList;




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

	public boolean setMessage(String message) {
		this.message = message;
	return false;
	}

	public int getSeenState() {
		return seenState;
	}

	public boolean setSeenState(int seenState) {
		this.seenState = seenState;
	return false;
	}

	public Account getOwner() {
		return owner;
	}

	public boolean setOwner(Account owner) {
		this.owner = owner;
	return false;
	}

	public ArrayList<Complaint> getReplies() {
		return replies;
	}

	public boolean setReplies(ArrayList<Complaint> replies) {
		this.replies = replies;
	return false;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public boolean setDate(LocalDateTime date) {
		this.date = date;
	return false;
	}

	public ConsumerAccount getMake() {
		return make;
	}

	public boolean setMake(ConsumerAccount make) {
		this.make = make;
	return false;
	}

	public Complaint getReply() {
		return reply;
	}

	public boolean setReply(Complaint reply) {
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
    public boolean seen() {
        // TODO implement here
	return false;
    }

    /**
     * 
     */
    public boolean unseen() {
        // TODO implement here
	return false;
    }

    /**
     * 
     */
    public boolean isSeen() {
        // TODO implement here


	return false;
    }

}