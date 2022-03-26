package Assignment_4_march_3;

import java.util.Scanner;

public class Find_the_last_index_at_which_element_is_present_in_array 
{
	public static void main(String args[])
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter the Size of array :: ");
		int n = ab.nextInt();
		
		int [] arr = new int[n];
		
		int i;
		
		System.out.println("Enter the elements of array :: ");
		
		for(i=0; i<arr.length; i++)
		{
			arr[i] = ab.nextInt();
		}
				
		System.out.println("At index last the element "+arr[arr.length-1]+" is present.");
		
		ab.close();
	}

}
