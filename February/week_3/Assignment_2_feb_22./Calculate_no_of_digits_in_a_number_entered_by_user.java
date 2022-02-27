package assignment_2_feb_22;

import java.util.Scanner;

public class Calculate_no_of_digits_in_a_number_entered_by_user 
{

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		int num = ab.nextInt();
		
		int count = 0;
		
		while( num != 0) 
		{
			num=num/10;
			++count;
		}
		
		System.out.println("number of digits is : " +count);
		
		ab.close();
	}

}
