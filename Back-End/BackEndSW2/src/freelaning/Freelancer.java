// Done @moroclash
package freelaning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projection;
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

		private List lis;
		private java.util.ListIterator iterator;

		public BeIterator(List lis) {
			this.lis = lis;
			this.iterator = lis.listIterator();
		}

		public void setLis(List lis) {
			this.lis = lis;
		}

		@Override
		public Object next() {
			return this.iterator.next();
		}

		@Override
		public Object previous() {
			return this.iterator.previous();
		}

		@Override
		public boolean hasNext() {
			return this.iterator.hasNext();
		}

		@Override
		public int getSize() {
			return this.lis.size();
		}

		@Override
		public Object getIndx(int index) {
			return this.lis.get(index);
		}

		@Override
		public List getAll() {
			return this.lis;
		}

		@Override
		public List Clone() {
			return new ArrayList<>(this.lis);
		}

		@Override
		public boolean removeIndex(int Index) {
			try {
				this.lis.remove(Index);
				return true;
			} catch (Exception e) {
				return false;
			}
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
	 * not Tested
	 *
	 * @moroclash
	 *
	 * Helper Function
	 *
	 * @param mood : this collection that have all state that you want
	 * you can set any State you want from 0-9
	 * @return BeIterator class that implement system.Iterator interface
	 */
	private BeIterator getOffersWithMood(Set<Integer> mood) {
		BeIterator BeIte = new BeIterator(new ArrayList<>());;
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
			Criteria cri = se.createCriteria(Offer.class);
			Criterion samID = Restrictions.eq("owner", this.getId());
			Criterion OFmood = Restrictions.in("state", mood);
			LogicalExpression lox = Restrictions.and(samID, OFmood);
			cri.add(lox);
			List<Offer> OffList = cri.list();
			BeIte.setLis(OffList);

		} catch (Exception exp) {
			se.getTransaction().rollback();
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return BeIte;
		}
	}

	/**
	 * not tested
	 * @moroclash
	 * 
	 * @return Iterator interface that will have all Accepted Offers
	 */
	public system.Iterator getAcceptedOffersIterator() {
		HashSet<Integer> moods = new HashSet<>();
		moods.add(3);
		moods.add(6);
		moods.add(7);
		moods.add(8);
		moods.add(9);
		return getOffersWithMood(moods);
	}

	/**
	 * Not Tested
	 *
	 * @moroclash
	 *
	 * @param skill : this is Skill that will added if Skill found in DB it
	 * will create relationship between them if not it will add it in DB and
	 * create RelationShip
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
			} catch (Exception exp) {
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
	 * return List of all Taskes
	 */
	public Iterator listTasks() {
		BeIterator BeIte = new BeIterator(new ArrayList<>());;
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
			Criteria cri = se.createCriteria(Offer.class);
			cri.add(Restrictions.eq("owner", this.getId()));
			List<Task> liTask = new ArrayList<>();
			List<Offer> OffList = cri.list();
			OffList.forEach(e -> {
				liTask.add(e.getTask());
			});
			BeIte.setLis(liTask);
		} catch (Exception exp) {
			se.getTransaction().rollback();
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return BeIte;
		}
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
