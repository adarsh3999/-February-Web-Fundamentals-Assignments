package assignment_1_feb_21;

import java.util.Scanner;

public class first_3_terms_of_4N_Plus_9_where_it_is_divisible_by_3 
{
	public static void main (String[] args) 
	{
		Scanner ab = new Scanner(System.in);
	
		//System.out.print("Enter the value for N ");
		//int N = ab.nextInt();
		
		int count=1;
		
		for(int i=1; count<=3; i++)
		{
			int a=(3*i+9);
			
			if(a%3 == 0)
			{
				System.out.println(a);
				count++;
			}
			
		}
		
		ab.close();
		
	}

}
