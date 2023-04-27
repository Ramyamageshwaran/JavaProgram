package week1.day2;

public class PalindromeProg {

		public static void main(String[] args)
	  {
		// Declare an int Input and assign a value
		int inputNum=13231;
	    int s=0;
	    // Assign the input value in temporary storage
		int temp=inputNum;
		int r;
		for (int i=0;i<5;i++)
		{
			r=inputNum%10;
			s=s*10+r;
			inputNum=inputNum/10;
		}
		if(temp==s)
		  {
		  System.out.print(temp);
          System.out.print("  is a Palindrome");
	      }
		else {
			System.out.print(temp);
			System.out.print(" is not a Palindrome");
	         }
       }
}
