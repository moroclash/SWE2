package freelaning;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import system.Constraints;
import system.LogManager;
import system.Statistics;

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
    
    public ArrayList<Task> showAllTasks()
    {
        
    ArrayList<Task> tasks =new ArrayList<>();
    Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        try {
            
            se.getTransaction().begin();
            String q = "FROM   Task  where employer = :id   ";
            Query hq  =se.createQuery(q);
            hq.setParameter("id", this);
            tasks = (ArrayList<Task>) hq.list();
            
        } catch (Exception e) {
          
            System.out.println(e);   
        }
        finally
        {
          se.close();
        }
        
        return tasks ; 
    }
    
  
    
    
   
    
    

    /**
     * @param task
     * 
     */
    //tested
    public void createTask(Task task  ) {
        LogManager.Log("Employer  "+ this.getId() + "create a task");
       boolean flag = false ; 
        // create session
        Session se ;
        try{
            se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
            flag = false ; 
        }
        catch(Exception e )
        {
            se = databaseManager.SessionsManager.getSessionFactory().openSession();
        }
        try {
            // begin se 
            se.beginTransaction();
           
            // save task object 
            se.save(task);
            
//            String q = "insert into  task_technologies (:task_id , :Skill_id ) ;" ;
//            for(Skill s  : skills)
//            {
//              Query hq = se.createSQLQuery(q);
//              hq.setParameter("task_id", 1);
//              hq.setParameter("Skill_id", 1);
//              hq.executeUpdate();
//            }
//            
            se.getTransaction().commit();
            

        } catch (Exception e) {
            se.getTransaction().rollback();
            System.out.println(e);
        } finally {
            if(flag)
            se.close();
        }
      

    }//end of function

    
    
    /**
     * @param offer
     */
    //tested
    public void acceptOffer(Offer offer) {
       
        
        
        //  notify freelancer
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your task is accepted :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        offer.getOwner().addNotification(not);
        
         
        
        
        LogManager.Log("Employer  "+ this.getId() + " acceptoffer number : " + offer.getId());


       
        boolean flag = false ; 
        // create session
        Session se ;
        try{
            se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
            flag = false ; 
        }
        catch(Exception e )
        {
            se = databaseManager.SessionsManager.getSessionFactory().openSession();
            flag = true ; 
        }
        try {
            se.beginTransaction();
            
            
            
             // put money to system
            Statistics s = (Statistics) se.get(Statistics.class, 1) ;
            double totalMoney =  s.getTotalMoney()+ (offer.getHourCost()* offer.getNumberOfHours());
            String q = "Update Statistics set totalMoney = :t where id = 1";
            Query hq = se.createQuery(q);
            hq.setParameter("t" ,totalMoney);
            hq.executeUpdate();
            
            
//            System.out.println(offer.getId() + offer.getState());
//           // Offer off = (Offer) se.get(Offer.class, offer.getId());
//            se.beginTransaction();
//            se.merge(offer);
//            se.getTransaction().commit();

              // update offer state  
                q = "Update Offer set state = 3 where id = :ID";
                hq = se.createQuery(q);
                hq.setParameter("ID" ,offer.getId());
                hq.executeUpdate();
                
                //update task state 
               if (flag) {
                Task t = offer.getTask();
                t.setState(3);
                se.update(t);
            } else {
                Task t = offer.getTask();
                t.setState(3);
                se.merge(t);
            }
               
                
   
             se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
            System.err.println(e);
        } finally {
           if(flag)
            se.close();
        }

    }

    /**
     * @param offer
     */
    //tested
    public void rejectOffer(Offer offer) {
        
        //notify freellancer
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your offer is rejected :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        offer.getOwner().addNotification(not);
        
        // add message to logs
      LogManager.Log("Employer  "+ this.getId() + "reject offer num :" + offer.getId());


        // start new session
       boolean flag = false ;
       Session se ;
        try{
            se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
            flag = false ; 
        }
        catch(Exception e )
        {
            se = databaseManager.SessionsManager.getSessionFactory().openSession();
            flag = true ; 
        }
        try {
                se.beginTransaction();
                String q = "Update Offer set state = 1 where id = :ID";
                Query hq = se.createQuery(q);
                hq.setParameter("ID" ,offer.getId());
                hq.executeUpdate();
                

                se.getTransaction().commit();

        } catch (Exception e) {
            se.getTransaction().rollback();
        } finally {
            if(flag)
            se.close();
        }

    }

    /**
     * @param overTime
     */
    //  not tested yet , there is  lake of of info 
    public void acceptOverTime(OverTimeRequest overTime) {
        
        //notfy freelancer 
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(overTime.getOffer().getOwner());
        not.setMassage("your overtime is accepted  " );
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        overTime.getOffer().getOwner().addNotification(not);
        
        
        boolean flag = false , end = false ; 
        
        Session se ;
        // chenge over time state
        overTime.setState(1);// shoild be edit to be true and false 
        
        // check if there is a session 
        try{
         se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
         flag = false;    
        }
        catch(Exception e )
        {
            se = databaseManager.SessionsManager.getSessionFactory().openSession();
            flag = true;
        }
        // start new seaaion
       se.getTransaction().begin();
        try {
            
            if(flag)
            {
             se.update(overTime);
           
            
                System.err.println("session mesh");
            }
            else
            {
             se.merge(overTime);
            
           
            }
            
            se.getTransaction().commit();

        } catch (Exception e) {
            System.err.println(">>>>>>>>>>>>>>>>" +e);
            se.getTransaction().rollback();
        } finally {
            // close the session 
            if(flag)
            se.close();
        }

    }

    /**
     * @param overTime
     */
    public void rejectOverTime(OverTimeRequest overTime) {
        
        
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(overTime.getOffer().getOwner());
        not.setMassage("your overtime  is rejected :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        overTime.getOffer().getOwner().addNotification(not);
        
         
        
        
        LogManager.Log("Employer  "+ this.getId() + " rejecte your offer: " + overTime.getOffer().getId(
        
        ));
        
        
        
        
      boolean flag = false; 
         // set overtime state
       overTime.setState(0);
        // start new sessuin
        Session se ; 
        try{
          se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
        }
        catch(Exception e)
        {
          se = databaseManager.SessionsManager.getSessionFactory().openSession();  
          flag = true ; 
        }
        se.beginTransaction();
        try {
            if (flag) {
                se.update(overTime);
            } else {
                se.merge(overTime);
            }

            se.getTransaction().commit();

        } catch (Exception e) {

            se.getTransaction().rollback();
        }
        finally {
            //  if there is session opend , close it 
            if (flag) {
                se.close();
            }

        }// finaly 

    }

    /**
     * @param offer
     * @return
     */
    
    //tested 
    public Invoice acceptFinishedTask(Offer offer) {
        Invoice invoice = new Invoice();
        // notify freelancer
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your task is accepted  :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        offer.getOwner().addNotification(not); // problem in notifacation 
         
        
        
      LogManager.Log("Employer  "+ this.getId() + "accept task num : " + offer.getTask().getId());
      Session se ; boolean flag = false ; 
        try{
          se =   databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
        }
        catch(Exception e )
        {
           se = databaseManager.SessionsManager.getSessionFactory().openSession(); 
           flag = true ; 
        }
        try{
            
            se.beginTransaction();
            String q = "UPDATE Offer set state = 7 where  id = :ID";
            Query hq = se.createQuery(q);
            hq.setParameter("ID", offer.getId());
            hq.executeUpdate();
            
            
            q = "Update Task set state = 5  where id = :taskId" ;
            hq = se.createQuery(q);
            hq.setParameter("taskId", offer.getTask().getId());
            hq.executeUpdate();
            
             
             
          
            
            se.getTransaction().commit();
        }
        catch(Exception e)
        {
         se.getTransaction().rollback();
            System.out.println(e);
        }
        finally{
           if (flag) {
               { System.out.println("hqhqhqhqhqhh");
                se.close();}
            }
        }
        invoice.pay(offer, this);
        return invoice;
    }// end of acceptFinishedTask

    
    
    /**
     * @param offer
     * @return
     */
    //tested
    public boolean rejectFinishedTask(Offer offer) {
        boolean flag = false , end = true ;
       Session se ;
       try{
        se = databaseManager.SessionsManager.getSessionFactory().openSession();
        
       } 
       catch(Exception e )
       {
         se = databaseManager.SessionsManager.getSessionFactory().openSession();
         flag = true ;
       }
        
       
        AccNotification not = new AccNotification();
        //notify freelancer
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage("your task is rejected :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        offer.getOwner().addNotification(not);
        
       
        
    // حنقل من ريت الامبلوير     
      //get Rate Of employeer to apply penelty
        Rate rate = this.getProfile().getRate();
        
      //apply penelty
        Constraints constraints  = (Constraints) se.get(Constraints.class  ,1);
        int newRate = rate.getTheRate()- constraints.getEm_rejectFinishedTaskPenalty();
        
        
        // notify employer
        not.setFromAccount_id(offer.getOwner());
        not.setToAccount_id(this);
        not.setMassage(" your rate is cosumed  to :D "+ newRate);
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        this.addNotification(not);
        

        LogManager.Log("Employer  "+ this.getId() + " reject task");
        
        // get mony 
         double mony = offer.getHourCost() * offer.getNumberOfHours() * 0.5 ;
        //start new session
        try {
             se.beginTransaction();
           //change offer state
            String q = "UPDATE Offer set state = 8 where  id = :ID";
            Query hq = se.createQuery(q);
            hq.setParameter("ID", offer.getId());
            hq.executeUpdate();
            
         // chenge task state
            System.out.println(offer.getTask().getId());
            q = "Update Task set state = 6  where id = :taskId" ;
            hq = se.createQuery(q);
            hq.setParameter("taskId", offer.getTask().getId());
            hq.executeUpdate();
            
            //chenge rate
            q = "Update Rate set theRate = :rate  where id = :rateId" ;
            hq = se.createQuery(q);
            hq.setParameter("rate", newRate);
            hq.setParameter("rateId", rate.getId());
            hq.executeUpdate();
           
            
//         add mony to freelancer 
            Freelancer fr = (Freelancer) se.get(Freelancer.class  , offer.getOwner().getId());
            //   System.out.println(fr.getBalance());
            fr.setBalance(fr.getBalance()+ mony * 0.4);
            //System.out.println(fr.getBalance());
            if(flag)
            {
             se.update(fr);   
            } 
            else{ 
            se.merge(fr);
            }
            
            
            // add money to system  
            Statistics s = (Statistics) se.get(Statistics.class, 1);
            s.setTotalMoney(s.getTotalMoney()- (offer.getHourCost()*offer.getNumberOfHours()));
            s.setNumberOfRejectedTasks(s.getNumberOfRejectedTasks()+1);
            s.setOurMoney( mony * 0.1);
            se.merge(s);
            
            // notify freelancer with mony added
            not.setFromAccount_id(this);
            not.setToAccount_id(offer.getOwner());
            not.setMassage( "your task s rejected " +mony *0.4 +"  added your balance :D "+ newRate);
            not.setDate(LocalDateTime.MAX);
            not.setState(true);
            offer.getOwner().addNotification(not);
        
            
            se.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("freelaning.Employer.rejectFinishedTask()");
            se.getTransaction().rollback();
            
        } finally {
            if(flag)
            se.close();
        }

        return false;
    }

    /**
     * 
     * @param feedback
     * @param offer
     */
    //tested 
    public void makeFeedback(Feedback feedback , Offer offer   ) {
        AccNotification not = new AccNotification();
        not.setFromAccount_id(this);
        not.setToAccount_id(offer.getOwner());
        not.setMassage( this.getUserName() +" reted you  :D ");
        not.setDate(LocalDateTime.MAX);
        not.setState(true);
        offer.getOwner().addNotification(not);
        
        
        System.out.println(offer.getOwner().getId());
        LogManager.Log("Employer  "+ this.getId() + " made feedback");
        // fill feedback object 
        

        // start session to save the object  
        boolean flag = false ; 
         Session se;
        try{
        se   = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();  
        }
        catch(Exception e )
        {
            se = databaseManager.SessionsManager.getSessionFactory().openSession();
            flag = true ;
        }
        
        try {
            se.beginTransaction();
             // update freelabcer rate 
             Freelancer fr = feedback.getOffer().getOwner();
             fr.getProfile().getRate().setTheRate(fr.getProfile().getRate().getTheRate() + feedback.getRateValue());
             if(flag){
              se.update(fr.getProfile().getRate());
             }
             else{
             se.merge(fr.getProfile().getRate());
             }
                 
                 
                 
                 
            se.save(feedback);
            
            se.getTransaction().commit();

        } catch (Exception e) {
            
            se.getTransaction().rollback();
        } finally {
            if(flag)
            se.close();
        }

    }
    
    
    
    ///
    
   public void cancelOffer(Offer offer ) {
          
           boolean flag = false ;
            Session se ;
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
              
                 Constraints con = (Constraints) se.get(Constraints.class,1);
                 Rate r = this.getProfile().getRate();
              if(offer.getState() == 0 )
              {
                  System.out.println(">>>>>>>> fdf ");
                 offer.setState(2);
              }
              else{
                  System.out.println("><?<<?<><" +r.getTheRate());
                  //
                  offer.setState(2);
                  //
                  r.setTheRate(r.getTheRate() -con.getEm_cancelRunningTaskPenalty());
                   System.out.println("><?<<ererererre?<><" +r.getTheRate());
                  // notify Employer 
                  AccNotification not = new AccNotification();
                  not.setDate(LocalDateTime.MAX);
                  not.setFromAccount_id(this);
                  not.setToAccount_id(this);
                  not.setMassage("your rate is consumed");
                  this.addNotification(not);
              }
              
              
              
              if(flag)
              {
               se.update(r);
               se.update(offer);
              }
              else{
               se.merge(r);
               se.merge(offer);
              }
              se.getTransaction().commit();
          }
          catch(Exception e)
          {
              System.out.println(e);
           se.getTransaction().rollback();
          }
          finally{
              if(flag)
                  se.close();
          }
  }
   
 ///  
 public  void cancelTask(Task task)
 {
     boolean flag = false ; 
        Session se;
        try{
        se   = databaseManager.SessionsManager.getSessionFactory().openSession();  
        }
        catch(Exception e )
        {
            se = databaseManager.SessionsManager.getSessionFactory().openSession();
            flag = true ;
        }
        try{
            se.getTransaction().begin();
            // ده لو التاسك  لسه متعينش لفريلانسر او مجالوش اوفر اساسا 
            if (task.getState() == 0 || task.getState() == 1) {
                System.out.println("here oasm ");
                task.setState(2);
            }// في حالة ان التاسك ده اتعين لفريلانسر 
            else if (task.getState() == 3) {
                //  edit the rate of the employer 
                Rate rate = this.getProfile().getRate();
                System.err.println("aksjdj asdj kjjj jj");
                Constraints constraints = (Constraints) se.get(Constraints.class, 1);
                rate.setTheRate(rate.getTheRate()  - constraints.getEm_cancelRunningTaskPenalty());
                this.getProfile().setRate(rate);

                // chenge task state 
                task.setState(4);
                
                //notify employer 
                 
                AccNotification not = new AccNotification();
                not.setFromAccount_id(this);
                not.setToAccount_id(this);
                not.setMassage("your rate is consumed");
                not.setDate(LocalDateTime.MAX);
                not.setState(true);
                this.addNotification(not);
                

            }
            
            if(flag)
            {
                System.err.println("ddddksdjfkj");
                se.update(task);
                se.update(this.profile.getRate());
            }
            else{
                System.out.println("222");
                se.merge(task) ;
                se.merge(this.profile.getRate());
            }
            
            
            
            se.getTransaction().commit();
        }
        catch(Exception e)
        {
         System.out.println(e);
         se.getTransaction().rollback();
        }
        finally{
            if(flag)
            se.close();
        }
     
 }

    @Override
    public boolean register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
