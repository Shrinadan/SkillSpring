package cognizant;

public class Last_Duplicate {

	public static void main(String [] args)
	{
		int [] arr= {1,2,4,4,5,6};
		for(int i=arr.length-1; i>=0; i--)
		{
			if(arr[i]==arr[i-1])
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
