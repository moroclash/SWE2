package freelaning;

import freelaning.Skill;
import java.util.Set;

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
	private Set<Skill> technologies;

	private int id;

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

	public Set<Skill> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<Skill> technologies) {
		this.technologies = technologies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



}
