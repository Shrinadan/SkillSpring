package cognizant;

import java.util.Scanner;

public class PrimeNUM {
 public static void main(String [] args)
 {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("enter a number"); // Moved above nextInt() so it prompts the user first
     int n = scanner.nextInt();
	 
     // Changed loop condition to i <= n so it includes the last number too
	 for(int i = 1; i <= n; i++)
	 {
		 // BUG FIX 1: Check 'i' instead of 'n' to correctly skip the number 1
		 if(i <= 1)
		 {
			 continue;
		 }
		 
		 boolean prime = true;
		 
		 // BUG FIX 2: Added '=' to ensure perfect squares are thoroughly verified
		 for(int j = 2; j <= Math.sqrt(i); j++ )
		 {
			 // BUG FIX 3: Fixed the calculation order (number % factor)
			 if(i % j == 0)
			 {
				 prime = false;
				 break;
		 }
		 
		 if(prime)
		 {
			 System.out.print(i + " "); // Using print instead of println to display them side-by-side
		 }
			 
	 }
	 scanner.close();
 }
 }
}
 