package assignment3_Feb18And19;

public class Square_of_sum_up_to_10_example 
{

	public static void main(String[] args) 
	{
		
		int sum = 0;
		
		for (int a = 1; a <= 10; a++) 
		{
			int sqr = a * a;

			sum = sum + sqr;

		}
		System.out.println(sum);
	}
	

}
