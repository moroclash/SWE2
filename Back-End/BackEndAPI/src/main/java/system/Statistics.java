package system;

// @TahaMagdy: DONE

import org.hibernate.Session;

// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)
// Singletone Pattern
/**
 *
 */
public class Statistics implements GetStatistics {

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
        if (statistics == null) {
            statistics = new Statistics();
        }
        return statistics;
    }

    /**
     * this function is update current class from DB يعني تسيف للكلاس دة في
     * الداتا بيز يا ياسر عشان لو حصل تغيير فية نستخدم الفانكشن دي
     */
    public void updateStatistics() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        try {
            se.getTransaction().begin();
            se.update(this);
            se.getTransaction().commit();
        } // End of try
        catch (Exception e) {

            se.getTransaction().rollback();
        } // End of catch
        finally {
            se.close();
        } // End of finally     
    } // End of Function 


    @Override
    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public double getOurMoney() {
        return ourMoney;
    }

    public void setOurMoney(double ourMoney) {
        this.ourMoney = ourMoney;
    }

    @Override
    public int getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(int numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    @Override
    public int getNumberOfFreelancers() {
        return numberOfFreelancers;
    }

    public void setNumberOfFreelancers(int numberOfFreelancers) {
        this.numberOfFreelancers = numberOfFreelancers;
    }

    @Override
    public int getNumberOfAllTasks() {
        return numberOfAllTasks;
    }

    public void setNumberOfAllTasks(int numberOfAllTasks) {
        this.numberOfAllTasks = numberOfAllTasks;
    }

    @Override
    public int getNumberOfAcceptedTasks() {
        return numberOfAcceptedTasks;
    }

    public void setNumberOfAcceptedTasks(int numberOfAcceptedTasks) {
        this.numberOfAcceptedTasks = numberOfAcceptedTasks;
    }

    @Override
    public int getNumberOfRejectedTasks() {
        return numberOfRejectedTasks;
    }

    public void setNumberOfRejectedTasks(int numberOfRejectedTasks) {
        this.numberOfRejectedTasks = numberOfRejectedTasks;
    }

    @Override
    public int getNumberOfComplaints() {
        return numberOfComplaints;
    }

    public void setNumberOfComplaints(int numberOfComplaints) {
        this.numberOfComplaints = numberOfComplaints;
    }

    @Override
    public int getNumberOfAdmins() {
        return numberOfAdmins;
    }

    public void setNumberOfAdmins(int numberOfAdmins) {
        this.numberOfAdmins = numberOfAdmins;
    }

    @Override
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
