package cognizant;

import java.io.CharArrayReader;

public class Bubble_sort {

	public static void main(String [] args)
	{
		int [] arr= {2,3,4,1,6,7};
		for(int i=0; i<arr.length-1; i++)
		{      
			for(int j=i; j<arr.length-i-1; j++)
			{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		}
		for(int num:arr)
		{System.out.println(num);
			
		}
	}
}
