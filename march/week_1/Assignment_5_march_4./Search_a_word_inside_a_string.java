package Assignment_5_march_4;

import java.util.Scanner;

public class Search_a_word_inside_a_string {

	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str1 = ab.nextLine();
		
		System.out.print("Enter the word that you want to search in string : ");
		String str2 = ab.nextLine();
		
		int count = 0;
		boolean isFound = false;

		for (int i = 0; i < str1.length(); i++) {
			int k = i;
			count = 0;

			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(k) != str2.charAt(j)) {
					break;
				} else {
					count++;
					k++;
				}
			}

			if (count == str2.length()) {
				isFound = true;
				break;
			}
		}
		
		if(isFound)
		{
			System.out.println("The word "+str2+" is present in string.");
		}
		else
		{
			System.out.println("The word "+str2+" is not present in string.");
		}
		
		ab.close();

	}

}
