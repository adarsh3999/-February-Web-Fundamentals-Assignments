package Assignment_4_march_10;

public class Handle_exception_using_throws_keyword 
{

	public static void handleException() throws IllegalAccessException
    {
        System.out.println("Inside methood.");
        throw new IllegalAccessException();
    }
	
    public static void main(String args[])
    {
        try
        {
        	handleException();
        }
        catch(IllegalAccessException ex)
        {
        	
            System.out.println("inside main.");
            System.out.println(ex.getMessage());
            
        }
    }

}
