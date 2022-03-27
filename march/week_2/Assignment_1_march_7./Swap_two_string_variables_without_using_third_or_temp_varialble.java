package Assignment_1_march_7;

import java.util.Scanner;

public class Swap_two_string_variables_without_using_third_or_temp_varialble 
{

	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		String str1 = ab.nextLine();
		String str2 = ab.nextLine();

		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);
		
		ab.close();

	}

}
