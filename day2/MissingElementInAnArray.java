package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//Declare an input and assign the value
		
		int input[] = {1,2,4,7,3,6,8};
		
		//Sort the array
		
		for(int i=0;i<input.length;i++)
		{
		for(int j=i+1;j<input.length;j++)
		{
			if(input[i]>=input[j])
			{
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				
			}
		}	
		}
		System.out.println("Missing Element in Array ");
		for(int k=0;k<input.length;k++)
		{
			// check if the iterator variable is not equal to the array values respectively
			
			if((input[k+1]-input[k])!=1)
				{
					System.out.println(input[k]+1);
					// once printed break the iteration
					break;
				}
			
		}

	}

}