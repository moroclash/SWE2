/*#Done @moroclash*/
package freelaning;

import freelaning.Account;

/**
 * 
 */
public class AccountFactory {

	
    /**
     * Default constructor
     */
    public AccountFactory() {
    }

    
    
    /**
	 * 
     * @maintain: TahaMagdy
     * @param accountTypeName
     *     # This parameter can be one of these 
     *     {Employer, Freelancer, Account, AdminAccount}
     * @description
     * 	   # This Function takes the Account name and returns the corresponding
     *     Object.
     * @return : You have to cast the returning object.
     */
    public Object getAccount(String accountTypeName) {

	switch (accountTypeName) {
		case "Employer":
			System.out.println("");
			return new Employer();
		case "Freelancer":
			return new Freelancer();
		case "Account":
			return new Account();
		case "AdminAccount":
			return new AdminAccount();
		default:
			break;
	} // end switch

	return new Object();
    } // end getAccount();




} // end class