package week1.day2;

public class FindInterSection {

	public static void main(String[] args) {
		// Declare an array and assign the values 
		
		int input1[] = {3,2,11,4,6,7};
		
		// Declare another array and assign the values
		
		int input2[] = {1,2,8,4,9,12};
		
		System.out.println("Find the Inter Section Numbers in Arrays");
		
		// Declare a nested for another array from 0 to array length
		
		for(int i=0;i<input1.length;i++)
		{
			for(int j=0;j<input2.length;j++)
			{
				 //Compare Both the arrays using a condition statement
				
				if(input1[i]==input2[j])
				{
					// Print the first array (shoud match item in both arrays)
					System.out.println(input1[i]);
				}
			}
		}

	}

}
