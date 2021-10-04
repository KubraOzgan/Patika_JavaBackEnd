package store;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CellPhoneGenerator c = new CellPhoneGenerator();
		NotebookGenerator n = new NotebookGenerator();
		BrandGenerator b = new BrandGenerator();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("PatikaStore Product Management Panel!\n"
				+ "1 - Notebook Operations\n"
				+ "2 - Cell Phone Operations\n"
				+ "3 - List Brands\n"
				+ "0 - Exit\n");
		
		while(true)
		{
			System.out.println("PatikaStore Product Management Panel!\n"
					+ "1 - Notebook Operations\n"
					+ "2 - Cell Phone Operations\n"
					+ "3 - List Brands\n"
					+ "0 - Exit\n");
			System.out.println("Please enter your preference: ");
			int select = sc.nextInt();
			
			System.out.println("Your preference: " + select + "\n\n");
			
			switch(select)
			{
				case 1:
				{
						System.out.println("Notebook Operations!\n"
								+ "1 - List notebooks\n"
								+ "2 - Add notebook\n"
								+ "3 - List notebooks by id\n"
								+ "4 - List notebooks by brand\n"
								+ "5 - Delete notebooks by id\n"
								+ "0 - Exit\n");
						System.out.println("Enter: ");
						choice = sc.nextInt();
						
						if(choice == 1)
						{
							n.listNotebooks();
						}
						else if(choice == 2)
						{
							System.out.println("Brand: ");
							String aBrand = sc.next();
							System.out.println("Product Name: ");
							String aProduct = sc.next();
							
							n.add(new Notebook(b.getBrand(aBrand), aProduct, 4,  25, 5000.50, 0.25, 16, 512, 14.0));;
						}
						else if(choice == 3)
						{
							System.out.println("Enter id: ");
							int id = sc.nextInt();
							n.listById(id);
						}
						else if(choice == 4)
						{
							System.out.println("Enter brand name: ");
							String brand = sc.next();
							n.listByBrand(brand);
						}
						else if(choice == 5)
						{
							System.out.println("Enter id: ");
							int id = sc.nextInt();
							n.delete(id);
						}
						else if(choice == 0)
						{
							break;
						}
						else
						{
							System.out.println("You entered wrong value");
						}
					break;
				}
				
				case 2:
				{
						System.out.println("Cellphone Operations!\n"
								+ "1 - List cellphones\n"
								+ "2 - Add cellphone\n"
								+ "3 - List cellphones by id\n"
								+ "4 - List cellphones by brand\n"
								+ "5 - Delete cellphones by id\n"
								+ "0 - Exit\n");
						System.out.println("Enter: ");
						choice = sc.nextInt();
						
						if(choice == 1)
						{
							c.listCellPhones();
						}
						else if(choice == 2)
						{
							System.out.println("Brand: ");
							String aBrand = sc.next();
							System.out.println("Product Name: ");
							String aProduct = sc.next();
							
							c.add(new CellPhone(b.getBrand(aBrand), aProduct, 4, 100, 3500.0, 0.15, "Gray", 
									32, 12, 128, 6.1, 4000.0));;
						}
						else if(choice == 3)
						{
							System.out.println("Enter id: ");
							int id = sc.nextInt();
							c.listById(id);
						}
						else if(choice == 4)
						{
							System.out.println("Enter brand name: ");
							String brand = sc.next();
							c.listByBrand(brand);
						}
						else if(choice == 5)
						{
							System.out.println("Enter id: ");
							int id = sc.nextInt();
							c.delete(id);
						}
						else if(choice == 0)
						{
							break;
						}
						else
						{
							System.out.println("You entered wrong value");
						}
					break;
				}
				
				case 3:
				{
					System.out.println("Brands");
					System.out.println("--------------");
					
					b.printBrands();
					
					break;
				}
				
				case 0:
				{
					return;
				}
				
				default: 
				{
					System.out.println("You entered wrong value\n");
					break;
				}
			}
		}
	}

}












