package assignment3_Feb18And19;

import java.util.Scanner;

public class Sum_of_all_digits_in_a_number 
{

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		int number = ab.nextInt();

		int sum = 0;
		
		while (number > 0) 
		{

			int remender = number % 10;
			
			sum = sum + remender;
			
			number = number / 10;

		}
		
		System.out.println(sum);
		
		ab.close();
	}

}
