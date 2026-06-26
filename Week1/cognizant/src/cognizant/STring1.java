package cognizant;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class STring1 {

	public static void main(String [] args)
	{
		HashSet<String> set=new HashSet<>();
		
		String [] arr= {"abc", "bac"};
		for(int i=0; i<arr.length; i++)
		{
			char []ch=arr[i].toCharArray();
			Arrays.sort(ch);
			set.add(new String(ch));
			
		}
		System.out.println(set.size());
	}
}
//i=abc   set{abc}
//i=1 set{abc} not add because element is already availble
