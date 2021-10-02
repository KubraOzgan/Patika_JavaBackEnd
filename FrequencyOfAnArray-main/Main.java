package frequency;

import java.util.Scanner;

public class Main {
	
	
	static void count(int[] array, int n)
	{
		boolean visited[] = new boolean[n];
		
		for(int i=0; i<n; i++)
		{
			if(visited[i] == true)
				continue;
			
			int count = 0;
			
			for(int j=0; j<n;j++)
			{
				if(array[i] == array[j])
				{
					visited[j] = true;
					count++;
				}
			}
			
			System.out.println(array[i] + " " + count);	
		}
	}

	public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int n = take.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the values: ");
		for(int i=0; i<n; i++)
		{
			array[i] = take.nextInt();
		}
		
		count(array,n);

	}

}
