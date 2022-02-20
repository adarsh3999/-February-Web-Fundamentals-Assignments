package assignment2_Feb15;

import java.util.Scanner;

public class HourToDaysAndYear {

	public static void main(String[] args) 
	{
		Scanner AB = new Scanner(System.in);
		
		System.out.print("Enter the value for Hour ");
		
		int Hour = AB.nextInt();
		
		double Day = Hour * 0.0416667;
		
		double Year = Hour * 0.000114155;
		
		System.out.println("The Day is "+ Day);
		
		System.out.println("The Year is "+ Year);
		
		AB.close();
		
	}

}
