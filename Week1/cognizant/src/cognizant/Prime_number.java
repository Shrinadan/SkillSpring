package cognizant;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter a number");
       int n = scanner.nextInt();
       
       boolean isprime = true;
       
       // Fix 1: Handle edge cases where n is less than or equal to 1
       if (n <= 1) {
           isprime = false;
       } else {
           // Fix 2: Changed '<' to '<=' to catch perfect squares like 9, 25, 49
           for (int i = 2; i <= Math.sqrt(n); i++) {
        	   if (n % i == 0) {
        		   isprime = false;
        		   break;
        	   }
           }
       }
       
       if (isprime) {
    	   System.out.println("prime num");
       } else {
    	   System.out.println("not prime number");
       }
       
       scanner.close();
	}
}