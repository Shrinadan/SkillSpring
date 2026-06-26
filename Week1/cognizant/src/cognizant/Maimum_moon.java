package cognizant;

import java.util.Scanner;

public class Maimum_moon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner  scannner=new Scanner(System.in);
      System.out.println("enter row");
      int n=scannner.nextInt();
      System.out.println("enter column");
      int m=scannner.nextInt();
      int [][] arr=new int[n][m];
      for(int i=0; i<n; i++)
      {
    	  for(int j=0; j<n; j++)
    		  arr[i][j]=scannner.nextInt();
      }
//      for(int i=0; i<n; i++)
//      {
//    	  for(int j=0; j<n; j++)
//    		  System.out.println(arr[i][j]);
//      }
      int maxi=Integer.MIN_VALUE;
      
      for(int i=0; i<n; i++)
      {
    	  int sum=0;
    	  for(int j=0; j<m; j++)
    	  {
    		  sum=sum+arr[i][j];
    	  }
    	  maxi=Math.max(maxi, sum);
      }
      
      
		 System.out.println("maximum sum=f row" +maxi);
		
	}

}
1 2 3
2 3 4 
4 5 6
i=0;
sum=arr[0][0]=1;
sum 1+2+3
arr[1][0]
		maximum kar de bhai bas
		
		
		
