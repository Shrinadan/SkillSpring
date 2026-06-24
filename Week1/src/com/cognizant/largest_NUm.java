package com.cognizant;

import java.util.EnumSet;

public class largest_NUm {
	public static void main(String [] args)
	{
		int [] arr= {1,2,3};
		int maxi=arr[0];
		for(int i=0 ; i<arr.length; i++)
		{
			if(maxi<arr[i])
			{
				maxi=arr[i];
			}
		}
		System.out.println(maxi);
	}

}
