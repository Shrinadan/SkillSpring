package cognizant;

import java.io.CharArrayReader;
import java.net.Socket;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Size_OF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
int i=0;
int j=1;
int count=0;
for(int k=2; k<n; k++)
	
{
	if(arr[i]+arr[k]==arr[j])
{
	count++;
}
	i++;
	j++;
	
}
System.out.println(count);
	}

}
//my appraoch in this code is a travei=0j=1
//k=2
//Socket letSocket arr=[1,4,5,,6,7,8]i=0j=1,k=2
//i=1 j=3 k=3 again aage badge
//		1+5=6