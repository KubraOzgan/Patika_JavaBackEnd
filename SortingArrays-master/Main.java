package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] array;
		int temp=0;
		
		Scanner take = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = take.nextInt();
		
		array = new int [n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the value of array's " + (i+1) + " element: ");
			array[i] = take.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Sorting from min to max: " + Arrays.toString(array) + "\n");

	}

}
