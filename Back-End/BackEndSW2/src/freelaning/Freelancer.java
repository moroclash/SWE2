// Done @moroclash
package freelaning;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
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
import system.LogManager;
import system.Statistics;

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

		public void setCollection(Collection set) {
			if(set instanceof List)
			{
				this.lis = (List) set;
			}
			else
				this.lis = new ArrayList(set);
			this.iterator = lis.listIterator();
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
		
		public void test()
		{
			while(hasNext())
			{
				Task t = (Task) next();
				System.out.println(t.getId());
			}
			
			
			for(Object t : this.lis)
			{
				Task tt = (Task) t;
				System.err.println(tt.getId());
			}
				
		}
	}

	
	/**
	 * not tested
	 * @moroclash
	 * 
	 * @param task : this task that will receive Offer
	 * @param offer : this Offer that will applied
	 * 
	 * @return True if Offer Applied , False if Not
	 */
	public boolean applyTask(Task task, Offer offer) {
		task.addOffer(offer);
		boolean end = task.uploadTask();
		return end;
	}

	

	/**
	 * not tested 
	 * @moroclash
	 * 
	 * this function cancel offer and change states and apply penalties
	 * 
	 * @param offer  : this is a offer that will be canceled
	 * @return True if Offer Canceled or False if not
	 */
	public boolean cancelOffer(Offer offer) {
		//to update his state
		Task task = offer.getTask();
		//Employeer to retrive his mony
		Employer emp = task.getEmployer();
		//check state of Offer to apply penelty
		switch(offer.getState())
		{
			//if Offer applied but not accepted
			case 0:
				//set offer state that offer canceled 
				offer.setState(2);
				break;
			//if offer applied and accepted 
			// apply applay penelty on freelancer
			// retrive mony to Emploier
			case 3:
				//get Rate Of employeer to apply penelty
		                Rate FreeLancerRate = offer.getOwner().getProfile().getRate();
				//apply penelty
				FreeLancerRate.setTheRate(FreeLancerRate.getTheRate()-system.Constraints.GetInstance().getFr_cancelingTaskPenalty());

				//change Task state to cancel during work
				task.setState(4);
				//notification that will send to Freelancer
				AccNotification notifi = new AccNotification();
				notifi.setDate(LocalDateTime.now());
				notifi.setFromAccount_id(offer.getOwner());
				notifi.setState(false);
				notifi.setToAccount_id(emp);
				notifi.setMassage("Bad News you are Canceled Offer "+offer.getId()+ " and we applied penalty on your Rate , thanx");
				//notify FreeLancer
				offer.getOwner().addNotification(notifi);
			
				//mony that will recive
				int budget = offer.getNumberOfHours()*offer.getTimeNeeded();
			
				//cut budet from TotalMony
				Statistics stat =  system.Statistics.getInstance();
				stat.setTotalMoney(stat.getTotalMoney()-budget);
				stat.updateStatistics();
				
				//notification that will send to Employeer
				notifi = new AccNotification();
				notifi.setDate(LocalDateTime.now());
				notifi.setFromAccount_id(offer.getOwner());
				notifi.setState(false);
				notifi.setToAccount_id(emp);
				notifi.setMassage("Bad News Offer "+offer.getId()+ " is Canceled by Freelancer \""+offer.getOwner().getUserName()+"\" and system applied penalty and your are retrive your mony :"+budget+" $ ,we are very sorry for your time");
				emp.addNotification(notifi);
				
				//set offer state that offer canceled by freelancer after accepted 
				offer.setState(4);
				break;
		}
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
			se.update(offer);
			se.update(offer.getOwner().getProfile().getRate());
			se.update(offer.getTask());
			se.getTransaction().commit();
			end=true;
			LogManager.Log(offer.getOwner().getId() +" freelancer cancel offer : " + offer.getId());
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
	 * not Tested
	 *
	 * @moroclash
	 *
	 * @param offer : this is a offer that will be requested
	 * @param request : your OverTimeReqest
	 *
	 * @return True if requested or False if not
	 */
	public boolean requestOverTime(Offer offer, OverTimeRequest request) {
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
			//set state of OverTimed
			offer.setState(6);
			Rate FreelancerRate = offer.getOwner().getProfile().getRate();
			system.Constraints constrains = system.Constraints.GetInstance();
			FreelancerRate.setTheRate(FreelancerRate.getTheRate()- constrains.getFr_overtimePenalty());
			se.update(offer);
			se.save(request);
			se.getTransaction().commit();
			end = true;
			//notification that will send to Freelancer
			AccNotification notifi = new AccNotification();
			notifi.setDate(LocalDateTime.now());
			notifi.setFromAccount_id((ConsumerAccount) se.get(AdminAccount.class, 1));
			notifi.setState(false);
			notifi.setToAccount_id(offer.getOwner());
			notifi.setMassage("Bad News make OverTimeRequist on Offer "+offer.getId()+ " and we applied penalty on your Rate -"+constrains.getFr_overtimePenalty()+"%, thanx");
			//add notification in notificationBox
			offer.getOwner().addNotification(notifi);
			LogManager.Log(offer.getOwner().getId() +" freelancer apply OverTimeRequist to offer : " + offer.getId());
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
	 * not Tested
	 *
	 * @moroclash
	 *
	 * @param offer : this offer that have task that have Employer that he
	 * will rated
	 * @param rateValue : this is the rate you want
	 *
	 * @return : True if Employer Rated or False if not "exist exception"
	 */
	public boolean rateEmployer(Offer offer, int rateValue) {
		Rate rate = offer.getTask().getEmployer().getProfile().getRate();
		int value = rate.getTheRate();
		if (value == 0) {
			rate.setTheRate(rateValue);
		} else if (value == 100 && rateValue >= 100) {
			rate.setTheRate(value);
		} else if (rateValue == 50) {
			rate.setTheRate(value);
		} else if (rateValue < 50) {
			rate.setTheRate(value - ((100 - rateValue) / 10));
		} else {
			rate.setTheRate(value + (rateValue / 10));
		}

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
			se.update(rate);
			se.getTransaction().commit();
			end = true;
			LogManager.Log(this.getId() + " Rate Emplyeer " + offer.getTask().getEmployer().getId());
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
	 * @moroclash
	 * 
	 * @return : all waiting Offers
	 */
	public Iterator getWaitingOffersIterator() {
		HashSet<Integer> moods = new HashSet<>();
		moods.add(0);
		moods.add(1);
		moods.add(2);
		return getOffersWithMood(moods);
	}

	/**
	 * Done tested
	 * @moroclash
	 * 
	 * @return system.Iterator interface that have All CompleateTaskes
	 */
	public system.Iterator getCompletedOffersIterator() {
		HashSet<Integer> moods = new HashSet<>();
		moods.add(7);
		moods.add(8);
		moods.add(9);
		return getOffersWithMood(moods);
	}

	/**
	 * not Tested
	 *
	 * @moroclash
	 *
	 * Helper Function
	 *
	 * @param mood : this collection that have all state that you want you
	 * can set any State you want from 0-9
	 * @return BeIterator class that implement system.Iterator interface
	 */
	private BeIterator getOffersWithMood(Set<Integer> mood) {
		BeIterator BeIte = new BeIterator();;
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
			Criterion samID = Restrictions.eq("owner", this);
			Criterion OFmood = Restrictions.in("state", mood);
			LogicalExpression lox = Restrictions.and(samID, OFmood);
			cri.add(lox);
			List<Offer> OffList = cri.list();
			BeIte.setCollection(OffList);

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
	 * Done tested
	 *
	 * @moroclash
	 *
	 * @return Iterator interface that will have all Accepted Offers
	 */
	public system.Iterator getAcceptedOffersIterator() {
		HashSet<Integer> moods = new HashSet<>();
		moods.add(3);
		moods.add(6);
		return getOffersWithMood(moods);
	}

	/**
	 * Done Tested
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
				se.getTransaction().commit();
				se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
				se.getTransaction().begin();
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
			sql.setParameter(0, this.getId());
			sql.setParameter(1, MySkill.getId());
			//execute Queary 
			sql.executeUpdate();
			//commit saving
			se.getTransaction().commit();
			end = true;
			LogManager.Log(this.getId() + " add new Skill");
		} catch (Exception exp) {
			System.err.println(exp.getMessage() + " becouse Doubleaction");
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
	 * Done tested
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
			se.getTransaction().commit();
			end = true;
			LogManager.Log(this.getId() + " delete exist Skill");
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
	 * Done tested
	 * @morocash
	 * 
	 * return List of all Taskes
	 */
	public Iterator listTasks() {
		BeIterator BeIte = new BeIterator();;
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
			cri.add(Restrictions.eq("owner", this));
			Set<Task> liTask = new HashSet<>();
			List<Offer> OffList = cri.list();
			OffList.forEach(e -> {
				liTask.add(e.getTask());
			});
			BeIte.setCollection(liTask);
		} catch (Exception exp) {
			se.getTransaction().rollback();
			System.err.println(exp.fillInStackTrace());
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
	 * Done tested
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
		boolean end=false;
		se = databaseManager.SessionsManager.getSessionFactory().openSession();
		System.out.println("open");
		se.getTransaction().begin();
		try {
			se.save(this);
			se.getTransaction().commit();
			LogManager.Log(this.getId() + " make Registration");
			//wellcom massage
			AccNotification notifi = new AccNotification();
			notifi.setDate(LocalDateTime.now());
			notifi.setFromAccount_id(this);
			notifi.setMassage("Wellcom "+this.getUserName()+" in our freelancing system");
			notifi.setState(false);
			notifi.setToAccount_id(this);
			this.addNotification(notifi);
			end = true;
		} catch (Exception exp) {
			System.err.println(exp.fillInStackTrace());
			se.getTransaction().rollback();
			end=false;
		} finally {
			//close session
			se.close();
			return end;
		}
	}
}
