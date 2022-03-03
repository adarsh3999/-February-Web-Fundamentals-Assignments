package Assignment_1_feb_28;

import java.util.Scanner;

public class Three_different_methods_each_takes_int_float_long_numbers_as_input_and_returns_its_multiplication_value 
{
	public static int intMultiply(int a, int b)
	{
		int mul = a*b;
		
		return mul;
	}
	public static long longMultiply(long a, long b)
	{
		long mul_1 = a*b;
		
		return mul_1;
	}
	public static Float floatMultiply(float a, float b)
	{
		float mul_2 = a*b;
		
		return mul_2;
	}

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter first integer number : ");
		int m = ab.nextInt();
		System.out.println("Enter second integer number : ");
		int n = ab.nextInt();
		
		int result_1 = intMultiply(m,n);
		
		System.out.println(result_1);
		
		System.out.println("Enter first long number : ");
		long o = ab.nextLong();
		System.out.println("Enter second long number : ");
		long p = ab.nextLong();
		
		long result_2 = longMultiply(o,p);
		
		System.out.println(result_2);
		
		System.out.println("Enter first float number : ");
		float q =ab.nextFloat();
		System.out.println("Enter second float number : ");
		float r =ab.nextFloat();
		
		float result_3 = floatMultiply(q,r);
		
		System.out.println(result_3);
		
		ab.close();
		
	}

}
