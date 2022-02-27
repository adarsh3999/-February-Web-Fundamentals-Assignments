package assignment_1_feb_21;

public class First_7_terms_of_N_into_6N_where_it_is_divisible_by_6 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; count <= 6; i++) 
		{
			int terms = (i * (6 * i));
			if (terms % 6 == 0) 
			{
				System.out.println(terms);
				count++;
			}
		}

	}

}
