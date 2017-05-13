// Done @moroclash
package databaseManager;

import java.sql.Connection;

/**
 *   Singleton Pattern
 */
public class Database {

	/**
	 * Default constructor
	 */
	private Database() {
	}

	/**
	 *
	 */
	private String Username;

	/**
	 *
	 */
	private String Password;

	/**
	 *
	 */
	private String Url;

	/**
	 *
	 */
	private static Database database;


	/**
	 * @return
	 */
	public Connection getConnect() {
		// TODO implement here
		return null;
	}


	/**
	 *
	 */
	public void Insert() {
		// TODO implement here
	}

	/**
	 *
	 */
	public void Update() {
		// TODO implement here
	}

	/**
	 *
	 */
	public void Delete() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Database GetInstance() {
		// TODO implement here
		return null;
	}

}
