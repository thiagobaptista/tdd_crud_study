package com.thiagobaptista.tddcrudstudy;

public class Product
{
	private String name;
	private Object category;
	
	public void setName(String name)
	{
		this.name = name;		
	}

	public String getName() {
		return name;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}
	
	@Override
	public boolean equals(Object product)
	{
		Product other = (Product) product;
		
		if (other.name != null)
		{
			if ( !other.name.equals(this.name) )
			{
				return false;
			}
		}
		
		if (other.category != null)
		{
			if ( !other.category.equals(this.category) )
			{
				return false;
			}
		}
		
		return true;
	}
}
