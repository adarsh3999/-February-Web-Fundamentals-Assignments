package Assignment_2_march_8;

import java.util.Scanner;

public class Add_two_2D_matrices_to_get_the_restul_matrix 
{

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter no. of rows  ");
		int row = ab.nextInt();

		System.out.println("Enter no. of columns ");
		int cols = ab.nextInt();
		
		System.out.println("Enter first matrix  ");

		int[][] arr1 = new int[row][cols];

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				arr1[i][j] = ab.nextInt();

			}
		}

		System.out.println("Enter second matrix ");

		int[][] arr2 = new int[row][cols];

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				arr2[i][j] = ab.nextInt();

			}
		}
		
		int[][] arr3 = new int[row][cols];

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];

			}
		}

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				System.out.print(arr3[i][j] + " ");

			}
			System.out.println();
		}

		ab.close();
		
	}

}
