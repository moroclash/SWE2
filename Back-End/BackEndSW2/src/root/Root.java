package root;

import freelaning.AdminAccount;
import java.util.ArrayList;
import system.Constraints;
import freelaning.*;
import java.util.List;
import java.util.Set;
import java.util.logging.LogManager;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)
/**
 *
 */
public class Root implements SystemAccess {

    /**
     * Default constructor
     */
    public Root() {
    }

    /**
     *
     */
    private String password;
    private int id;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param admin
     */
    /* this function is used to create admin in data base */
    public void createAdmin(AdminAccount admin) {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        try {
            se.getTransaction().begin();
            se.save(admin);
            se.getTransaction().commit();
        } // End of try
        catch (Exception e) {

            se.getTransaction().rollback();
        } // End of catch
        finally {
            se.close();
        } // End of finally
    } // End of Function 

    /**
     * @param constraints
     */
    public void specifyPenalties(Constraints constraints) {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        try {
            se.getTransaction().begin();
            se.saveOrUpdate(constraints);
            se.getTransaction().commit();
        } // End of try
        catch (Exception e) {

            se.getTransaction().rollback();
        } // End of catch
        finally {
            se.close();
        } // End of finally   
    } // End of Function 

    /**
     * @return
     */
    public ArrayList<AdminAccount> getBlockedAdims() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        Criteria cr = se.createCriteria(AdminAccount.class);
        cr.add(Restrictions.eq("accountState", 1));
        ArrayList<AdminAccount> results = (ArrayList<AdminAccount>) cr.list();
        se.close();

        return results;
    } // End of Function 

    /**
     * @return
     */
    @Override
    public boolean logout() {
        system.LogManager.Log("User " + this.id + " is LogOut");
        return false;
    } // End of Function 

    @Override
    public void updateProfile() {
        Session se = databaseManager.SessionsManager.getSessionFactory().openSession();

        try {
            se.getTransaction().begin();
            se.update(this);
            se.getTransaction().commit();
        } // End of try
        catch (Exception e) {

            se.getTransaction().rollback();
        } // End of catch
        finally {
            se.close();
        } // End of finally     
    } // End of Function 

    /**
     * @return
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

}
