/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendsw2;

import freelaning.Experience;
import freelaning.Skill;
import java.util.HashSet;
import org.hibernate.Session;

/**
 *
 * @author moroclash
 */
public class BackEndSW2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		select();
	}

	
	public static void select()
	{
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		Experience e1 = (Experience) se.get(Experience.class,1);
		System.out.println(e1.getId());
		System.out.println(e1.getLink());
		System.out.println(e1.getPicture());
		System.out.println(e1.getSummary());
		e1.getTechnologies().clear();
		se.update(e1);
		se.getTransaction().commit();
		se.close();
	}
	
	
	public static void insert() {
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		Skill s1 = new Skill("C++");
		Skill s2 = new Skill("java");
		Skill s3 = new Skill("Rouy");
		Skill s4 = new Skill("C");

	
		
		
		Experience e1 = new Experience();
		e1.setLink("www.google.com");
		e1.setPicture("llllllllllllllllllllllllllllllll");
		e1.setSummary("lllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
		HashSet<Skill> Hs1 = new HashSet<>();
		Hs1.add(s1);
		Hs1.add(s2);
		Hs1.add(s3);
		e1.setTechnologies(Hs1);
		
		Experience e2 = new Experience();
		e2.setLink("www.yahoo.com");
		e2.setPicture("yaaahooooooooooooooooooo");
		e2.setSummary("yahhhhhhhhhhhhhhhhhhhhhhhhhhhhoooooooooooooooooooo");
		HashSet<Skill> Hs2 = new HashSet<>();		
		Hs2.add(s1);
		Hs2.add(s4);
		e2.setTechnologies(Hs2);
		
		se.save(e1);
		se.save(e2);
		
		se.getTransaction().commit();
		se.close();
	}

}
