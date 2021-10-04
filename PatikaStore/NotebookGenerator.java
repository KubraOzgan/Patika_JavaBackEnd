package store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotebookGenerator {
	
	List<Notebook> notebook = new ArrayList<>();
	BrandGenerator brand = new BrandGenerator();
	
	//Brand brand, String pName, int id, int stock, String price, double discount, int ram, int storage,
	//double screen
	
	public NotebookGenerator()
	{
		notebook.add(new Notebook(brand.getBrand("Huawei"), "HUAWEI Matebook 14 ", 1,  25, 7000.0, 0.25, 16, 512, 14.0));
		notebook.add(new Notebook(brand.getBrand("Lenovo"), "LENOVO V14 IGL", 2,  14, 3699.0, 0.25, 8, 1024, 14.0));
	}
	
	public void listNotebooks()
	{
		String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
		
		System.out.println("--------------------------------------------------------------------------------------------\n");
		System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
		System.out.println("--------------------------------------------------------------------------------------------\n");
		
		for(Notebook n : notebook)
		{
			System.out.format(leftAlignFormat, n.getId(), n.getpName(), n.getPrice(), n.getBrand().getBrandName(),
					n.getStorage(), n.getScreen(),  n.getRam());
		}
		
		System.out.println("--------------------------------------------------------------------------------------------\n");
	}
	
	public void listById(int id)
	{
		String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
		
		System.out.println("--------------------------------------------------------------------------------------------\n");
		System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
		System.out.println("--------------------------------------------------------------------------------------------\n");
		
		Iterator<Notebook> iterator = notebook.iterator();
		while(iterator.hasNext())
		{
			Notebook n = iterator.next();
		    if (n.getId() == id)
		    {
		    	System.out.format(leftAlignFormat, n.getId(), n.getpName(), n.getPrice(), n.getBrand().getBrandName(),
						n.getStorage(), n.getScreen(),  n.getRam());
		    	break;
		    }
		}	
	}
	
	public void listByBrand(String brandN)
	{
		String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
		String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
		
		System.out.println("--------------------------------------------------------------------------------------------\n");
		System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
		System.out.println("--------------------------------------------------------------------------------------------\n");
		
		Iterator<Notebook> iterator = notebook.iterator();
		while(iterator.hasNext())
		{
		    Notebook n = iterator.next();
		    String b = n.getBrand().getBrandName();
		    if (b.equalsIgnoreCase(brandN))
		    {
		    	System.out.format(leftAlignFormat, n.getId(), n.getpName(), n.getPrice(), n.getBrand().getBrandName(),
						n.getStorage(), n.getScreen(),  n.getRam());
		    }
		}
		
	}
	
	public void add(Notebook n)
	{
		this.notebook.add(n);
	}
	
	public void delete(int id)
	{
		Iterator<Notebook> iterator = notebook.iterator();
		while(iterator.hasNext())
		{
		    Notebook value = iterator.next();
		    if (value.getId() == id)
		    {
		        iterator.remove();
		        break;
		    }
		}
	}

}
