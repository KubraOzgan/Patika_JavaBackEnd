package store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CellPhoneGenerator {

	List<CellPhone> cPhone = new ArrayList<>();
	BrandGenerator brand = new BrandGenerator();
	
	//Brand brand, String pName, int id, int stock, double price, double discount, String color,
	//int camera, int ram, int storage, double screen
	
	public CellPhoneGenerator()
	{
		cPhone.add(new CellPhone(brand.getBrand("Samsung"), "SAMSUNG GALAXY A51", 1, 100, 3199.0, 0.15, "Black", 
				32, 6, 128, 6.5, 4000.0));
		cPhone.add(new CellPhone(brand.getBrand("Xiaomi"), "Redmi Note 10 Pro 8GB", 2, 18, 4000.12, 0.15, "White", 
				35, 12, 128, 6.5, 4000.0));
	}
	
	
	public void listCellPhones()
	{
		String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s | %-5s | %-8s |%n";
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
		System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "Camera", "Battery", "RAM", "Color");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
		
		for(CellPhone c : cPhone)
		{
			System.out.format(leftAlignFormat, c.getId(), c.getpName(), c.getPrice(), c.getBrand().getBrandName(),
					c.getStorage(), c.getScreen(), c.getCamera(), c.getBattery(), c.getRam(), c.getColor());
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
	}
	
	public void listById(int id)
	{
		String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s | %-5s | %-8s |%n";
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
		System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "Camera", "Battery", "RAM", "Color");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
		
		/*for(CellPhone c : cPhone)
		{
			if(c.getId() == id)
			{
				System.out.format(leftAlignFormat, c.getId(), c.getpName(), c.getPrice(), c.getBrand().getBrandName(),
						c.getStorage(), c.getScreen(), c.getCamera(), c.getBattery(), c.getRam(), c.getColor());
			}

		}*/

		Iterator<CellPhone> iterator = cPhone.iterator();
		while(iterator.hasNext())
		{
		    CellPhone c = iterator.next();
		    if (c.getId() == id)
		    {
		    	System.out.format(leftAlignFormat, c.getId(), c.getpName(), c.getPrice(), c.getBrand().getBrandName(),
						c.getStorage(), c.getScreen(), c.getCamera(), c.getBattery(), c.getRam(), c.getColor());
		    	break;
		    }
		}	
	}
	
	public void listByBrand(String brandN)
	{
		String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s | %-5s | %-8s |%n";
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
		System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "Camera", "Battery", "RAM", "Color");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
		
		/*for(CellPhone c : cPhone)
		{
			if(c.getId() == id)
			{
				System.out.format(leftAlignFormat, c.getId(), c.getpName(), c.getPrice(), c.getBrand().getBrandName(),
						c.getStorage(), c.getScreen(), c.getCamera(), c.getBattery(), c.getRam(), c.getColor());
			}

		}*/
		
		Iterator<CellPhone> iterator = cPhone.iterator();
		while(iterator.hasNext())
		{
		    CellPhone c = iterator.next();
		    String b = c.getBrand().getBrandName();
		    if (b.equalsIgnoreCase(brandN))
		    {
		    	System.out.format(leftAlignFormat, c.getId(), c.getpName(), c.getPrice(), c.getBrand().getBrandName(),
						c.getStorage(), c.getScreen(), c.getCamera(), c.getBattery(), c.getRam(), c.getColor());
		    }
		}
		
	}
	
	public void add(CellPhone c)
	{
		this.cPhone.add(c);
	}
	
	public void delete(int id)
	{
		Iterator<CellPhone> iterator = cPhone.iterator();
		while(iterator.hasNext())
		{
		    CellPhone value = iterator.next();
		    if (value.getId() == id)
		    {
		        iterator.remove();
		        break;
		    }
		}
	}
	
}
