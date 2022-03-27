package Assignment_3_march_9;

import java.util.Scanner;

public class If_given_matrix_is_sparse_matrix 
{
	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number of rows ");

		int row = ab.nextInt();

		System.out.println("Enter the number of columns  ");
		int cols = ab.nextInt();

		int[][] mat = new int[row][cols];
		System.out.println("Enter the matrix:: ");

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				mat[i][j] = ab.nextInt();
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < cols; j++) 
			{
				if (mat[i][j] == 0) {
					count++;
				}
			}

		}
		
		if (count > ((row * cols) / 2)) 
		{
			System.out.println("The given matrix is sparse matrix");
		} else {
			System.out.println("The given matrix is not a sparse matrix");
		}

		ab.close();
	
	}
}
