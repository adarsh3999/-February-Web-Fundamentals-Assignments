package assignment2_Feb15;

import java.util.Scanner;

public class productOfDecimalAndFloat 
{
	public static void main(String[] args) 
	
	{
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the input for a and b");
	
	int a = scan.nextInt();
	
	float b = scan.nextFloat();
	
	float product;
	
	product = a*b;
	
	System.out.println(product);
	
	scan.close();
	
	}
	

	
}
