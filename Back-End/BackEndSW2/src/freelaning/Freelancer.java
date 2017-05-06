// Done @moroclash
package freelaning;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import system.Iterator;

/**
 *
 */
public class Freelancer extends ConsumerAccount {

	/**
	 * Default constructor
	 */
	public Freelancer() {
	}

	/**
	 *
	 */
	private Set<Skill> skills;

	/**
	 *
	 */
	private Set<Experience> experience;

	/**
	 *
	 */
	private double balance;

	/**
	 *
	 */
	private FreelancerProfile profile;

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

	public Set<Experience> getExperience() {
		return experience;
	}

	public void setExperience(Set<Experience> experience) {
		this.experience = experience;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public FreelancerProfile getProfile() {
		return profile;
	}

	public void setProfile(FreelancerProfile profile) {
		this.profile = profile;
	}

	/**
	 *
	 * private iterator class
	 */
	private class BeIterator implements Iterator {

		@Override
		public Object next() {
			return null;
		}

		@Override
		public Object previous() {
			return null;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public int getSize() {
			return 1;
		}

		@Override
		public Object getIndx(int index) {
			return null;
		}

		@Override
		public List getAll() {
			return null;
		}

		@Override
		public List Clone() {
			return null;
		}

		@Override
		public boolean removeIndex(int Index) {
			return true;
		}
	}

	/**
	 * @param task
	 * @param offer
	 */
	public boolean applyTask(Task task, Offer offer) {
		// TODO implement here
		return true;
	}

	/**
	 * @param task
	 */
	public boolean apologizeForTask(Task task) {
		// TODO implement here
		return true;
	}

	/**
	 * @param task
	 */
	public boolean cancelOffer(Task task) {
		// TODO implement here
		return true;
	}

	/**
	 * @param offer
	 * @param hoursNeeded
	 */
	public boolean requestOverTime(Offer offer, int hoursNeeded) {
		// TODO implement here
		return true;
	}

	/**
	 * @param offer
	 * @param rateValue
	 */
	public boolean rateEmployer(Offer offer, int rateValue) {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public BeIterator getWaitingOffersIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public BeIterator getCompletedTasksIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public BeIterator getAcceptedTasksIterator() {
		// TODO implement here
		return null;
	}

	/**
	 * Not Tested
	 * @moroclash
	 * 
	 * @param skill : this is Skill that will added
	 *		  if Skill found in DB it will create relationship between them 
	 *		  if not it will add it in DB and create RelationShip
	 * 
	 * @return True if Skill Added Sucssesfully Or False if Not  
	 */
	public boolean addSkill(String skill) {
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false, end = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			//this is the skill object that will added
			Skill MySkill;
			//criteria to get skill object from DB
			Criteria cri = se.createCriteria(Skill.class);
			List<Skill> ListSk = cri.add(Restrictions.eq("name", skill)).list();
			//check if List empty to check if Skill is found or not
			if (ListSk.size() == 0) {
				//if empty it will save new object in DB
				MySkill = new Skill();
				MySkill.setName(skill);
				se.save(MySkill);
			} else {
				//if exist in DB will retrive it
				MySkill = ListSk.get(0);
			}
			//add SKill in Skill Set
			try {
				//add skill in set if Set Assiend
				this.skills.add(MySkill);
			} catch(Exception exp) {
				//if List don't assiend to object it will declear new HashSet to set
				this.skills = new HashSet<>();
				this.skills.add(MySkill);
			}
			//add new relation ship between new SKill and this FreeLancer Account
			SQLQuery sql = se.createSQLQuery("INSERT INTO Freelancer_skills (account_id,Skill_id) VALUES (?,?)");
			sql.setInteger(0, this.getId());
			sql.setInteger(1, MySkill.getId());
			//execute Queary 
			sql.executeUpdate();
			//commit saving
			se.getTransaction().commit();
			end = true;
		} catch (Exception exp) {
			se.getTransaction().rollback();
			end = false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return end;
		}
	}

	/**
	 * not tested
	 *
	 * @moroclash
	 *
	 * @param skill : this skill that will deleted
	 * @return true if skill deleted or False if not Deleted
	 */
	public boolean deleteSkill(String skill) {
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false, end = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			this.skills.remove(skill);
			Criteria cri = se.createCriteria(Skill.class);
			Skill sk = (Skill) cri.add(Restrictions.eq("name", skill)).list().get(0);
			SQLQuery sql = se.createSQLQuery("DELETE FROM Freelancer_skills WHERE account_id=? AND Skill_id=?");
			sql.setInteger(0, this.getId());
			sql.setInteger(1, sk.getId());
			sql.executeUpdate();
			end = true;
		} catch (Exception exp) {
			se.getTransaction().rollback();
			end = false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return end;
		}
	}

	/**
	 * ??????????????? ask
	 */
	public void listTasks() {
		// TODO implement here
	}

	/**
	 * not tested
	 *
	 * @moroclash
	 *
	 * this save object in DB
	 * @return : True if Object saved in DB , false if exist exiption
	 */
	@Override
	public boolean register() {
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			se.save(this);
			se.getTransaction().commit();
		} catch (Exception exp) {
			se.getTransaction().rollback();
			se.close();
			return false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return true;
		}
	}

}
