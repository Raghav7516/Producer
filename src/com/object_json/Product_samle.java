package com.object_json;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/product")
public class Product_samle {

	@GET
	@Path("/sample")
	@Produces("application/xml")
	public Object sample(){
		Sample s=new Sample();
		s.setPid(25);
		s.setPname("books");
		s.setPrice(25.36);
		return s;
	}
}
