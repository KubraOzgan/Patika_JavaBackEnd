import java.util.Scanner;

public class Exponent {
	
	static int exponentFunction(int base, int exponent)
	{
		
		if(exponent == 0)
			return 1;
		else
			return base * exponentFunction(base, exponent-1);
		
	}

	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the value of base: ");
		int base = take.nextInt();
		
		System.out.println("Enter the value of exponent: ");
		int exponent = take.nextInt();
		
		System.out.println(exponentFunction(base, exponent));

	}

}
