/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author moroclash
 */
public class LogManager {
	private static Logger log = Logger.getLogger(LogManager.class);
	
	/**
	 * Don't use this function ever
	 * 
	 */
	private static void CreateTableLogs()
	{
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		try {
			se.createSQLQuery("CREATE TABLE LOGS\n" +
							"   (DATED   DATETIME       NOT NULL,\n" +
							"    MESSAGE VARCHAR(1000)  NOT NULL\n" +
							"   )").executeUpdate();
		} catch (Exception e) {
			se.getTransaction().rollback();
		}finally
		{
			se.close();
		}
	}
	
	
	/**
	 * this function use to log massage in DB
	 * @param Type  : this is a type of a massage such as  Access , Login , delete , add  ....etc
	 * @param Massage : this is a massage that will save 
	 */
	public static void Log(String Massage)
	{
		log.fatal(Massage);
	}
	
	
}
