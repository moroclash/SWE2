package freelaning;
// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

import java.time.LocalDateTime;
import java.util.Set;

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
	private int id;

	/**
	 *
	 */
	private String message;

	/**
	 *
	 */
	private int seenState;

	/**
	 *
	 */
	private Set<Complaint> replies;

	/**
	 *
	 */
	private LocalDateTime date;

	/**
	 *
	 */
	public ConsumerAccount owner;


	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSeenState() {
		return seenState;
	}

	public void setSeenState(int seenState) {
		this.seenState = seenState;
	}

	public ConsumerAccount getOwner() {
		return owner;
	}

	public void setOwner(ConsumerAccount owner) {
		this.owner = owner;
	}

	public Set<Complaint> getReplies() {
		return replies;
	}

	public void setReplies(Set<Complaint> replies) {
		this.replies = replies;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	
	

	

}
