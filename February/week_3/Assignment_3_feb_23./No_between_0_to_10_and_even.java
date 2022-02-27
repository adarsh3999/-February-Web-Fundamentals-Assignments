package assignment_3_feb_23;

import java.util.Scanner;

public class No_between_0_to_10_and_even {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = ab.nextInt();
		
		if(num<=10)
		{
			if(num%2==0) 
			{
				System.out.println("Number is in between 0 to 10 and even : "+num);
			}
			else 
			{
			System.out.println("Number is not satisfied the condition.");	
			}
		}
		
		ab.close();

	}

}
