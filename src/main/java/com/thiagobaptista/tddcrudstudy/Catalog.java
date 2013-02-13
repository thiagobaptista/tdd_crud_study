package com.thiagobaptista.tddcrudstudy;

import java.util.Collection;
import java.util.HashSet;

public class Catalog
{
	private Collection<Product> registeredProducts = new HashSet<Product>(0);
	
	public void register(Product p)
	{		
		registeredProducts.add(p);
	}

	public Collection<Product> getAllProducts()
	{
		return registeredProducts;
	}
}
