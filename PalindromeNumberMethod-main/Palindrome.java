import java.util.Scanner;

public class PalindromeNumberMethod {

	
	static String isPalindrome(int number)
	{
		
		int temp = number, reverseNumber = 0, lastNumber;
		
		while(temp != 0)
		{
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		
		if(number == reverseNumber)
			return "Palindrome";
		else
			return "Not polindrome";
				
		}
	
	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		System.out.println("Enter the value of number:");
		int num = take.nextInt();
		
		System.out.println(isPalindrome(num));
	}

}
