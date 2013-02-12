package com.thiagobaptista.tddcrudstudy.test;

import org.junit.Test;

import com.thiagobaptista.tddcrudstudy.Product;

public class MainTest
{
	@SuppressWarnings("unused")
	@Test
	public void should_there_be_a_product()
	{
		Product p = new Product();
	}
	
	public void should_a_product_have_a_name()
	{
		Product p = new Product();
		p.setName("Notebook Negativo");
	}
}