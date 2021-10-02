public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner take = new Scanner(System.in);
		System.out.println("Enter the value of number:");
		int num = take.nextInt();
		String reverse ="";
		
		String s=String.valueOf(num);
		int length = s.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
	    
		System.out.println("Reverse: "+ reverse);
		
		if(s.equals(reverse))
		{
			System.out.println("Palindrome!");
		}
		
		else
		{
			System.out.println("Not palindrome!");
		}
	}

}
