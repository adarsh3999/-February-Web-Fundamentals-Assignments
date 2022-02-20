package assignment1_Feb14;

public class ReverseLeftTriangleStarPattern 
{

	public static void main(String[] args) 
	{
		
		for (int a = 0; a < 5; a++) 
		{
			for (int b = 4; b >= a; b--) 
			{
				System.out.print("*");

			}
			System.out.println();
		}


	}

}
