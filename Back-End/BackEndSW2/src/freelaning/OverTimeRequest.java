package freelaning;

// @TahaMagdy: DONE

import java.time.LocalDateTime;


/**
 * 
 */
public class OverTimeRequest {

    /**
     * Default constructor
     */
    public OverTimeRequest() {
    }

    /**
     * 
     */
    private int hoursNeeded;

	public int getHoursNeeded() {
		return hoursNeeded;
	}

	public void setHoursNeeded(int hoursNeeded) {
		this.hoursNeeded = hoursNeeded;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

    /**
     * 
     */
    private Offer offer;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private int state;

    /**
     * 
     */
    private LocalDateTime date;



}