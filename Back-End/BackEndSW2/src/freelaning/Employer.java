package freelaning;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import system.LogManager;

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
    
    //tested
    public ArrayList<Offer> showAllOffer()
    {
        
          ArrayList<Offer> offers =new ArrayList<>();
    Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.getTransaction().begin();
            String q = "FROM   Offer ";
            Query hq  =se.createQuery(q);
            offers = (ArrayList<Offer>) hq.list();
            
        } catch (Exception e) {
            System.out.println(e);   
        }
        finally
        {
          se.close();
        }
        
        return offers ; 
    }
    
    //rested
    public ArrayList<Freelancer> showAllFreelancers()
    {   
         LogManager.Log("Employer  "+ this.getId() + " showAllFreelancers");
         ArrayList<Freelancer> freelancers=new ArrayList<>();
    Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.getTransaction().begin();
            String q = "FROM  Freelancer ";
            Query hq  =se.createQuery(q);
            freelancers =  (ArrayList<Freelancer>) hq.list();
            
        } catch (Exception e) {
            System.out.println(e);   
        }
        finally
        {
          se.close();
        }
        
        return freelancers ; 
    }
    
    
   
    
    

    /**
     * @param task
     * 
     */
    //tested
    public void createTask(Task task) {
        LogManager.Log("Employer  "+ this.getId() + "create a task");

        // create session
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(task);
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
            System.out.println(e);
        } finally {
            se.close();
        }

    }//end of function

    /**
     * @param offer
     */
    //tested
    public void acceptOffer(Offer offer) {
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your task is accepted :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        
        
        
        LogManager.Log("Employer  "+ this.getId() + " acceptPffer number : " + offer.getId());
//        offer.setState(3);

        //update state of the offer
        //begin session
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            
//            System.out.println(offer.getId() + offer.getState());
//            Offer off = (Offer) se.get(Offer.class, offer.getId());
//            se.beginTransaction();
//            se.update(off);
//            se.getTransaction().commit();

                se.beginTransaction();
                String q = "Update Offer set state = 3 where id = :ID";
                Query hq = se.createQuery(q);
                hq.setParameter("ID" ,offer.getId());
                hq.executeUpdate();
                
                se.save(not);
                se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
            System.err.println(e);
        } finally {
           
            se.close();
        }

    }

    /**
     * @param offer
     */
    //tested
    public void rejectOffer(Offer offer) {
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your offer is rejected معلش :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        
        
      LogManager.Log("Employer  "+ this.getId() + "reject offer num :" + offer.getId());
//        offer.setState(1);

        // start new session
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
                se.beginTransaction();
                String q = "Update Offer set state = 1 where id = :ID";
                Query hq = se.createQuery(q);
                hq.setParameter("ID" ,offer.getId());
                hq.executeUpdate();
                
                se.save(not);
                se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

    }

    /**
     * @param overTime
     */
    //  not tested yet , there is  lake of of info 
    public void acceptOverTime(OverTimeRequest overTime) {
        // put 1 to the state
        overTime.setState(1);// shoild be edit to be true and false 

        int offerId = overTime.getOffer().getId();

        // start new seaaion
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            // change state of offer 
            String q = "UPDATE Offer set state = 6 where  id = :ID";
            Query hq = se.createQuery(q);
            hq.setParameter("ID ", offerId);
            hq.executeUpdate();

            se.beginTransaction();
            se.saveOrUpdate(overTime);
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

    }

    /**
     * @param overTime
     */
    public void rejectOverTime(OverTimeRequest overTime) {
        //change the state to 0
       

        // start new sessuin
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
           String q = "UPDATE Offer set state = 6 where  id = :ID";
            Query hq = se.createQuery(q);
            hq.setParameter("ID ", 1);
            hq.executeUpdate();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

    }

    /**
     * @param offer
     * @return
     */
    
    //tested 
    public Invoice acceptFinishedTask(Offer offer) {
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your task is accepted  :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        
        
        
        LogManager.Log("Employer  "+ this.getId() + "accept task num : " + offer.getTask().getId());
//        offer.setState(7);
        Invoice invoice = new Invoice();
        invoice.setDate(LocalDateTime.now());
        invoice.setOffer(offer);
        invoice.setState(1);
        //invoice.setPrice();
//      the invoise paid         
        
        
        
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try{
          se.getTransaction().begin();
         invoice.pay(offer, this);
          String q = "UPDATE Offer set state = 7 where  id = :ID";
            Query hq = se.createQuery(q);
            hq.setParameter("ID", offer.getId());
            hq.executeUpdate();
            
            
            q = "Update Task set state = 5  where id = :taskId" ;
            hq = se.createQuery(q);
            hq.setParameter("taskId", offer.getTask().getId());
            hq.executeUpdate();
            
            
            se.save(not);
            
            se.getTransaction().commit();
        }
        catch(Exception e)
        {
         se.getTransaction().rollback();
            System.out.println(e);
        }
        finally{
            se.close();
        }
       
        return invoice;
    }// end of acceptFinishedTask

    
    
    /**
     * @param offer
     * @return
     */
    //tested
    public boolean rejectFinishedTask(Offer offer) {
        
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your task is rejected :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        
        
        
        LogManager.Log("Employer  "+ this.getId() + " reject task");
        // change state of the offer
   //     offer.setState(8);

        //start new session
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
             se.getTransaction().begin();
           
            String q = "UPDATE Offer set state = 8 where  id = :ID";
            Query hq = se.createQuery(q);
            hq.setParameter("ID", offer.getId());
            hq.executeUpdate();
            
            System.out.println(offer.getTask().getId());
            q = "Update Task set state = 6  where id = :taskId" ;
            hq = se.createQuery(q);
            hq.setParameter("taskId", offer.getTask().getId());
            hq.executeUpdate();
            
            
            
            se.save(not);
            
            
            se.getTransaction().commit();
        } catch (Exception e) {
            se.getTransaction().rollback();
            System.out.println("freelaning.Employer.rejectFinishedTask()");
        } finally {
            se.close();
        }

        return false;
    }

    /**
     * 
     * @param feedback
     */
    //tested 
    public void makeFeedback(Feedback feedback , Offer offer ) {
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage( this.getUserName() +" reted you  :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        
        
        LogManager.Log("Employer  "+ this.getId() + " made feedback");
        // fill feedback object 
        

        // start session to save the object   
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            se.beginTransaction();
           
            se.save(not);
            se.save(feedback);
            se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            se.close();
        }

    }

    @Override
    // not completed yet
    public boolean register() {
        

        return true;
    }

}
