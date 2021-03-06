package com.thiagobaptista.tddcrudstudy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thiagobaptista.tddcrudstudy.Product;

public class ProductTest
{
	@Test
	public void should_two_products_with_different_names_be_different()
	{
		Product p1 = new Product();
		p1.setName("Notebook Negativo");
		
		Product p2 = new Product();
		p2.setName("Comically-oversized Lightsaber");
		
		assertNotEquals(p1, p2);
	}
	
	@Test
	public void should_products_from_different_categories_be_different()
	{
		Product p1 = new Product();
		p1.setCategory("Electronics");
		
		Product p2 = new Product();
		p2.setCategory("Books");
		
		assertNotEquals(p1, p2);
	}
	
	@Test
	public void should_two_products_with_equal_names_have_the_same_name()
	{
		Product p1 = new Product();
		p1.setName("Narnia Closet");
		
		Product p2 = new Product();
		p2.setName("Narnia Closet");
		
		assertEquals(p1.getName(), p2.getName());
	}
	
	@Test
	public void should_two_products_with_different_names_be_named_differently()
	{
		Product p1 = new Product();
		p1.setName("Narnia Closet");
		
		Product p2 = new Product();
		p2.setName("Willow-with-Dragon-heart-string Wand");
		
		assertNotEquals(p1.getName(), p2.getName());
	}
	
	@Test
	public void should_two_equal_products_be_equal()
	{
		Product p1 = new Product();
		p1.setName("Space Personality Core");
		p1.setCategory("Rogue AIs & Accessories");
		
		Product p2 = new Product();
		p2.setName("Space Personality Core");
		p2.setCategory("Rogue AIs & Accessories");
		
		assertEquals(p1, p2);
	}
	
	@Test
	public void should_two_equal_products_have_the_same_hashcode()
	{
		Product p1 = new Product();
		p1.setName("Space Personality Core");
		p1.setCategory("Rogue AIs & Accessories");
		
		Product p2 = new Product();
		p2.setName("Space Personality Core");
		p2.setCategory("Rogue AIs & Accessories");
		
		assertEquals(p1.hashCode(), p2.hashCode());
	}
	
	@Test
	public void should_two_different_products_have_different_hashcodes()
	{
		Product p1 = new Product();
		p1.setName("Space Personality Core");
		p1.setCategory("Rogue AIs & Accessories");
		
		Product p2 = new Product();
		p2.setName("TARDIS");
		p2.setCategory("Time-travelling Wares");
		
		Product p3 = new Product();
		p3.setName("TARDIS");
		
		assertNotEquals(p1.hashCode(), p2.hashCode());
	}
	
	@Test
	public void should_two_products_with_or_without_categories_have_different_hashcodes()
	{
		Product p1 = new Product();
		p1.setName("TARDIS");
		p1.setCategory("Time-travelling Wares");
		
		Product p2 = new Product();
		p2.setName("TARDIS");
		
		assertNotEquals(p1.hashCode(), p2.hashCode());
	}
}
