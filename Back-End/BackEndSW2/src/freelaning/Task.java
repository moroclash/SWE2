package freelaning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import system.LogManager;

// @TahaMagdy: DONE
// @Note: Any boolean function returns false 
//        (Change it if you're implementing it)
/**
 *
 */
public class Task {

	/**
	 * Default constructor
	 */
	public Task() {
	}

	/**
	 *
	 */
	private String task;

	/**
	 *
	 */
	// @Taha: It should be unsigend 
	private int timeTaken;

	/**
	 *
	 */
	private Set<Offer> offers;

	/**
	 *
	 */
	private Employer employer;

	/**
	 *
	 */
	private int id;

	/**
	 *
	 */
	private String category;

	/**
	 *
	 */
	private int state;

	/**
	 *
	 */
	private LocalDateTime date;

	private String TaskPathinServer;

	/**
	 *
	 */
	public Set<Skill> technologies;

	public void setTaskPathinServer(String TaskPathinServer) {
		this.TaskPathinServer = TaskPathinServer;
	}

	public String getTaskPathinServer() {
		return TaskPathinServer;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	public Set<Offer> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Set<Skill> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<Skill> technologies) {
		this.technologies = technologies;
	}

	private static void copyFileUsingStream(File source, File dest) throws IOException {
		

	}

	/**
	 * not tested
	 * @@moroclash
	 * this function use to upload task file on Server
	 *
	 * @return true if uploaded , false if note
	 */
	public boolean uploadTask(File task) {
		this.TaskPathinServer = "Tasks/" + this.id;
		int oldState = this.state;
		this.state = 7;
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false, end = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			OutputStream oo = new FileOutputStream(TaskPathinServer);
			oo.close();
			if (flage) {
				se.update(this);
			} else {
				se.merge(this);
			}
			AccNotification notify = new AccNotification();
			notify.setDate(LocalDateTime.now());
			notify.setFromAccount_id(this.employer);
			notify.setMassage("Task : " + this.task + "   Id: " + this.id + " is uploaded \n thanks.");
			notify.setState(false);
			notify.setToAccount_id(this.employer);
			//send notification
			this.employer.addNotification(notify);
			se.getTransaction().commit();
			end = true;
			LogManager.Log("Task : " + this.id + " is uploaded");
			File dec = new File(TaskPathinServer);
			Runnable runa = new Runnable() {
				@Override
				public void run() {
					InputStream is =null;
					OutputStream os =null;
					try {
						is = new FileInputStream(task);
						os = new FileOutputStream(dec);
						byte[] buffer = new byte[1024];
						int length;
						while ((length = is.read(buffer)) > 0) {
							os.write(buffer, 0, length);
						}
					} catch(Exception ex)
					{
						System.out.println("error in thread uploadin task file at Task Class");
					}
					finally {
						try {
							is.close();
							os.close();
						} catch (IOException ex) {
							System.out.println("error in thread uploadin task file at Task Class whene close streems");
						}
					}
				}
			};

			Thread t = new Thread(runa);
			t.run();
			se.getTransaction().commit();
		} catch (Exception exp) {
			se.getTransaction().rollback();
			this.TaskPathinServer = "";
			this.state = oldState;
			end = false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return end;
		}
	}

	/**
	 * not Tested
	 *
	 * @moroclash
	 *
	 * this function update this task info in database
	 * @return True if updated , false if not if task state isn't 0 this
	 * mean that it can't updated
	 */
	public boolean editTask() {

		if (this.state != 0) {
			System.out.println("Task is offered and you can't update ot after updated");
			return false;
		}

		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false, end = false;
		try {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		} catch (Exception exp) {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
		}
		se.getTransaction().begin();
		try {
			if (flage) {
				se.update(this);
			} else {
				se.merge(this);
				se.getTransaction().commit();
			}
			end = true;
			LogManager.Log(this.employer.getId() + " Employeer update Task : " + this.id);
		} catch (Exception exp) {
			se.getTransaction().rollback();
			end = false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return end;
		}
	}

	/**
	 * Don't tested
	 *
	 * @moroclash
	 *
	 * @param offer : this offer that will added in Task
	 * @return True if Offer added , false if not
	 */
	public boolean addOffer(Offer offer) {
		//this try to check if Notification list is assigend to object or not
		try {
			//list is assigend
			this.offers.add(offer);
		} catch (Exception ex) {
			//assign List to object 	
			this.offers = new HashSet<>();
			//add notification in the notificationBox
			this.offers.add(offer);
		}
		Session se;
		//to check if get current session or open new session 
		// use to check if close session or not
		boolean flage = false, end = false;
		try {
			// if not exist session
			se = databaseManager.SessionsManager.getSessionFactory().openSession();
			flage = true;
			
		} catch (Exception exp) {
			//if exist session 
			se = databaseManager.SessionsManager.getSessionFactory().getCurrentSession();
		}
		se.getTransaction().begin();
		try {
			se.save(offer);

			freelaning.AccNotification notify = new AccNotification();
			//create notification that will send to Employeer
			notify.setDate(LocalDateTime.now());
			notify.setFromAccount_id(offer.getOwner());
			notify.setMassage("new Offer on Task : " + this.task + "   Id: " + this.id);
			notify.setState(false);
			notify.setToAccount_id(this.employer);
			//send notification
			this.employer.addNotification(notify);
			//create log
			LogManager.Log(offer.getOwner().getId() + "  make Offer to Task : " + this.id);
			se.getTransaction().commit();
			end = true;
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.fillInStackTrace());
			se.getTransaction().rollback();
			end = false;
		} finally {
			//check if he open a new session to close it 
			if (flage) //close the new session
			{
				se.close();
			}
			return end;
		}
	}
}
