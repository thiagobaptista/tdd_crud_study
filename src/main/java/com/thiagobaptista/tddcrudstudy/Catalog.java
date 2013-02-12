package com.thiagobaptista.tddcrudstudy;

import java.util.ArrayList;
import java.util.Collection;

public class Catalog
{
	private Collection<Product> registeredProducts = new ArrayList<Product>(0);
	
	public void register(Product p)
	{		
		registeredProducts.add(p);
	}

	public Collection<Product> getAllProducts()
	{
		return registeredProducts;
	}
}
