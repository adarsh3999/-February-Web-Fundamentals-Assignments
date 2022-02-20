package assignment2_Feb15;

import java.util.Scanner;

public class celsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner ab=new Scanner(System.in);
		
		System.out.println("Enter the value for temperature in degree celsius ");
		
		int value =ab.nextInt();
		
		Double fahrenheit = (value*1.8) + 32;
		
		System.out.println("The value in fahrenheit is "+fahrenheit);
		
		ab.close();
		
	}

}
