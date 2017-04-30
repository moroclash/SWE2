package freelaning;
// @TahaMagdy
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)



/**
 * 
 */
public class Profile {

    /**
     * Default constructor
     */
    public Profile() {
    }

    /**
     * 
     */
    // Umar: Path
    private String picture;

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Rate getRate() {
		return rate;
	}

	public void setRate(Rate rate) {
		this.rate = rate;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getNumberOfTasks() {
		return numberOfTasks;
	}

	public void setNumberOfTasks(int numberOfTasks) {
		this.numberOfTasks = numberOfTasks;
	}

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Rate rate;

    /**
     * 
     */
    private double totalMoney;

    /**
     * 
     */
    private int numberOfTasks;


    /**
     * @param picture
     */
    public void uploadPicture(String picture) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean editProfile() {
        // TODO implement here
        return false;
    }

}