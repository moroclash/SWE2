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

<<<<<<< HEAD
	public int getAccountState() {
		return accountState;
	}

	
	public int  isAccountState() {
		return accountState;
||||||| merged common ancestors
	public int  isAccountState() {
		return accountState;
=======
	public boolean isBlockState() {
		return blockState;
>>>>>>> 1527dcb1ed8c1617223c901bb4723b2ef60f5486
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
		this.blockState = true;
		return true;
	}

	/**
	 * @return
	 */
	public boolean unblock() {

		this.blockState = true;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
