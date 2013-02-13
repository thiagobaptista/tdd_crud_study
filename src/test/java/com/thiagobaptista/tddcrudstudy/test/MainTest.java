package com.thiagobaptista.tddcrudstudy.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import com.thiagobaptista.tddcrudstudy.Catalog;
import com.thiagobaptista.tddcrudstudy.Product;

public class MainTest
{	
	@Test
	public void should_fetch_previously_registered_products_from_catalog()
	{
		Product p1 = getProduct();
		Product p2 = getProduct();
		Product p3 = getProduct();
		Product p4 = getProduct();
		
		Catalog c = new Catalog();
		c.register(p1);
		c.register(p2);
		c.register(p3);
		c.register(p4);
		
		Collection<Product> registeredProducts = c.getAllProducts();
		
		assertTrue( registeredProducts.contains(p1) );
		assertTrue( registeredProducts.contains(p2) );
		assertTrue( registeredProducts.contains(p3) );
		assertTrue( registeredProducts.contains(p4) );
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
	
	@Test
	public void should_a_catalog_register_a_product_only_once()
	{
		Product p = getProduct();
		
		Catalog c = new Catalog();
		c.register(p);
		c.register(p);
		c.register(p);
		c.register(p);
		
		Collection<Product> registeredProducts = c.getAllProducts();
		
		assertTrue( registeredProducts.contains(p) );
		assertEquals(1, registeredProducts.size());
	}
	
	private Product getProduct()
	{
		Product p = new Product();
		p.setName("Flux Capacitor");
		p.setCategory("Time-travelling Wares");
		
		return p;
	}
}