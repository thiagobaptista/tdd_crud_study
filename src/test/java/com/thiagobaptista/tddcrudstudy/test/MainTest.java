package com.thiagobaptista.tddcrudstudy.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import com.thiagobaptista.tddcrudstudy.Catalog;
import com.thiagobaptista.tddcrudstudy.Product;

public class MainTest
{	
	@Test
	public void should_fetch_previously_registered_product_from_catalog()
	{
		Product p = getProduct();
		
		Catalog c = new Catalog();
		c.register(p);
		
		Collection<Product> registeredProducts = c.getAllProducts();
		assertTrue( registeredProducts.contains(p) );
	}
	
	@Test
	public void should_not_a_catalog_contain_an_unregistered_product()
	{
		Product p = getProduct();
		
		Catalog c = new Catalog();
		
		Collection<Product> registeredProducts = c.getAllProducts();
		assertFalse( registeredProducts.contains(p) );
	}
	
	@Test
	public void should_an_empty_catalog_have_no_product()
	{
		Catalog c = new Catalog();
		
		Collection<Product> registeredProducts = c.getAllProducts();
		
		assertTrue( registeredProducts.isEmpty() );
	}
	
	private Product getProduct()
	{
		Product p = new Product();
		p.setName("Flux Capacitor");
		p.setCategory("Time-travelling Wares");
		
		return p;
	}
}