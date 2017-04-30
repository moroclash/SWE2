package freelaning;
import java.time.LocalDateTime;




// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)


/**
 * 
 */
public class Invoice {

    /**
     * Default constructor
     */
    public Invoice() {
    }

    /**
     * 
     */
    private Offer offer;

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

    /**
     * 
     */
    private int state;

    /**
     * 
     */
    private LocalDateTime date;

    /**
     * 
     */
    public Double price;

    /**
     * @return
     */
    public boolean pay() {
        // TODO implement here
        return false;
    }

}