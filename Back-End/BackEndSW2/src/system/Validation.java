/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.regex.Pattern;

/**
 *
 * @author moroclash
 */
public class Validation {

	private static Validation validation;
	private static boolean flage =false;
	
	private Validation() {			
	}

	public synchronized static Validation getInistace() {
		if(!flage)
		{
			return new Validation();
		}
		else
		{
			return validation;
		}
	}

	public boolean checkPassword(String Password) {
		return Pattern.matches("^((.).(6,7,8,9))$", Password);
//		return Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})", Password);
	}

	public boolean checkString(String str) {
		return Pattern.matches("[a-zA-Z]*", str);
	}

	public boolean checkNumber(String num) {
		return Pattern.matches("[0-9]*", num);
	}

	public boolean checkMail(String mail) {
		return Pattern.matches("^(([a-zA-Z0-9])+)@(([a-zA-Z0-9])+).[a-z].{1,2}$", mail);
	}

	public boolean checkPhone(String Phone) {
		return Pattern.matches("(?=./d).{11}", Phone);
	}

	public boolean checkVisa(String VisaNum) {
		return Pattern.matches("(?=./d).{15}", VisaNum);
	}

	public boolean checkPath(String path) {
		return Pattern.matches("^(.+)/([^/]+)$", path);
	}
}
