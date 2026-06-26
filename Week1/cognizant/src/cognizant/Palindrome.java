package cognizant;

import java.util.Scanner;

public class Palindrome {
	
//  public static boolean Palindrome(String str)
//  {
//	  int left=0;
//	  int right=str.length()-1;
//	  while(left<right)
//	  {
//		  if(str.charAt(left)!=str.charAt(right))
//		  {
//			  return false;
//		  }
//		  left++;
//		  right--;
//	  }
//	  return true;
//	  
//  }
	
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("String de bhosdi");

		String string=scanner.nextLine();
		
		// if interviwer say no using two pointer so my approach tarverse the string in the last and add a new string so and compare given string and new string so 
		 
		String rev="";
		for(int i=string.length()-1; i>=0; i--)
		{
			rev=rev+string.charAt(i);
		}
		if(string.equals(rev))
		{
			System.out.println("palindrome ba");
		}
		else {
			System.out.println("lauda ban");
			
		}
		
	}
}
