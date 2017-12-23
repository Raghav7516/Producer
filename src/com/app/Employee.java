package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/home")
public class Employee {
	
	@Path("/hi/{name}")
	@GET
	public String hi(@PathParam("name")String name){
		return "hello friends "+name;
	}
	@GET
	@Path("/hello")
	public String hello(@QueryParam("address")String address){
		return address;
	}
	@GET
	@Path("/email")
	public String mail(@MatrixParam("email")String email){
		return email;
	}
	@POST
	@Path("/form")
	public String data(@FormParam("eid")int eid){
		return "hello "+eid;
	}
	@POST
	@Path("/head")
	public String head(@HeaderParam("sal")int sal){
		return "salary "+sal;
		
	}

}
