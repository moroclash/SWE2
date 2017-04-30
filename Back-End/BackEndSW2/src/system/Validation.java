/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author moroclash
 */
public class Validation {

	private static Validation validation;

	private Validation() {

	}

	public Validation getInistace() {
		return null;
	}

	public boolean checkPassword(String Password) {
		return true;
	}

	public boolean checkString(String str) {
		return true;
	}

	public boolean checkNumber(String num) {
		return true;
	}

	public boolean checkMail(String mail) {
		return true;
	}

	public boolean checkPhone(String Phone) {
		return true;
	}

	public boolean checkVisa(String VisaNum) {
		return true;
	}

	public boolean checkPath(String path) {
		return true;
	}
}
