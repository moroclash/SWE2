/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendsw2;

import freelaning.AccNotification;
import freelaning.Account;
import freelaning.AdminAccount;
import freelaning.Complaint;
import freelaning.Counter;
import freelaning.Employer;
import freelaning.EmployerProfile;
import freelaning.Experience;
import freelaning.Feedback;
import freelaning.Freelancer;
import freelaning.FreelancerProfile;
import freelaning.Offer;
import freelaning.Profile;
import freelaning.Rate;
import freelaning.Skill;
import freelaning.Task;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Query;

import java.util.Set;
import org.hibernate.SQLQuery;

import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import root.Root;
import system.Constraints;
import system.OurSystem;
import system.Statistics;

/**
 *
 * @author moroclash
 */
public class BackEndSW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    } // end main

    public static void boda() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        Employer emp = new Employer();
        emp.setId(2);
        System.out.println(emp.showAllFreelancers().toString());
//               Task task = new Task();
//               task.setEmployer(emp);
//               task.setCategory("zdxf");
//               emp.createTask(task);
//               
        Offer offer = (Offer) se.get(Offer.class, 2);
        //  emp.acceptFinishedTask(offer);
        //System.out.println(offer.getId());
        // emp.rejectFinishedTask(offer);
        Feedback f = new Feedback();
        f.setDate(LocalDateTime.MAX);
        f.setDescription("this is the test ");
        f.setOffer(offer);
        f.setRateValue(3);
        //emp.makeFeedback(f ,offer);
        // emp.rejectOffer(offer);
        //emp.acceptFinishedTask(offer);
    }

    public static void omar() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        se.getTransaction().begin();
        Skill s = new Skill();
        s.setName("lolo");
        se.save(s);
        System.out.println(s.getId());
        se.getTransaction().commit();
        se.close();
    }

    public static void taha() {


        /*
	OurSystem sys = OurSystem.getInstance();
	Freelancer free =  (Freelancer) sys.getAccount("asd", 0);
	System.out.println("main >> " + free.getBalance());
	System.out.println("main >> " + free.getProfile().getAverageHourCost());
         */
 /* @TahaMagdy: for insert 
	EmployerProfile empPro = new EmployerProfile();
	empPro.setId(3);
	empPro.setNumberOfTasks(3);
	empPro.setPicture("FUCK pic");
	empPro.setTotalMoney(80000.12);


	Employer emp = new Employer();
	emp.setUserName("tahamagdy");
	emp.setFirstName("Taha");
	emp.setLastName("Magdy");
	emp.setDate(LocalDateTime.MAX);
	emp.setPassword("taha");
	emp.setBirthDate("26/02/1996");
	emp.setCountry("FUCKING Egypt");
	emp.setVisaNumber("VISA: 222");
	emp.setPhone("01148462144");
	emp.setProfile( empPro);

	// Setting a Session
	Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
	session.getTransaction().begin();

	



		// Updating Complaint
		session.save(emp);
		session.getTransaction().commit();
		
		session.close();
         */
 /*
		 * @TahaMagdy: Complaint Class testting...
		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		// Fetching complaint id = 2
		Complaint complaintDB = (Complaint) session.get(Complaint.class,2);
		System.out.println("complaintDB Testring: OK ->" + complaintDB.getMessage() );
		if ( !complaintDB.isSeen() ) {
			System.out.println("It is not seen" );
		}
		session.close();
         */

 /* @TahaMagdy: getTask testing
 		OurSystem sys = OurSystem.getInstance();
 		Task task = sys.getTask(1);
 		System.out.print( "main,, Fetched category >> " +task.getCategory() );
         */
 /* @TahaMagdy: getOffer testing
 		OurSystem sys = OurSystem.getInstance();
 		Offer offer = sys.getOffer(2);
 		System.out.println("offer description " + offer.getDescription());
         */
 /*
		 * @TahaMagdy: testing AccountFactory
		 * http 200 -> DONE
		AccountFactory facto = new AccountFactory();
		Freelancer free = (Freelancer) facto.getAccount("Freelancer");
		free.setBalance(1234);
		System.out.println(free.getBalance());
         */
 /*
		 * @TahaMagdy: Adding a dummy Account for testing
		// Making a dummy account
		Account dummyAccount = new Account();
		dummyAccount.setId(12);
		
		// Preparing a DB session
		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		// Inserting dummyAccount into DB
		session.save(dummyAccount);
		session.getTransaction().commit();
		session.close();
         */
    } // end taha()
    
    
    /**
     TEST Yaser METHODS  3aaaaaaaaaaaaaaaaaaaaa
     **/
/*
    public static void yaser() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        se.getTransaction().begin();
        Root s = new Root();
        s.setId(1);
        s.setPassword("kod");
        AdminAccount admin = new AdminAccount();
        admin.setAccountState(0);
        admin.setDate(LocalDateTime.MAX);
        admin.setFirstName("yaser");
        admin.setId(1);
        admin.setLastName("shaban");
        admin.setPassword("123456");
        admin.setPhone("01143891426");
        admin.setUserName("yasoo");

        s.createAdmin(admin);
        ArrayList<AdminAccount> results;

        results = s.getBlockedAdims();
        for (AdminAccount b : results) {
            System.out.println(b.getUserName());
        }

        Constraints c = new Constraints();
        c.setOurProfit(2);
        c.setEm_cancelRunningTaskBudgetPenalty(4);
        c.setEm_cancelRunningTaskPenalty(5);
        c.setEm_rejectFinishedTaskBudgetPenalty(3);
        c.setEm_rejectFinishedTaskPenalty(6);
        c.setFr_overtimePenalty(8);
        c.setFr_cancelingTaskPenalty(44);
        c.setFr_timeoutPenalty(11);
        c.setId(1);
        s.specifyPenalties(c);
        s.logout();
        s.setPassword("0000");
        System.out.println("" + s.getId());
        System.out.println("" + s.getPassword());
        s.updateProfile();
        List<Object[]> re;

        re = s.getLog();
        for (Object[] row : re) {

            System.out.println("" + row[0] + row[1]);
        }
        Statistics stat =  system.Statistics.getInstance();
        stat.setId(1);
        stat.setNumberOfAcceptedTasks(20);
        stat.setNumberOfAdmins(30);
        stat.setNumberOfAllTasks(40);
        stat.setNumberOfBlockedPeople(50);
        stat.setNumberOfComplaints(60);
        stat.setNumberOfComplaints(70);
        stat.updateStatistics();
        
        se.close();

    }
 */
} // end class
