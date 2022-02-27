package assignment_1_feb_21;

import java.util.Scanner;

public class Number_is_divisible_by_2_and_8_but_not_12 
{
	public static void main(String[] args) 
	{
	
	Scanner ab = new Scanner(System.in);
	
	System.out.print("Enter the number = ");
	int num = ab.nextInt();
	
	if((num%2==0) && (num%8==0) && !(num%12==0)) 
	{
	System.out.println("condition is satisfied");	
	}
	else
	{
		System.out.println("condition is not satisfied");
	}
	
	ab.close();
	
	}

}
