package Assignment_3_march_2;

import java.util.Scanner;

public class Middle_element_of_array {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];

		
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int firstindex = 0;
		int lastindex = arr.length - 1;
		
		int middleindex = firstindex + (lastindex - firstindex) / 2;

		System.out.println("The middle index is : " + middleindex);
		System.out.println("The element in middle index is : " + arr[middleindex]);

	}

}
