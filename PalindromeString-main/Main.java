package palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String word = take.next();
		
		int length = word.length();
		String reverse = "";
		
		for(int i=length-1; i>=0; i--)
		{
			reverse +=  word.charAt(i);
		}
		
		if(word.equals(reverse))
		{
			System.out.println(word + " is palindrome.");
		}
		else
		{
			System.out.println(word + " is'nt palindrome.");
		}

	}

}
