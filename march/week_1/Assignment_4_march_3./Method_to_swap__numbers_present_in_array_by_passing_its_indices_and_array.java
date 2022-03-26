package Assignment_4_march_3;

import java.util.Scanner;

public class Method_to_swap__numbers_present_in_array_by_passing_its_indices_and_array 
{
	public static void main(String[] args) 
	{
		
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter length of arrays:: ");
		int len = ab.nextInt();
		Swap(len);

	}

	public static void Swap(int a) 
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter elements of array:: ");
		int[] array = new int[a]; 
		
		
		for(int i=0;i<a;i++)
		{
			array[i]=ab.nextInt();
		}
		System.out.println("Enter two indexes to swap:: ");
		int ind1 = ab.nextInt();
		int ind2 = ab.nextInt();
		array[ind1]=array[ind1]+array[ind2];
		array[ind2]=array[ind1]-array[ind2];
		array[ind1]=array[ind1]-array[ind2];
		
		for(int i=0;i<a;i++){
			System.out.print(array[i] +" ");
		}
	}
}