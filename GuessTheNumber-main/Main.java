package guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		int number = rand.nextInt(100);
		//int number = (int) (Math.random() * 100);
		
		Scanner take = new Scanner(System.in);
		
		int right = 0, selected;
		int[] wrong = new int [5];
		boolean isWin = false;
		boolean isBoundary = false;
		
		while(right < 5)
		{
			System.out.println("Enter your guess: ");
			selected = take.nextInt();
			
			if(selected <0 || selected > 99)
			{
				System.out.println("Please enter between 0 and 100!");
				
				if(isBoundary) 
				{
					System.out.println("You have entered too many incorrect entries,remaining right is: " + (5 - (++right)) + "\n");	
				}
				else
				{
					isBoundary = true; 
					System.out.println("If you'll enter a number that out of boundary, your right will be decrease! \n");
				}
				
				continue; 
			}
			
			if(selected == number)
			{
				System.out.println("Your guess is right! The number is: " + number);
				isWin = true;
				break;
			}
			else
			{
				wrong[right] = selected;
				right++; 
				
				System.out.println("Your guess isn't right!");
				
				if(selected > number)
				{
					System.out.println(selected + " is grater than number.");
				}
				else
				{
					System.out.println(selected + " is smaller than number.");
				}
				
				System.out.println("Remaining right is: " + (5 - right) + "\n");
				
			}
			
		}
		
		if(!isWin)
		{
			System.out.println("\nYou Lost! The number was: " + number + ", you entered: " + Arrays.toString(wrong));
		}

	}

}
