package cognizant;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_duplicate {
  
	public static void main(String [] args)
	{
		
		        int[] arr = {1, 2, 2, 3, 1, 4};

		        // Step 1: sort array (important)
		        Arrays.sort(arr);

		        int n = arr.length;

		        int j = 0; // last unique index

		        for(int i = 1; i < n; i++) {

		            if(arr[i] != arr[j]) {
		                j++;
		                arr[j] = arr[i];
		            }
		        }

		        // print unique elements
		        for(int i = 0; i <= j; i++) {
		            System.out.print(arr[i] + " ");
		        }
		 
//		       HashSet<Integer> set=new HashSet<>();
//		       set.add(num);
//		       for(int val :set)
//		       {
//		    	   System.out.println(val);
//		       }
	}
}
