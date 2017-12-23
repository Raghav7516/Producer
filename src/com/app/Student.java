package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/student")
public class Student {
	
	@GET
	@Path("/id/{roll}")
	public String id(@PathParam("roll")int sid){
		return "student id is "+sid;
	}
	@GET
	@Path("/name")
	public String name(@QueryParam("name")String name){
		return "student name is "+name;
	}
	@GET
	@Path("/marks")
	public String result(@MatrixParam("marks")int marks){
		return "student result is "+marks;
	}
	@POST
	@Path("/subject")
	public String subjects(@FormParam("subject")String sub){
		return "student subjects is "+sub;
	}
	@GET
	@Path("/address")
	public String address(@HeaderParam("add")String address){
		return "student address is "+address;
	}

}
