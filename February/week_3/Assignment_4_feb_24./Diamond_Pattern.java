package assignment_4_feb_24;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);

		int i, j, r;
		System.out.print("Enter number of rows : ");
		r = ab.nextInt();
		
		for (i = 0; i <= r; i++) 
		{
			for (j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
				
			for (j = 1; j <= 2 * i - 1; j++) 
			{
				System.out.print("*");
			}
				
			System.out.print("\n");
		}

		for (i = r - 1; i >= 1; i--) 
		{
			for (j = 1; j <= r - i; j++) 
			{
				System.out.print(" ");	
			}
				
			for (j = 1; j <= 2 * i - 1; j++) 
			{
				System.out.print("*");
			}
				
			System.out.print("\n");
		}

	}

}
