package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/school")
public class School {
	
	@GET
	@Path("/sid")
	public String sid(@QueryParam("sid")int id){
		return "School name id is"+id;
	}
	@GET
	@Path("/sname/{sname}")
	public String sname(@PathParam("sname")String name){
		return "school name is"+name;
	}
	@GET
	@Path("/address")
	public String name(@MatrixParam("addr")String hno){
		return "school address is "+hno;		
	}
	@GET
	@Path("/mail")
	public String mail(@HeaderParam("mail")String email){
		return "School mail id is"+email;
	}
	@POST
	@Path("/owner")
	public String hm(@FormParam("cm")String pm){
		return "school owner is "+pm;
		
	}
	
	
	
	
	
	
	

}
