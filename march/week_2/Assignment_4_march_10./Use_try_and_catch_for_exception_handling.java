package Assignment_4_march_10;

public class Use_try_and_catch_for_exception_handling 
{

	public static void main(String[] args) 
	{
		
		int arr[] = {0,1,0,1,0};

		try 
		{
			int a = arr[6];
		} 
		
		catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
			System.out.println("Exception Found :: Index out of bound");
		}
	}

}
