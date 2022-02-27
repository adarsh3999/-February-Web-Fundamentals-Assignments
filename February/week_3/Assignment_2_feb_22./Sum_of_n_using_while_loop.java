package assignment_2_feb_22;

import java.util.Scanner;

public class Sum_of_n_using_while_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int sum=0;
		int i =1;
		while(i<=num) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);

	}

}
