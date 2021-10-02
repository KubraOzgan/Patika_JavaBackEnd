package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = take.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i == 0 || i == n-1 || j == 0 || j == n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i == n-2 || j == 0 || j == n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
