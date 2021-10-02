package transpose;

import java.util.Scanner;

public class Main {
	
	static void transpose(int[][] array, int row, int column)
	{
		int newRow = column;
		int newColumn = row;
		
		int[][] transpose = new int [newRow][newColumn];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				transpose[j][i] = array[i][j];
				
			}
		}
		
		for(int i=0; i<newRow; i++)
		{
			for(int j=0; j<newColumn; j++)
			{
				System.out.print(transpose[i][j] + " ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the value of row: ");
		int row = take.nextInt();
		
		System.out.println("Enter the value of column: ");
		int column = take.nextInt();
		
		int[][] array = new int [row][column];
		
		System.out.println("\nEnter the values: ");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				array[i][j] = take.nextInt();
			}
		}
		
		System.out.println("\nMatrix:");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(array[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose:");
		
		transpose(array, row, column);

	}

}
