package cognizant;

public class SumArray {
public static void main(String [] args)
{
	int [] arr= {1 ,2, 3, 4, 5};    //14   12 9  5 0
	int replace=0;
	for(int i=arr.length-1; i>=0; i--)
	{
		int sum=arr[i];
		arr[i]=replace;
		sum=sum+arr[i];
		replace=sum;
	}
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
}
}
