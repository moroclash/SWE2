// Done @moroclash
package freelaning;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	private HashSet<Skill> skills;

	/**
	 *
	 */
	private ArrayList<Experience> experience;

	/**
	 *
	 */
	private double balance;

	/**
	 *
	 */
	private FreelancerProfile profile;
	
	

	public HashSet<Skill> getSkills() {
		return skills;
	}

	public void setSkills(HashSet<Skill> skills) {
		this.skills = skills;
	}

	public ArrayList<Experience> getExperience() {
		return experience;
	}

	public void setExperience(ArrayList<Experience> experience) {
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
	
	private class BeIterator implements Iterator
	{

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
	 * @param skill
	 */
	public void addSkill(String skill) {
		// TODO implement here
	}

	/**
	 * @param skill
	 */
	public void deleteSkill(String skill) {
		// TODO implement here
	}

	/**
	 *
	 */
	public void listTasks() {
		// TODO implement here
	}

	@Override
	public boolean register() {
	     return true;
	}

}
 