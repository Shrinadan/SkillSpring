package cognizant;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,5,};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>first)
			{
				second=first;
			first=arr[i];
			}
			
		
		else if(second<arr[i] && first!=arr[i])
		{
			second=arr[i];
		}
		}
		System.out.println(second);
		System.out.println(first);
	}

}
//int [] arr= {1,2,4,5,};
//i=0 1>0
//sec=first
//first=1
//i=2
//2>1
//sec=1
//first=2
//i=2
//4>2
//sec=2
// same aise 
// in the seond arr[i]

