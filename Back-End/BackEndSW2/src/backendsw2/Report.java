
import java.util.*;

/**
 * 
 */
public interface Report {

    /**
     * 
     */
    private String Name;

    /**
     * 
     */
    private DateTime Date;

    /**
     * 
     */
    public ReportManager use;

    /**
     * @return
     */
    public String GetDescription();

    /**
     * @return
     */
    public DateTime GetDate();

    /**
     * @return
     */
    public String Next();

    /**
     * @return
     */
    public bool HasNext();

}