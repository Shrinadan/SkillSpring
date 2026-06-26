package cognizant;

import java.util.HashSet;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,4,5};
		int [] arr2= {2,4,5,5,9};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0; i<arr1.length; i++)
		{
			set.add(arr1[i]);
		}
		int count=0;
		for(int i=0; i<arr2.length; i++)
		{
			if(set.contains(arr2[i]))
			{
				 count++;
			}
						
		}

		System.out.println(count);
	}

}
