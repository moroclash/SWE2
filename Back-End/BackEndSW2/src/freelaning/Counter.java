package freelaning;

import java.time.LocalDateTime;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)
/**
 *
 */
public class Counter {

	/**
	 * Default constructor
	 */
	public Counter() {
	}

	/**
	 *
	 */
	private LocalDateTime deadline;
	private int id;
	private Offer offer;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Offer getOffer() {
		return offer;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	/**
	 * @return
	 */
	public boolean alarm() {
		// TODO implement here
		return false;
	}

	/**
	 *
	 */
	public void start() {
		// TODO implement here
	}

	/**
	 *
	 */
	public void stop() {
		// TODO implement here
	}

	/**
	 *
	 */
	public void pause() {
		// TODO implement here
	}

	public void increase(int numberOfHours) {
		// TODO implement here
	}

}
