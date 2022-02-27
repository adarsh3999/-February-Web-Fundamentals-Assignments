package assignment_4_feb_24;

import java.util.Scanner;

public class Pyramid_pattern {

	public static void main(String[] args) {
	
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int n = ab.nextInt();
		
		for(int i=1; i<=n; i++) 
		{
			for(int j=(n-1); j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		ab.close();

	}

}
