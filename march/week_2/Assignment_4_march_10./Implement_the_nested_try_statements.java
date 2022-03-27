package Assignment_4_march_10;

public class Implement_the_nested_try_statements 
{

	public static void main(String[] args) 
	{
		int x = 10;
		int y = 10;

		try 
		{
			int z = x / y;
			System.out.println(z);
			y = 0;

			try 
			{
				z = x / y;
			}

			catch (Exception ex) 
			{
				System.out.println("Inside nested catch");
			}
		}

		catch (Exception ex) {
			System.out.println("Inside catch");
		}

		finally {
			System.out.println("inside finally");
		}

	}

}
