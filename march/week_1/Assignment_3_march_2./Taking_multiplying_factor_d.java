package Assignment_3_march_2;

import java.util.Scanner;

public class Taking_multiplying_factor_d {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter multiplying factor");
		int d =sc.nextInt();
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr1[]=new int[n];
		
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			 arr1[i]= arr[i]*d;
			 System.out.println(arr1[i]);
		}

	}

}
