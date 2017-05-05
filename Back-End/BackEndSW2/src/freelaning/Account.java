// #Done @moroclash
package freelaning;

import java.time.LocalDateTime;

/**
 *
 */
public class Account implements SystemAccess {

	/**
	 * Default constructor
	 */
	public Account() {
	}

	/**
	 *
	 */
	private String firstName;

	/**
	 *
	 */
	private String lastName;

	/**
	 *
	 */
	private String phone;

	/**
	 *
	 */
	private int id;

	/**
	 *
	 */
	private String password;

	/**
	 *
	 */
	private String userName;

	/**
	 *
	 */
	private int accountState;

	/**
	 *
	 */
	private LocalDateTime date;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getiD() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int  isAccountState() {
		return accountState;
	}

	public void setAccountState(int accountState) {
		this.accountState = accountState;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * @return
	 */
	public boolean block() {
		this.accountState = 0;
		return true;
	}

	/**
	 * @return
	 */
	public boolean unblock() {

		this.accountState = 1;
		return true;
	}

	/**
	 * @return
	 */
	public boolean remove() {
		this.accountState = 3;
		return true;
	}

	/**
	 * @return
	 */
	public boolean logout() {
		this.accountState = 4;
		return true;
	}

	/**
	 *
	 */
	public void updateProfile() {
		// TODO implement here
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
