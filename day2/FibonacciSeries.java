package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Declare and Initialize  int variables
		
		int range=8 , firstNum=0 , secNum=1, sum;
		
		System.out.println("LIST OF FIBONACCI SERIES");
		System.out.println(firstNum);
		
		// Iterate from 1 to the range
		
		for(int i=1;i<range;i++)
		{
			// add first and second number assign to sum
			
			sum = firstNum + secNum;
			
			// Assign second number to the first number
			
			firstNum = secNum;
			
			// Assign sum to the second number
						
			secNum = sum;	
			// print the output
			
			System.out.println(firstNum);
		}
		

	}

}
