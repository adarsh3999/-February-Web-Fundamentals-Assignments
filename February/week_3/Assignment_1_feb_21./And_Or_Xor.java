package assignment_1_feb_21;

import java.util.Scanner;

public class And_Or_Xor {

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter the value for a");
		int a = ab.nextInt();
		System.out.println("Enter the value for b");
		int b = ab.nextInt();
		
		int And = a & b;
		System.out.println("And operation of a and b : " +And);
		
		int Or = a|b;
		System.out.println("Or operation of a and b : " +Or);
		
		int Xor = a^b;
		System.out.println("Xor operation of a and b : " +Xor);
		
		ab.close();

	}

}
