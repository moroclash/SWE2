/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelaning;

import java.time.LocalDateTime;
import org.codehaus.jackson.annotate.JsonIgnore;


/**
 *
 * @author moroclash
 */
public class AccNotification {
	
	private int id;
	private Account FromAccount_id;
	private ConsumerAccount ToAccount_id;
	private LocalDateTime date;
	private boolean state;
	private String massage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFromAccount_id(Account FromAccount_id) {
		this.FromAccount_id = FromAccount_id;
	}
	public Account getFromAccount_id() {
		return FromAccount_id;
	}
	public void setToAccount_id(ConsumerAccount ToAccount_id) {
		this.ToAccount_id = ToAccount_id;
	}

	public ConsumerAccount getToAccount_id() {
		return ToAccount_id;
	}

	

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	
	
	
}
