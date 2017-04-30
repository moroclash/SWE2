//#Done @moroclash
package freelaning;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 */
public class Notification {

	/**
	 * Default constructor
	 */
	public Notification() {
	}

	/**
	 *
	 */
	public Account from;

	/**
	 *
	 */
	public Account to;

	/**
	 *
	 */
	public LocalDateTime date;

	/**
	 *
	 */
	public String message;

	/**
	 *
	 */
	public boolean state;

	public Account getFrom() {
		return from;
	}

	public void setFrom(Account from) {
		this.from = from;
	}

	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
