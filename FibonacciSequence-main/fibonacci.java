import java.util.Scanner;

public class Fibonacci {
	
	
	static int fibonacci(int number)
	{
		
		if(number == 1 || number == 2)
			return 1;
		
		else
			return fibonacci(number-2) + fibonacci(number-1);
		
	}

	public static void main(String[] args) {


		Scanner take = new Scanner (System.in);
		
		System.out.println("Enter the value of number: ");
		int number = take.nextInt();
		
		System.out.println(fibonacci(number));

	}

}
