/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.general.backendapi;

import freelaning.Skill;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.hibernate.Session;

/**
 *
 * @author moroclash
 */
@Path("/mange")
public class APIs {
	
	@GET
	@Path("/{param}")
	public String hello(@PathParam("param") String msg)
	{
		Session se = databaseManager.SessionsManager.getSessionFactory().openSession();
		se.getTransaction().begin();
		int output = (int) se.save(new Skill(msg));
		se.getTransaction().commit();
		se.close();
		return "*_* : "+output;
	}
}
