package com.test.rs;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.model.Account;

@Path("/sample")
public class SampleService {

	//@Path("/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello(){
		//return "<html><title>Hello World!</title> <body>Hello word voila !</body></html>";
		return "Hello world";
	}
	
	@Path("/testacn/{account_id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAccount(@PathParam("account_id") String accountId){
		
		Account account = new Account(); 
		account.setAccountId(accountId);
		account.setAccountName("Sushil");
		account.setAccountType("Type");
		
		Response rs = Response.status(200).entity(account).build();
		return rs;
	}
	
	@Path("order/{orderid}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getOrder1(@PathParam("orderid") String orderid){
		System.out.println("order is : " + orderid);
		return "SUCCESSFUL orderid is : " + orderid;
	}
	
}
