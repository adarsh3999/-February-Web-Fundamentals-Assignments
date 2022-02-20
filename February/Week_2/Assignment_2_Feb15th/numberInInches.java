package assignment2_Feb15;

import java.util.Scanner;

public class numberInInches 
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for inches :: ");
		
		float i = sc.nextInt();
		
		double meters = i * 0.0508;
		
		System.out.println(" The value in meters is " + meters);
		
		sc.close();
	}

}
