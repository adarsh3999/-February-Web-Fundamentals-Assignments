package Assignment_2_march_1;

import java.util.Scanner;

public class A_method_to_reverse_a_number 
{
	
	public static int ReverseNumber(int num)
	{
		int reverse=0;
		
		while(num != 0) 
		{ 
		int remainder = num % 10; 
		reverse = reverse * 10 + remainder; 
		num = num/10; 
		}
		
		return reverse;
	}

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = ab.nextInt();
		
		int reverseNumber =  ReverseNumber(number);
		
		System.out.println("The reverse number is : "+reverseNumber);
		
		ab.close();

	}

}
