package freelaning;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import org.hibernate.Session;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it);
/**
 *
 */
public class Employer extends ConsumerAccount {

	/**
	 * Default constructor
	 */
	public Employer() {
	}

	
	private EmployerProfile profile;

	public EmployerProfile getProfile() {
		return profile;
	}

	public void setProfile(EmployerProfile profile) {
		this.profile = profile;
	}

	/**
     * @param Category
	 * @param numberOfHours
	 * @param budget
	 * @param description
	 * @param technologies
	 */
        
        //Edit paramter  ArrayList<String> to set<skils> , add  catogery
	public void createTask(String Category , int numberOfHours,double budget,String description,Set<Skill> technologies) {
            // create task object and fill it
            Task task = new Task();
            task.setTechnologies(technologies);
            task.setTimeTaken(numberOfHours);
            task.setState(0);
            task.setDate(LocalDateTime.now() );
            task.setEmployer(this);
            task.setCategory(Category);
            
            // create session
            Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.save(task);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                     
           
	}//end of class

	/**
	 * @param offer
	 */
	public void acceptOffer(Offer offer) {
                
		 offer.setState(3);
                 
                //update state of the offer
                //begin session
         Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.saveOrUpdate(offer);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                    
                 
	}

	/**
	 * @param offer
	 */
	public void rejectOffer(Offer offer) {
            // update state
		offer.setState(1);
                
                // start new session
             Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.saveOrUpdate(offer);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                    
	}

	/**
	 * @param overTime
	 */
	public void acceptOverTime(OverTimeRequest overTime) {
            // put 1 to the state
		 overTime.setState(1);// shoild be edit to be true and false 
                 
                 // start new seaaion
                  Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.saveOrUpdate(overTime);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                    
	}

	/**
	 * @param overTime
	 */
	public void rejectOverTime(OverTimeRequest overTime) {
            //change the state to 0
		overTime.setState(0);
                
                
                // start new sessuin
                
                 Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.saveOrUpdate(overTime);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                    
	}
        

	/**
	 * @param offer
	 * @return
	 */
        //not completed yet  , i want to descuss the team in this
	public Invoice acceptFinishedTask(Offer offer) {
		offer.setState(7);
                Invoice invoice = new Invoice(); 
                invoice.setDate(LocalDateTime.now());
                invoice.setOffer(offer);
                invoice.setPrice(3.4);
                invoice.setState(0);
                
		return invoice;
	}

	/**
	 * @param offer
	 * @return
	 */
	public boolean rejectFinishedTask(Offer offer) {
            // change state of the offer
		offer.setState(8);
                
                
                //start new session
                 Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.update(offer);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                    
               
		return false;
	}

	/**
	 * @param offer
	 * @param description
	 * @param ratePercentage
	 */
	public void makeFeedback(Offer offer, String description, int ratePercentage) {
            // fill feedback object 
		Feedback feedback = new Feedback();
                feedback.setDate(LocalDateTime.now());
                feedback.setDescription(description);
                feedback.setOffer(offer);
                feedback.setRateValue(ratePercentage);
                
             // start session to save the object   
                Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
                try{
                    se.beginTransaction();
                    se.saveOrUpdate(offer);
                    se.save(feedback);
                    se.getTransaction().commit();
                    
                    
                }
                catch(Exception e)
                {
                   se.getTransaction().rollback();
                }
                finally{
                 se.close();
                }
                    
                
	}

	@Override
        // not completed yet
	public boolean register() {
          
		return  true;
	}

}
