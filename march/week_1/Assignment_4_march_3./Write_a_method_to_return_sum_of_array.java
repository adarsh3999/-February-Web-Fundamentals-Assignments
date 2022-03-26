package Assignment_4_march_3;

import java.util.Scanner;

public class Write_a_method_to_return_sum_of_array 
{

	public static void sumOfArray(int len)
	{
		Scanner ab = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("Enter the element of first array :: ");
		int arr1[] = new int[len];

		for ( i = 0; i < len; i++) 
		{
			arr1[i] = ab.nextInt();
		}

		System.out.print("Enter the element of second array :: ");
		int arr2[] = new int[len];

		for ( i = 0; i < len; i++) 
		{
			arr2[i] = ab.nextInt();
		}
		
		
		int arr[] = new int[len];
		
		for(  i=0; i<len; i++)
		{
			arr[i]=arr1[i] + arr2[i];
			
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter the length of array :: ");
		int len = ab.nextInt();
		
		sumOfArray(len);
		

	}

}
