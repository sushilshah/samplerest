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

@Path("/account")
public class ProductService {

	@Path("add")
	@POST
	//@Produces(MediaType.APPLICATION_JSON)
	public Response addProduct(@FormParam("prod_id") String prodId){
		
		Response rs = Response.status(200).entity("Product added successfully . <br> name : " + prodId+ " <br>").build();
		return rs;
	}
	
	@Path("/get/{prod_id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProduct(@PathParam("prod_id") String prodId){
		
		Account account = new Account();
		account.setAccountId(prodId);
		account.setAccountName("Sushil");
		account.setAccountType("Type");
		System.out.println("received prod id is : " + prodId);
		Response rs = Response.status(200).entity(account).build();
		return rs;
	}
	
}
