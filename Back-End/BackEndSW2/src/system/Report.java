package system;

import java.time.LocalDateTime;




// @TahaMagdy: DONE


/**
 * 
 */
public abstract class Report {

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private LocalDateTime date;

    /**
     * 
     */
    public ReportManager use;

    /**
     * @return
     */
    public abstract String GetDescription();

    /**
     * @return
     */
    public abstract LocalDateTime getDate();

    /**
     * @return
     */
    public abstract String Next();

    /**
     * @return
     */
    public abstract boolean HasNext();
}