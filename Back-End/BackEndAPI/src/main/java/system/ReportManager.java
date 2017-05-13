package system;
import java.time.LocalDateTime;




// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)il.*;



/**
 * 
 */
public class ReportManager {

    /**
     * Default constructor
     */
    public ReportManager() {
    }

    /**
     * 
     */
    private Report report;

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}


    /**
     * @return
     */
    public String GetReportDescription() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public LocalDateTime GetReportDate() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String NextReport() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public boolean HasNextReport() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public LocalDateTime GetReportTime() {
        // TODO implement here
        return null;
    }

}