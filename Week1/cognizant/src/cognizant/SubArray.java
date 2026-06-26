package cognizant;

import java.sql.SQLSyntaxErrorException;

public class SubArray {

	public static void main(String [] args)
	{
		int finalx=0;
		int [] arr= {1,2,3,4};
		int n=arr.length;
		for(int i=0; i<n; i++)
		{ 
			for(int j=i; j<n; j++)
				
			{
				int xor=0;
				for(int k=i; k<=j; k++)
				{// har subaaray ka xor hai 
					xor=xor^arr[k];
				}
				finalx=finalx^xor;
			}
			// last me sab kar xor karna hai 
			
			 
			
		}
		System.out.println(finalx);
		
	}
}
//
//1,2.
//1
//2
//1,2 =1^2 =3
//1^2^3;
