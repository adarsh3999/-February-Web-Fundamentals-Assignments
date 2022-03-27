package Assignment_1_march_7;

import java.util.Scanner;

public class Find_all_permutations_of_a_string 
{
	public void permute(String str1, int i, int j) 
	{
		if (i == j) {
			System.out.println(str1);
		} else {
			for (int x = i; x < j; x++) {
				str1 = swap(str1, i, x);
				permute(str1, i + 1, j);
				str1 = swap(str1, i, x);

			}
		}
	}

	public String swap(String a, int i, int j) 
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);

	}
	
	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);
		String str = ab.nextLine();

		int n = str.length();
		Find_all_permutations_of_a_string permute1 = new Find_all_permutations_of_a_string();
		permute1.permute(str, 0, n - 1);

		permute1.permute(str, 0, n);
		
		ab.close();

	}

}
