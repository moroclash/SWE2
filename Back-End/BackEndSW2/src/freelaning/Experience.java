package freelaning;
import java.util.ArrayList;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)

/**
 * 
 */
public class Experience {

    /**
     * Default constructor
     */
    public Experience() {
    }

    /**
     * 
     */
    private String picture;

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public ArrayList<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}

    /**
     * 
     */
    private String link;

    /**
     * 
     */
    private String summary;

    /**
     * 
     */
    private ArrayList<String> technologies;


}