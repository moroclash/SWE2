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
	private Double price;

	private int id;
       
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
     * @param offer
     * @param emp
	 * @return
	 */
       
	public boolean pay(Offer offer , Employer emp  ) {
	 price = (double) offer.getHourCost()*offer.getNumberOfHours();
         
         // add money to freelancer
         offer.getOwner().setBalance(offer.getOwner().getBalance()+price);
         
         // add money to System
         // اضيفها فيييين 
         

          
         return true ;
         
	}

}
