import java.util.Scanner;

public class RecursivePrimeNumber {
	
	static String primeNumber(int n, int i)
	{
		
		if(n < 2)
			return n + " isn't prime";
		
		if (n == 2)
			return n + " is prime";
		
		if(n > i)
		{
			if(n % i == 0) 
				return n + " isn't prime";
			else
				return(primeNumber(n, ++i));
		}
        
		return n + " is prime";
	}

	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = take.nextInt();
		
		System.out.println(primeNumber(number, 2));
		
	}

}
