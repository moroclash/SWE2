package system;

import freelaning.Complaint;
import freelaning.ConsumerAccount;
import freelaning.Freelancer;
import freelaning.AccNotification;
import freelaning.Account;
import freelaning.AdminAccount;
import freelaning.Employer;
import freelaning.Offer;
import freelaning.Skill;
import freelaning.Task;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)il.*;
// Singletone Pattern
/**
 *
 */
public class OurSystem {

	/**
	 * Singleton
	 */
	private OurSystem() {
	}

	/**
	 *
	 */
	static private OurSystem sysInstance = new OurSystem();

	/**
	 * @return
	 */
	public static OurSystem getInstance() {

		return sysInstance;
	}

	/**
	 *
	 */
	private Constraints constraints;

	/**
	 *
	 */
	private ArrayList<Complaint> unseenComplaints;

	/**
	 *
	 */
	private Statistics statistics;

	/**
	 * @maintainer TahaMagdy
	 * @param id
	 * @return
	 */
	public Task getTask(int id) {
		System.out.println("getTask is fired from OurSystem");

		// Setting session
		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();

		Task taskDB = new Task();

		try {
			// Fetching Task
			taskDB = (Task) session.get(Task.class, id);
			System.out.println("This is TaskID -> " + taskDB.getId());
			System.out.println("This is TaskCaegory -> " + taskDB.getCategory());
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		return taskDB;
	} // end getTask()

	/**
	 * @param id
	 * @return
	 */
	public Offer getOffer(int id) {
		System.out.println("getOffer is fired from OurSystem");

		// Setting session
		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();

		Offer offerDB = new Offer();

		try {
			// Fetching TasOfferk
			offerDB = (Offer) session.get(Offer.class, id);
			System.out.println("This is offerID-> " + offerDB.getId());
			System.out.println("This is offerDescription -> " + offerDB.getDescription());
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		return offerDB;
	} // end getOffer

	/**
	 * @maintainer TahaMagdy
	 * @param mode: determines how do you want to search. 0 id DONE 1
	 * username DONE (get ID from username) 2 phone DONE (get ID from Phone)
	 * @return a matching CONSUMER account not null YOU need to cast it to
	 * Freelancer or Employer
	 *
	 *
	 * @reminder Need some validation
	 */
	public Object getAccount(String searchKey, int mode) {

		// swtich accourding to mode
		switch (mode) {
			case 0:
				int id = Integer.parseInt(searchKey);
				return getFreelancerAccountBy_id(id);
			case 1:
				return get_ID_FromUsername(searchKey);
			case 2:
				return get_ID_FromPhone(searchKey);
			default:
				break;
		} // end switch

		///////////////////////
		// not found
		return null;
		///////////////////////
	} // end getAccount()

// @TahaMagdy: helper Function (getAccount)
	private Freelancer getFreelancerAccountBy_id(int id) {

		// Setting session
		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();

		Freelancer freelancerDB = new Freelancer();

		try {
			// getting Freelancer Account By ID
			freelancerDB = (Freelancer) session.get(Freelancer.class, id);

			System.out.println("getAccount >> " + freelancerDB.getBalance());
			System.out.println("getAccount >> " + freelancerDB.getProfile().getAverageHourCost());
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		if (freelancerDB == null) {
			return null;
		}

		return freelancerDB;
	} // end getBalancgetFreelancerAccountBy_id()

// @TahaMagdy: helper Function (getAccount)
	private Employer getEmployerAccountBy_id(int id) {

		// Setting session
		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();

		Employer emp = new Employer();

		try {
			// getting Freelancer Account By ID
			emp = (Employer) session.get(Employer.class, id);

			System.out.println("getAccount >> " + emp.getFirstName());
			System.out.println("getAccount >> " + emp.getProfile().getDescription());
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		return emp;

	} // end getEmployerAccountBy_id()

// @TahaMagdy: helper Function (getAccount)
// Return -1 if phone number is not existing
// otherwise returns id of the phone
	private int get_ID_FromPhone(String phone) {

		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();

		try {
			// Fetching complaint id = 2
			Query selectWherePhone_q = session.createQuery("from Account where phone =?");
			selectWherePhone_q.setString(0, phone);

			List list = selectWherePhone_q.list();

			System.out.println(list.size());
			Account acc = (Account) list.get(0);

			System.out.println("id of phone " + acc.getId());

			return acc.getId();

		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		// phone does not exist
		return -1;
	} // end get_ID_FromPhone()

// Reminder; @TahaMagdy
// I need to merge the two helpers into one
// @TahaMagdy: helper Function (getAccount)
// Return -1 if phone number is not existing
// otherwise returns id of the username
	private int get_ID_FromUsername(String username) {

		Session session = databaseManager.SessionsManager.getSessionFactory().openSession();
		session.getTransaction().begin();

		try {
			// Fetching complaint id = 2
			Query selectWherePhone_q = session.createQuery("from Account where username =?");
			selectWherePhone_q.setString(0, username);

			List list = selectWherePhone_q.list();

			System.out.println(list.size());
			Account acc = (Account) list.get(0);

			System.out.println("id of username " + acc.getId());

			return acc.getId();
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		return -1;
	} // end get_ID_FromUsername()

	/**
	 * @param notification
	 * @return
	 */
	public boolean notifyAll(AccNotification notification) {
		// TODO implement here
		boolean end = true;
		ArrayList<ConsumerAccount> users = new ArrayList<>();
		Session se;
		try {
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			se = databaseManager.SessionsManager.getSessionFactory().openSession();

		}
		try {
			users = (ArrayList<ConsumerAccount>) se.createCriteria(ConsumerAccount.class).list();
		} catch (Exception e) {
			end = false;
			System.err.println(e);
		}

		for (ConsumerAccount ac : users) {
			notification.setToAccount_id(ac);
		}

		return end;
	}

	/**
	 * @param freelancer
	 * @return
	 */
	public ArrayList<Task> taskFeed(Freelancer freelancer) {
		// TODO implement here
		return null;
	}

	/**
	 * @param technologies
	 * @return
	 */
	public ArrayList<Task> taskFilter(ArrayList<String> technologies) {
		// TODO implement here
		return null;
	}

	/**
	 * @param category
	 * @return
	 */
	public ArrayList<Task> taskFilter(String category) {
		// TODO implement here

		return null;
	}

	/**
	 * @param skill
	 *
	 * @return
	 */
	public boolean addTechnology(Skill skill) {
		Session se;
		boolean flag = false, end = true;
		try {
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flag = true;
		}
		try {
			se.getTransaction().begin();

			se.save(skill);

			se.getTransaction().commit();
		} catch (Exception e) {
			se.getTransaction().rollback();
		} finally {
			if (flag) {
				se.close();
			}
		}

		return end;
	}// end of add technologe 

	/**
	 * @param skill
	 * @return
	 */
	public boolean updateTechnology(Skill skill) {
		Session se;
		boolean flag = false, end = true;
		try {
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flag = true;
		}
		try {

			se.getTransaction().begin();

			if (flag) {
				se.update(skill);
			} else {
				se.merge(skill);
			}

			se.getTransaction().commit();
		} catch (Exception e) {
			se.getTransaction().rollback();
		} finally {
			if (flag) {
				se.close();
			}
		}

		return end;
	}// end of update tech

	/**
	 * @param skill
	 * @return
	 */
	public boolean deleteTechnology(Skill skill) {

		Session se;
		boolean flag = false, end = true;
		try {
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flag = true;
		}
		try {
			se.getTransaction().begin();

			se.delete(skill);

			se.getTransaction().commit();
		} catch (Exception e) {
			se.getTransaction().rollback();
		} finally {
			if (flag) {
				se.close();
			}
		}

		return end;

	}// end of delete tech

	/**
	 * @return
	 */
	public ArrayList<Complaint> getSeenComplaints() {
		return this.getComplaints(0);

	}

	public ArrayList<Complaint> getUneenComplaints() {
		return this.getComplaints(1);

	}

	public ArrayList<Complaint> getComplaints(int state) {

		ArrayList<Complaint> complaints = new ArrayList<>();
		Session se;
		boolean flag = false;
		try {
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flag = true;
		}
		try {
			se.getTransaction().begin();

			Criteria cr = se.createCriteria(Complaint.class);
			cr.add(Restrictions.eq("seenState", state));
			complaints = (ArrayList<Complaint>) cr.list();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (flag) {
				se.close();
			}
		}
		return complaints;
	}

	
	 /**
     * @param userName 
     * @param passwd 
     * @return
     * return object "account object " 
     */
    public Object getAccess(String userName, String passwd) {
        
        Session se ;  boolean flag = false;
        Account object = new Account();
        try{
            se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
        }
        catch(Exception e )
        {
          se = databaseManager.SessionsManager.getSessionFactory().openSession();
          flag = true ; 
        }
        try{
           se.getTransaction().begin();
            
            
           // add  criteria to select user
          Criteria cr =  se.createCriteria(Account.class);
          Criterion name = Restrictions.eq("userName", userName);
          Criterion pass = Restrictions.eq("password", passwd);
          LogicalExpression andr = Restrictions.and(name , pass);
          cr.add(andr);
          object =  (Account) cr.list().get(0);

	  Freelancer free  = (Freelancer) se.get(Freelancer.class, object.getId());
	if ( free != null ){
		System.out.println("أي حاجة");	
		return free;
	}
	  
         	  Employer emp  = (Employer) se.get(Employer.class, object.getId());
	if ( emp != null ){
		System.out.println("أي حاجة");	
		return emp;
	}
	  
          
          	  AdminAccount ad  = (AdminAccount) se.get(AdminAccount.class, object.getId());
	if ( ad != null ){
		System.out.println("أي حاجة");	
		return ad;
	}


	  
          
           
          
            
        }
        catch(Exception e ){
            
        } finally{
            if(flag)
                se.close();
        }
        return null;
    }

}
