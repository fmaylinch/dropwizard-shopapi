package com.codethen.shopapi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

	// TODO: ProductDAO that fakes a database with a list

	// TODO: getAllProducts

	/** returns the best product in our catalog */
	@GET
	@Path("best")
	public Product findBestProduct() {

		// TODO: return most expensive and available

		System.out.println("Creating fake product");

		Product p = new Product();
		p.setName("tv");
		p.setPrice(1000);
		p.setAvailable(true);
		p.setCreatedOn(new Date());

		return p;
	}

	@POST
	public void createProduct(Product p) {

		// TODO

		System.out.println("creating product: " + p.getName());
	}
}
