package cognizant;

import java.util.Scanner;

public class ARRay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int [] arr=new int[2*n];
		for(int i=0; i<2*n; i++)
		{
			arr[i]=scanner.nextInt();
			
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" "+arr[i+n]);
		}
		
	}

}
// n=3
//		 1,2,3,4,5,6
//		 i=0 1&4
//		 i=1 2&4
//		 i=2 3&6