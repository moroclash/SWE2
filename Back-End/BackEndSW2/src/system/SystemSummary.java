package system;

import java.time.LocalDateTime;


// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)il.*;

/**
 * 
 */
public class SystemSummary implements Report {

    /**
     * Default constructor
     */
    public SystemSummary() {
    }

    /**
     * @return
     */
    public Constraints GetConstraint() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Statistics GetStatistics() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String GetDescription() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public LocalDateTime GetDate() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String Next() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public boolean HasNext() {
        // TODO implement here
        return false;
    }

}