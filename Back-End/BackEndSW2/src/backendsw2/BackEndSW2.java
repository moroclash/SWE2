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
import freelaning.OverTimeRequest;
import freelaning.Profile;
import freelaning.Rate;
import freelaning.Skill;
import freelaning.Task;
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Query;

import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;


import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import system.Constraints;
import system.Iterator;
import system.OurSystem;
import system.StateTaskFilter;
import system.Statistics;
import system.TechnologyFilterForTask;
import system.Validation;

/**
 *
 * @author moroclash
 */
public class BackEndSW2 {


	
		

/**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
		omar();

	} // end main

	
	public static  void boda()
        {
          Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		Employer emp = new Employer();
                emp.setId(2);
               System.out.println( emp.showAllFreelancers().toString());
//               Task task = new Task();
//               task.setEmployer(emp);
//               task.setCategory("zdxf");
//               emp.createTask(task);
//               
                 Offer offer =  (Offer) se.get(Offer.class, 2);
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
	
	//admin id : 6   freelancer : 7   task : 1    Employer : 8 rate 70 task:3 offer:4
	public static void omar() {
		Task t1 = new Task();
		Task t2 = new Task();
		Task t3 = new Task();
		
		t1.setTask("t1");
		t2.setTask("t2");
		t3.setTask("t3");
		
		t1.setState(0);
		t2.setState(0);
		t3.setState(2);
		
		system.StateTaskFilter t = new StateTaskFilter(0);
		
		
		ArrayList<Task> ts = new ArrayList<>();
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		
		Iterator it = t.GetFilter(ts);
		
		while(it.hasNext())
		{
			Task l= (Task) it.next();
			System.out.println(l.getTask());
			
		}
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

} // end class