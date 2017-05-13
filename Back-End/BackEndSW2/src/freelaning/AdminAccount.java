package freelaning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import system.GetStatistics;
import system.Statistics;


// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

/**
 * 
 */
public class AdminAccount extends Account {

    /**
     * Default constructor
     */
    public AdminAccount() {
    }

   
       
    public ArrayList<Complaint> showUnseenComplaint() {
        // TODO implement here
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        Criteria cr = se.createCriteria(Complaint.class);
        cr.add(Restrictions.eq("seenState", 1));
        ArrayList<Complaint> results = (ArrayList<Complaint>) cr.list();
        se.close();

        return results;
    }

    /**
     * @return
     */
    public ArrayList<Complaint> showSeenComplaint() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        Criteria cr = se.createCriteria(Complaint.class);
        cr.add(Restrictions.eq("seenState", 0));
        ArrayList<Complaint> results = (ArrayList<Complaint>) cr.list();
        se.close();

        return results;
    }

    /**
     * @param complaint
     */
 public void replyComplaint(Complaint complaint  ) {
        // TODO implement here
        
    }

    /**
     * @return
     * by yasser
     */
    public GetStatistics showStatistics() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        Statistics stat =(Statistics) se.get(Statistics.class,1);
        se.close();

        return stat;
    }

    

    /**
     * @return
     * by yasser
     */
    public List<Object[]> getLog() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
        se.getTransaction().begin();
        SQLQuery query = se.createSQLQuery("select DATED, MESSAGE from logs");
        List<Object[]> rows = query.list();
        for (Object[] row : rows) {
            row[0].toString();
            row[1].toString();
        }
        se.close();
        return rows;
    }  // End of Function

    
   

    /**
     * @param complaint
     * by abdulalrahman
     */
    public void replyComplaint(Complaint complaint , Complaint replay   ) {
        // TODO implement here
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
           
//           Set<Complaint >replaies =  new HashSet<>();
//           replaies.addAll(complaint.getReplies());
//           replaies.add(replay);
         
          complaint.getReplies().add(replay);
       
         
          
            
           se.save(replay);
            if (flag) {
                
                se.update(complaint);
                
            } else {
                se.merge(complaint);
                 se.getTransaction().commit();
            }

          
        } catch(Exception e )
        {
         
         System.err.println("k" + e);
         
         se.getTransaction().rollback();
        }
        finally{
         if(flag)
         {
             se.close();
         }
        }
    }

    

    /**
     * @param accountID
     */
    public void banConsumer(int accountID) {
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
            ConsumerAccount account = (ConsumerAccount) se.get(Account.class, accountID);
          

            account.setAccountState(0);

            if (flag) {
                se.update(account);
            } else {
                se.merge(account);
            }

            se.getTransaction().commit();
        } catch(Exception e )
        {
            System.err.println(e);
         se.getTransaction().rollback();
        }
        finally{
         if(flag)
         {
             se.close();
         }
        }  
    }

    /**
     * @param accountID
     * by @abdulrahman1996
     */
    public void unbanConsumer(int accountID) {
        
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
            ConsumerAccount account = (ConsumerAccount) se.get(Account.class, accountID);
            

            account.setAccountState(1);

            if (flag) {
                se.update(account);
            } else {
                se.merge(account);
            }

            se.getTransaction().commit();
        } catch(Exception e )
        {
         se.getTransaction().rollback();
        }
        finally{
         if(flag)
         {
             se.close();
         }
        }  
    }

    


}