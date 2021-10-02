import java.util.Scanner;

public class Calculator {
	
	static void plus() {
		
		Scanner take = new Scanner(System.in);
		
		int number, result = 0, i = 1;
		
		while(true)
		{
			System.out.println(i++ + " .number: ");
			number = take.nextInt();
			
			if(number == 0)
				break;
			
			result += number;
		}
		
		System.out.println("Result: " + result);
		
	}
	
	static void minus() {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter: ");
		int counter = take.nextInt();
		
		int number, result = 0;
		
		for(int i=1 ; i<=counter; i++)
		{
			System.out.println(i + " .number: ");
			number = take.nextInt();
			
			if(i == 1)
			{
				result += number;
				continue;
			}
			
			result -= number;
		}
		
		System.out.println("Result: " + result);
		
	}
	
	static void times() {
		
		Scanner take = new Scanner(System.in);
		
		int number, result = 1, i =1;
		
		while(true)
		{
			System.out.println(i++ + " .number: ");
			number = take.nextInt();
			
			if(number == 1)
				break;
			
			if(number == 0)
			{
				result = 0;
				break;
			}
			
		result *= number;
		}
		
		System.out.println("Result: " + result);
	}
	
	static void divided() {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter: ");
		int counter = take.nextInt();
		
		double number, result = 0.0;
		
		for(int i=1; i<=counter; i++)
		{
			System.out.println(i + " .number: ");
			number = take.nextDouble();
			
			if(i != 1 && number == 0)
			{
				System.out.println("Divisor can't be 0!");
				continue;
			}
			
			if(i == 1)
			{
				result += number;
				continue;
			}
			
			result /= number;
		}
		
		System.out.println("Result: " + result);
	}
	
	static void power() {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the value of base: ");
		int base = take.nextInt();
		
		System.out.println("Enter the value of exponent: ");
		int exponent = take.nextInt();
		
		int result = 1;
		
		for(int i=1; i<= exponent; i++)
		{
			result *= base;
		}
		
		System.out.println("Result: " + result);
	}
	
	static void factorial() {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the value of number: ");
		int number = take.nextInt();
		
		int result = 1;
		
		for(int i=1; i<= number; i++)
		{
			result *= i;
		}
		
		System.out.println("Result: " + result);
		
	}
	
	static void mod() {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the value of dividend: ");
		int dividend = take.nextInt();
		
		System.out.println("Enter the value of diviser: ");
		int diviser = take.nextInt();
		
		int result = dividend % diviser;
		
		System.out.println("Result: " + result);
		
	}
	
	static void area_perimeter_ofrectangle() {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the value of edges: ");
		int edge1 = take.nextInt();
		int edge2 = take.nextInt();
		
		int area = edge1 * edge2;
		int perimeter = 2 * (edge1 + edge2);
		
		System.out.println("Area: " + area + " and Perimeter: " + perimeter);
		
	}
	

	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		int select;
		
		String menu = "1 - Addition \n" +
					  "2 - Extraction \n" +
					  "3 - Multiplication \n" +
					  "4 - Division \n" +
					  "5 - Exponent \n" +
					  "6 - Factorial \n" +
					  "7 - Modulo \n" +
					  "8 - The Area and Perimeter of a Rectangle \n" +
					  "0 - Exit \n";
		
		do {
			
			System.out.println(menu);
	        System.out.print("Please select an option :");
	        select = take.nextInt();
          
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	  mod();
                	  break;
                case 8:
                	  area_perimeter_ofrectangle();
                	  break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again: ");
            }
	}
		while(select != 0);

}
	
}
