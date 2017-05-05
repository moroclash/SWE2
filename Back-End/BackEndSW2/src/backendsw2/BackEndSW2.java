/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendsw2;

import freelaning.AdminAccount;
import freelaning.Complaint;
import freelaning.Employer;
import freelaning.EmployerProfile;
import freelaning.Experience;
import freelaning.Feedback;
import freelaning.Freelancer;
import freelaning.FreelancerProfile;
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
		omar();
	} // end main

	
	
	
	public static void omar() {
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		
		Employer em = (Employer) se.get(Employer.class, 1);
		Complaint com = new Complaint();
		com.setDate(LocalDateTime.now());
		com.setMessage("daskdjlaskjdlask");
		com.setOwner(em);
		HashSet<Complaint> has = new HashSet<>();
		has.add((Complaint) se.get(Complaint.class, 1));
		com.setReplies(has);
		com.setSeenState(2);
		se.save(com);
		se.getTransaction().commit();
		se.close();
	}
	
	public static void taha() {

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
