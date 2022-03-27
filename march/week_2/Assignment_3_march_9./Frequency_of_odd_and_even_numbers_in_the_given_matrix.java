package Assignment_3_march_9;

import java.util.Scanner;

public class Frequency_of_odd_and_even_numbers_in_the_given_matrix 
{

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int row = ab.nextInt();
		System.out.println("Enter the number of columns");
		int cols = ab.nextInt();

		System.out.println("Enter the element of matrix");
		int[][] mat = new int[row][cols];

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				mat[i][j] = ab.nextInt();
			}
		}

		int count_even = 0;
		int count_odd = 0;
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				if (mat[i][j] % 2 == 0) 
				{
					count_even++;
				} 
				else 
				{
					count_odd++;
				}
			}
		}

		System.out.println("Number of even:: " + count_even);
		System.out.println("Number of odd:: " + count_odd);

		
		ab.close();
	
	
	}

}
