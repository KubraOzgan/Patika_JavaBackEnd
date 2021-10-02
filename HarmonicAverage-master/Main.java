package harmonic;

import java.util.*;

public class Main {
	
	static double harmonic(int n, double[] array)
	{
		double sum=0.0;
		for(int i=0; i<n; i++)
		{ 
			sum += 1/array[i];
		}
		
		return n/sum;
	}

	public static void main(String[] args) {
		
		double[] array;
		
		Scanner take = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = take.nextInt();
		
		array = new double [n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the value of array's " + (i+1) + " element: ");
			array[i] = take.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("Harmonic Average is: " + harmonic(n, array));
			
	}

}
