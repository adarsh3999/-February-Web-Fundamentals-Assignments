package Assignment_4_march_10;

public class Use_finally_block_for_catching_exceptions
{

	public static void main(String[] args) 
	{
		int N1 = 99;
		int N2 = 0;

		try 
		{
			int div = N1 / N2;
				
		} 
		
		catch (Exception ex) 
		{
			System.out.println("Exception Found");
		}

		finally 
		{
			System.out.println("In finally block");
		}


	}

}
