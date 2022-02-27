package assignment_1_feb_21;

import java.util.Scanner;

public class Binary_equivalent_of_given_number {

	public static void main(String[] args) 
	{
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num = ab.nextInt();
		
		System.out.println(Integer.toBinaryString(num));

		ab.close();
	}

}
