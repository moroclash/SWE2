/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.general.backendapi;

import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import freelaning.Employer;
import freelaning.EmployerProfile;
import freelaning.Freelancer;
import freelaning.Skill;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author moroclash
 */
@Path("/mange")
public class APIs {

	
	
	@GET
	@Path("Login/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public String hello(@PathParam("param") String username,String password) {
		return "helo";
	}

}
