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
    public Constraints getConstraint() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Statistics getStatistics() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getDescription() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public LocalDateTime getDate() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String next() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public boolean hasNext() {
        // TODO implement here
        return false;
    }

	@Override
	public LocalDateTime getDate() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String GetDescription() {
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