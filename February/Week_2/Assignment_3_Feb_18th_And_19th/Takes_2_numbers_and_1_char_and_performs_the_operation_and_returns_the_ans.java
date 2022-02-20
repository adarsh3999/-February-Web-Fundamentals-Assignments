package assignment3_Feb18And19;

import java.util.Scanner;

public class Takes_2_numbers_and_1_char_and_performs_the_operation_and_returns_the_ans {

	public static void main(String[] args) 
	{
		
		Scanner ab = new Scanner(System.in);
		
		int a = ab.nextInt();
		int b = ab.nextInt();
		
		System.out.println("Enter character");
		
		char chr = ab.next().charAt(0);
		
		if (chr == '+') 
		{
			System.out.println(a + b);

		} 
		else if (chr == '-') 
		{
			System.out.println(a - b);

		} 
		else if (chr == '*') 
		{
			System.out.println(a * b);

		}
		else 
		{
			System.out.println(a / b);

		}
		
		ab.close();

	}

}
