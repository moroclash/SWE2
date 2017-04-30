// Done @moroclash
package system;

import java.time.LocalDateTime;

/**
 * 
 */
public class EconomicReport extends Report {

    /**
     * Default constructor
     */
    public EconomicReport() {
    }
    
    /**
     * @return
     */
    public Constraints GetConstraints() {
	     // TODO implement here
        return null;
    }
    
    /**
     * @return
     */
    public GetStatistics GetStatistics() {
        // TODO implement here
        return null;
    }

	@Override
	public String GetDescription() {
		return null;
	}

	@Override
	public LocalDateTime getDate() {
		return null;
	}

	@Override
	public String Next() {
		return null;
	}

	@Override
	public boolean HasNext() {
		return true;
	}



}