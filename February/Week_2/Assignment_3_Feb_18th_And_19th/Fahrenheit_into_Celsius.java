package assignment3_Feb18And19;

import java.util.Scanner;

public class Fahrenheit_into_Celsius 
{
	public static void main(String[] args) 
	{
		
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter the value in fahrenheit ");
	
	double fahrenheit = ab.nextFloat();
	
	double  degreeCelsius;
	
	degreeCelsius= (fahrenheit - 32) * 5/9;
	
	System.out.println("In degreeCelsius is "+degreeCelsius);
	
	ab.close();
	
	}
	

}
