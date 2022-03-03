package Assignment_1_feb_28;

import java.util.Scanner;

public class A_method_that_adds_2_numbers_and_returns_the_answer 
{
	public static int addNumber(int a, int b)
	{
		int sum = a + b;
		
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = ab.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = ab.nextInt();
		
		int sum = addNumber(num1,num2);
		
		System.out.println("The sum is : "+sum);
		
		ab.close();
		
		}

}
