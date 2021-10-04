package store;

import java.util.Iterator;
import java.util.TreeSet;


public class BrandGenerator {
	
	TreeSet <Brand> brands = new TreeSet<>();

	public BrandGenerator() 
	{
		brands.add(new Brand(1, "Samsung"));
		brands.add(new Brand(2, "Lenovo"));
		brands.add(new Brand(3, "Apple"));
		brands.add(new Brand(4, "Huawei"));
		brands.add(new Brand(5, "Casper"));
		brands.add(new Brand(6, "Asus"));
		brands.add(new Brand(7, "HP"));
		brands.add(new Brand(8, "Xiomi"));
		brands.add(new Brand(9, "Monster"));
	}
	
	public void printBrands()
	{
		for(Brand b : brands)
		{
            System.out.println("- "+b.getBrandName());
        }
	}
		
	public void addBrand(Brand b)
	{
		this.brands.add(b);
	}
	
	public Brand getBrand(String brandName)
	{
		Iterator<Brand> itr = brands.iterator();
		Brand b;
		
		while(itr.hasNext())
		{
			b = itr.next();
			if(b.getBrandName().equalsIgnoreCase(brandName))
			{
				return b;
			}
		}
		
		return null;
	}
}
