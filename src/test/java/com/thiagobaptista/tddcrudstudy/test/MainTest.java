package com.thiagobaptista.tddcrudstudy.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import com.thiagobaptista.tddcrudstudy.Catalog;
import com.thiagobaptista.tddcrudstudy.Product;

public class MainTest
{	
	@Test
	public void should_register_a_product_into_a_catalog()
	{
		Product p = new Product();
		p.setName("Flux Capacitor");
		p.setCategory("Time-travelling Wares");
		
		Catalog c = new Catalog();
		c.register(p);
	}
	
	@Test
	public void should_fetch_previously_registered_product_from_catalog()
	{
		Product p = new Product();
		p.setName("Flux Capacitor");
		p.setCategory("Time-travelling Wares");
		
		Catalog c = new Catalog();
		c.register(p);
		
		Collection<Product> registeredProducts = c.getAllProducts();
		assertTrue( registeredProducts.contains(p) );
	}
}