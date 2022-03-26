package Assignment_4_march_3;

import java.util.Scanner;

public class Find_the_difference_between_2_array {

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter the length of array :: ");
		
		int length = ab.nextInt();
		
		System.out.print("Enter the element of first array :: ");
		int array1[]= new int[length];
		
		for(int i=0; i<length; i++)
		{
			array1[i] = ab.nextInt();
		}
		
		System.out.print("Enter the element of second array :: ");
		int array2[]= new int[length];
		
		for(int i=0; i<length; i++)
		{
			array2[i] = ab.nextInt();
		}
		
		int array[] = new int[length];
		System.out.println("The difference in two array is :: ");
		
		for(int i=0; i<length; i++)
		{
			array[i] = array1[i] - array2[i];
			System.out.print(array[i] + " ");
		}
		
		ab.close();		

	}

}
