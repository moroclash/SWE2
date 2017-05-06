package system;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)
// Singletone Pattern
/**
 *
 */
public class Statistics {

	/**
	 *
	 */
	private double totalMoney;

	/**
	 *
	 */
	private double ourMoney;

	/**
	 *
	 */
	private int numberOfEmployers;

	/**
	 *
	 */
	private int numberOfFreelancers;

	/**
	 *
	 */
	private int numberOfAllTasks;

	/**
	 *
	 */
	private int numberOfAcceptedTasks;

	/**
	 *
	 */
	private int numberOfRejectedTasks;

	/**
	 *
	 */
	private int numberOfComplaints;

	/**
	 *
	 */
	private int numberOfAdmins;

	/**
	 *
	 */
	private int numberOfBlockedPeople;

	/**
	 *
	 */
	private static Statistics statistics;

	private int id;

	/**
	 *
	 */
	private void Statistics() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	// أحا يا ياسر، أكتب أول حرف صغير مش كبير
	public static Statistics getInstance() {
		// TODO implement here
		return null;
	}

	/**
	 * this function is update current class from DB
	 * يعني تسيف للكلاس دة في الداتا بيز يا ياسر عشان لو حصل تغيير فية نستخدم الفانكشن دي
	 */
	public void updateStatistics() {

	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public double getOurMoney() {
		return ourMoney;
	}

	public void setOurMoney(double ourMoney) {
		this.ourMoney = ourMoney;
	}

	public int getNumberOfEmployers() {
		return numberOfEmployers;
	}

	public void setNumberOfEmployers(int numberOfEmployers) {
		this.numberOfEmployers = numberOfEmployers;
	}

	public int getNumberOfFreelancers() {
		return numberOfFreelancers;
	}

	public void setNumberOfFreelancers(int numberOfFreelancers) {
		this.numberOfFreelancers = numberOfFreelancers;
	}

	public int getNumberOfAllTasks() {
		return numberOfAllTasks;
	}

	public void setNumberOfAllTasks(int numberOfAllTasks) {
		this.numberOfAllTasks = numberOfAllTasks;
	}

	public int getNumberOfAcceptedTasks() {
		return numberOfAcceptedTasks;
	}

	public void setNumberOfAcceptedTasks(int numberOfAcceptedTasks) {
		this.numberOfAcceptedTasks = numberOfAcceptedTasks;
	}

	public int getNumberOfRejectedTasks() {
		return numberOfRejectedTasks;
	}

	public void setNumberOfRejectedTasks(int numberOfRejectedTasks) {
		this.numberOfRejectedTasks = numberOfRejectedTasks;
	}

	public int getNumberOfComplaints() {
		return numberOfComplaints;
	}

	public void setNumberOfComplaints(int numberOfComplaints) {
		this.numberOfComplaints = numberOfComplaints;
	}

	public int getNumberOfAdmins() {
		return numberOfAdmins;
	}

	public void setNumberOfAdmins(int numberOfAdmins) {
		this.numberOfAdmins = numberOfAdmins;
	}

	public int getNumberOfBlockedPeople() {
		return numberOfBlockedPeople;
	}

	public void setNumberOfBlockedPeople(int numberOfBlockedPeople) {
		this.numberOfBlockedPeople = numberOfBlockedPeople;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
