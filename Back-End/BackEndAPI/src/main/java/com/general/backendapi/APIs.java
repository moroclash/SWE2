/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.general.backendapi;

import freelaning.Employer;
import freelaning.EmployerProfile;
import freelaning.Freelancer;
import freelaning.Skill;
import java.io.Serializable;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author moroclash
 */
@Path("/mange")
public class APIs{
	
	
	@GET
	@Path("getEmp/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employer hello(@PathParam("param") int in)
	{
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		Employer em = (Employer) se.get(Employer.class, in);
		System.out.println("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		se.close();
		System.out.println("mdsadmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm::::::::::::::: "+ in + " skill "+em.getUserName());
		System.out.println("mdsadmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm::::::::::::::: "+ in + " lsa, "+em.getProfile().getPicture());
		System.out.println("mdsadmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm::::::::::::::: "+ in + " aaaa "+em.getDate());
		System.out.println("mdsadmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm::::::::::::::: "+ in + " vvvv "+em.getProfile().getRate());		System.out.println("llllksllllllllllllllllaklsssssssssssssssssssssssssssssss");
//		TestObj t = new TestObj();
		return em;
	}
}
