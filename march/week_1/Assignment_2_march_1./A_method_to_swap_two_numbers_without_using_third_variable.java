package Assignment_2_march_1;

import java.util.Scanner;

public class A_method_to_swap_two_numbers_without_using_third_variable 
{
	public static void swappingLogic(int num1, int num2)
	{
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("after swap num1 = "+num1 +" and num2 = "+num2);
	}
	

	public static void main(String[] args) 
	{
		
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num_1 = ab.nextInt();
		
		System.out.println("Enter second number : ");
		int num_2 = ab.nextInt();
		
		System.out.println("Before swap num1 = "+num_1 +" and num2 = " +num_2);
		
		swappingLogic(num_1, num_2);
		
		ab.close();
	}

}
