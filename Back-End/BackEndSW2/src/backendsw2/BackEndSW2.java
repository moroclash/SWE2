/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendsw2;

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
import java.util.HashSet;
import java.util.List;
import org.hibernate.Session;

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

	
	
	
	public static void omar() {
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();

		se.close();
	}
	
	public static void taha() {

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