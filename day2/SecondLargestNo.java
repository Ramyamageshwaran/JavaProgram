package week1.day2;

public class SecondLargestNo {

	public static void main(String[] args) {
		// Declare an integer Input in array and assign a value
		int input[]= {10,8,5,2,74};
		
		//Sort the array using nested for loop
		
		for(int i=0;i<input.length;i++)
		{
		for(int j=i+1;j<input.length;j++)
		 {
			//check the condition using if condition
			if(input[i]>=input[j])
			{
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				
			}
			
		 }
    	}
		System.out.println("Sorted Array:  ");
		for(int k=0;k<input.length;k++)
		{
		System.out.println(input[k]);
		}
		 //find second largest number in array
		
		int l=input.length-2;
		System.out.print("Second Largest Number in Array: ");
		System.out.print(input[l]);
}
}