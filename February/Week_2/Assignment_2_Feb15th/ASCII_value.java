package assignment2_Feb15;

import java.util.Scanner;

public class ASCII_value 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the any character ");
			
			char chr = scan.next().charAt(0);
			
			int value = chr;
			
			System.out.println("The ASCII value is " + value);
			
			scan.close();
	}
}
