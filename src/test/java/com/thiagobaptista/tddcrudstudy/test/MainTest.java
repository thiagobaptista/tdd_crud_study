package com.thiagobaptista.tddcrudstudy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thiagobaptista.tddcrudstudy.Product;

public class MainTest
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
}