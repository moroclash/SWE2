/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendsw2;

import freelaning.Account;
import freelaning.AdminAccount;
import freelaning.Counter;
import freelaning.Employer;
import freelaning.EmployerProfile;
import freelaning.Experience;
import freelaning.Feedback;
import freelaning.Freelancer;
import freelaning.FreelancerProfile;
import freelaning.Offer;
import freelaning.Rate;
import freelaning.Skill;
import freelaning.Task;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import system.Constraints;
import system.LogManager;

/**
 *
 * @author moroclash
 */
public class BackEndSW2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		// Here is some testing blocks
		// Please, Comment Any testing block of yours


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




		
		/*
		@Umar
		Session s;
		try {
			System.out.println("1");
			 s = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
			 System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
			 s = databaseManager.SessionsManager.getSessionFactory().openSession();
			 System.out.println("4");
		}
		
		System.out.println("sssss");
		s.close();
		*/
		
	}

	
	
	
	
	
	
	
	public static void select()
	{
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		Experience e1 = (Experience) se.get(Experience.class,1);
		System.out.println(e1.getId());
		System.out.println(e1.getLink());
		System.out.println(e1.getPicture());
		System.out.println(e1.getSummary());
		e1.getTechnologies().clear();
		se.update(e1);
		se.getTransaction().commit();
		se.close();
	}
	

	public static void init() {
				Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		
		
		Skill s1 = new Skill("C++");
		Skill s2 = new Skill("java");
		Skill s3 = new Skill("Rouy");
		Skill s4 = new Skill("C");

		
		Experience e1 = new Experience();
		e1.setLink("www.google.com");
		e1.setPicture("llllllllllllllllllllllllllllllll");
		e1.setSummary("lllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
		HashSet<Skill> Hs1 = new HashSet<>();
		Hs1.add(s1);
		Hs1.add(s2);
		Hs1.add(s3);
		e1.setTechnologies(Hs1);
		
		Experience e2 = new Experience();
		e2.setLink("www.yahoo.com");
		e2.setPicture("yaaahooooooooooooooooooo");
		e2.setSummary("yahhhhhhhhhhhhhhhhhhhhhhhhhhhhoooooooooooooooooooo");
		HashSet<Skill> Hs2 = new HashSet<>();		
		Hs2.add(s1);
		Hs2.add(s4);
		e2.setTechnologies(Hs2);
		
		
		
		AdminAccount adAcc = new AdminAccount();
		adAcc.setBlockState(false);
		adAcc.setDate(LocalDateTime.now());
		adAcc.setFirstName("moroclash");
		adAcc.setLastName("mohamed");
		adAcc.setPassword("moroclash132");
		adAcc.setPhone("01123111546");
		adAcc.setUserName("moroclash");
		
		se.save(adAcc);
		
		
		
		Freelancer fAcc = new Freelancer();
		fAcc.setBalance(2014.12);
		fAcc.setBirthDate("12-13-2014");
		fAcc.setBlockState(false);
		fAcc.setCountry("cairo");
		fAcc.setDate(LocalDateTime.now());
		Set ss = new HashSet();
		ss.add(e1);
		ss.add(e2);
		fAcc.setExperience(ss);
		fAcc.setFirstName("moroclash");
		fAcc.setLastName("clash");
		/************************/
		fAcc.setNotifications(new HashSet<>());
		/***********************/
		fAcc.setPassword("moroclash");
		fAcc.setPhone("010112311154");
		/*******************************/
		FreelancerProfile fPro = new FreelancerProfile();
		fPro.setAverageHourCost(12);
		fPro.setDescription("lsadklaskdlaskdjgffjlajlsafjl jldjsald");
		fPro.setNumberOfTasks(12);
		fPro.setPicture("/dasd/dasdas/ewq/rtere");
		/***********************/
		Rate rate = new Rate();
		rate.setTheRate(145);
		fPro.setRate(rate);
		/**************************/
		Feedback f1 = new Feedback();
		f1.setDate(LocalDateTime.now());
		f1.setDescription("dasdm nmdhjsahd hjsdhkasd hkjdsa");
		f1.setRateValue(12);
		Task task = new Task();
		task.setCategory("loca");
		task.setDate(LocalDateTime.now());
		Employer empAcc = new Employer();
		empAcc.setBirthDate("12454512");
		empAcc.setBlockState(true);
		empAcc.setCountry("cairo");
		empAcc.setDate(LocalDateTime.now());
		empAcc.setFirstName("Emp1");
		empAcc.setLastName("loolooo");
		empAcc.setNotifications(new HashSet<>());
		empAcc.setPassword("lalalallalal");
		empAcc.setPhone("0121245121");
		freelaning.EmployerProfile empPro = new EmployerProfile();
		empPro.setDescription("dasd kdjsalk kljdsjal jlkjdlaskjd");
		empPro.setNumberOfTasks(12);
		empPro.setPicture("dasdsadasd ");
		Rate rate2 = new Rate();
		rate2.setTheRate(0);
		empPro.setRate(rate2);
		empPro.setTotalMoney(124.1245);
		empAcc.setProfile(empPro);
		empAcc.setUserName("alallalslsalsa");
		empAcc.setVisaNumber("1241215412154");
		se.save(empAcc);
		task.setEmployer(empAcc);
		task.setState(1);
		task.setOffers(new HashSet<>());
		task.setTask("dasdasd");
		task.setTechnologies(new HashSet<>());
		task.setTimeTaken(22);
		se.save(task);
		ss = new HashSet();
		fPro.setReviews(ss);
		/****************************/
		fPro.setTotalMoney(15454.124);
		fAcc.setProfile(fPro);
		/*********************************/
		ss=new HashSet();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		fAcc.setSkills(ss);
		/*******************************/
		fAcc.setUserName("mloroclash");
		fAcc.setVisaNumber("124545451212145");
		se.save(fAcc);
		
		
//
		se.getTransaction().commit();
		se.close();
	}
	
	public static void insert() {
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		
		
//		Counter c1 = new Counter();
//		c1.setDeadline(LocalDateTime.now());
//		
//		Offer of = new Offer();
//		of.setCounter(c1);
//		of.setDate(LocalDateTime.now());
//		of.setDescription("dasdasd mdkaslkdklaskdl;ksald;kas;ldk;");
//		of.setHourCost(12);
//		of.setNumberOfHours(12);
//		of.setOwner((Freelancer) se.get(Freelancer.class, 3));
//		of.setState(1);
//		of.setTask((Task) se.get(Task.class, 1));
//		of.setTimeNeeded(12);
//		
//
//		se.save(of);
//		Task t1 = (Task) se.get(Task.class, 1);
//		System.out.println(t1.getCategory());
//		for(Skill e : t1.getTechnologies())
//			System.out.print(e.getName()+"   ");
//		
//		for(Offer of : t1.getOffers())
//			System.out.print(of.getId() + "   ");
//

//		Feedback fee = new Feedback();
//		fee.setDate(LocalDateTime.now());
//		fee.setDescription("dasdkj kjkl jl jl kjalskdjl jl ");
//		fee.setOffer((Offer) se.get(Offer.class, 1));
//		fee.setRateValue(12);
//		se.save(fee);


		



		se.getTransaction().commit();
		se.close();
	}

}
