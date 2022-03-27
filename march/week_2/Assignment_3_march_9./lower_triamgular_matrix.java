package Assignment_3_march_9;

import java.util.Scanner;

public class lower_triamgular_matrix 
{

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);

		System.out.println("size of matrix");
		int size = ab.nextInt();
		int[][] a = new int[size][size];

		System.out.println("Enter the matrix:: ");
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				a[i][j] = ab.nextInt();
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(j<=i)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}

		ab.close();
	
	}

}
