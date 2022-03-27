package Assignment_4_march_10;

public class Handle_exception_using_throw_keyword
{
	public static void handleException()
	{
	    try
	    {
	        throw new NullPointerException();
	    }
	    catch(NullPointerException ex)
	    {
	        System.out.println("inside method.");
	        throw ex; 
	    }
	}

	public static void main(String args[])
	{
	    try
	    {
	    	handleException();
	    }
	    catch(NullPointerException ex)
	    {
	        System.out.println("inside main.");
	    }
	}
}
