package system;

import java.time.LocalDateTime;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)il.*;
/**
 *
 */
public class SystemSummary extends Report {

	/**
	 * Default constructor
	 */
	public SystemSummary() {
	}

	/**
	 * @return
	 */
	public GetConstrains getConstraint() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public GetStatistics getStatistics() {
		// TODO implement here
		return null;
	}

	@Override
	public String GetDescription() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public LocalDateTime getDate() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String Next() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean HasNext() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
