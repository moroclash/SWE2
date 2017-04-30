// #Done @moroclash
package freelaning;

import java.time.LocalDateTime;
import system.SystemAccess;

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
	private boolean blockState;

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

	public boolean isBlockState() {
		return blockState;
	}

	public void setBlockState(boolean blockState) {
		this.blockState = blockState;
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
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean unblock() {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean remove() {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean logout() {
		// TODO implement here
		return true;
	}

	/**
	 *
	 */
	public void updateProfile() {
		// TODO implement here
	}

}
