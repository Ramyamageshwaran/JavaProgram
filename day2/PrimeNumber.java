package week1.day2;

public class PrimeNumber{

	public static void main(String[] args)
	{
		// Declare an int Input and assign a value 
		int inputNum=13;
		// Declare a boolean variable flag as false
		boolean flag=false;
		// Iterate from 2 to half of the input
		int m=inputNum/2;
		for(int i=2;i<=m;i++)
		{	
			if(inputNum%i==0)
			{
			 System.out.print(inputNum);
		     System.out.print(" is not a Prime Number");
			 flag=true;
			 break;
		    }			
	    }
		
		if(flag==false)
		{
		 System.out.print(inputNum);
		 System.out.print(" is a Prime Number");
		}
     }
		
}	