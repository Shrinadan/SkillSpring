package cognizant;

import java.util.Scanner;

public class Replace {
 public static void main(String [] args)
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int [] arr=new int[n];
	 for(int i=0; i<n; i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 int maxsofar=-1;
	 for(int i=n-1; i>=0; i--)
	 {
		 int current=arr[i];
		 arr[i]=maxsofar;
		 maxsofar=Math.max(maxsofar, current);
		
		 
	 }
	 for(int i=0; i<n; i++)
	 {
		 System.out.println(arr[i]);
	 }
 }
}
 /// first is travaerse frolast and 
//1 2 3 4
//i=3
//curent=4;
//arr=-1
//maxsofar=4
//arr[4 -1]
//		maxsofar 3
//		arr=4,4-1
//		 4.4,4,-1
//4
//1
//2
//3
//4
//4
//4
//4
//-1

		