package cognizant;

import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;
import java.util.concurrent.ForkJoinPool;

public class hcf {
	public static void main(String[] args)
	{
		/// bro find highset number to divide both number
		int a=12; //2*3*2
		int b=18;// 2*3*3
		for(int i=Math.min(a, b)) ; i>=1; i--)
{
	if(a%i==0 && b%i==0)
	{ hcf=i;
	break;
	}
		
	}
}
		
		int hcf=1;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
;
			}
		}
		 
		System.out.println(hcf);
	}
//	
//	while(b!=0)
//	{
//		int temp=b;
//		b=a%b;
//		a=temp;
//	}
//
//}
//a = 12, b = 18
//
//temp = 18
//b = 12 % 18 = 12
//a = 18
//
//a = 18, b = 12
//
//temp = 12
//b = 18 % 12 = 6
//a = 12
//
//a = 12, b = 6
//
//temp = 6
//b = 12 % 6 = 0
//a = 6
//
//GCD = 6
// t.comp o(logmin(a.b);
	
	f)
