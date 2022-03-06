package Assignment_2_march_1;

import java.util.Scanner;

public class A_method_to_print_fibonacci_series 
{
	public static void FibonacciLogic(int n )
	{
		int a =0, b=1, c=0;
		for(int i =1; i<=n; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}	
	}
	
	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter the number for series : ");
		int n= ab.nextInt();
		FibonacciLogic(n);
		
		ab.close();
	}

}
