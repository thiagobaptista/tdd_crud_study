package com.thiagobaptista.tddcrudstudy;

import java.util.ArrayList;
import java.util.Collection;

public class Catalog
{
	private Collection<Product> registeredProducts;
	
	public void register(Product p)
	{
		if (registeredProducts == null)
		{
			registeredProducts = new ArrayList<Product>(0);
		}
		
		registeredProducts.add(p);
	}

	public Collection<Product> getAllProducts()
	{
		return registeredProducts;
	}
}
