package freelaning;
import java.time.LocalDateTime;

// @TahaMagdy: DONE

/**
 * 
 */
public class Feedback {

    /**
     * Default constructor
     */
    public Feedback() {
    }

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Offer offer;

    /**
     * 
     */
    private int rateValue;

    /**
     * 
     */
    private LocalDateTime date;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public int getRateValue() {
		return rateValue;
	}

	public void setRateValue(int rateValue) {
		this.rateValue = rateValue;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}


}