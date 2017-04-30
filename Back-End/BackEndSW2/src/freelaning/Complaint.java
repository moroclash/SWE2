package freelaning;
// @TahaMagdy: DONE


import java.util.*;

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
	}

	public int getSeenState() {
		return seenState;
	}

	public Boolean setSeenState(int seenState) {
		this.seenState = seenState;
	}

	public Account getOwner() {
		return owner;
	}

	public Boolean setOwner(Account owner) {
		this.owner = owner;
	}

	public ArrayList<Complaint> getReplies() {
		return replies;
	}

	public Boolean setReplies(ArrayList<Complaint> replies) {
		this.replies = replies;
	}

	public Date getDate() {
		return date;
	}

	public Boolean setDate(Date date) {
		this.date = date;
	}

	public ConsumerAccount getMake() {
		return make;
	}

	public Boolean setMake(ConsumerAccount make) {
		this.make = make;
	}

	public Complaint getReply() {
		return reply;
	}

	public Boolean setReply(Complaint reply) {
		this.reply = reply;
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
    private Date date;

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