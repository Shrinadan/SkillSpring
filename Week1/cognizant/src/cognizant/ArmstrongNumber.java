package cognizant;

public class ArmstrongNumber {
	
	public static void main(String[] args)
	{
		 int num=15;
		 int origi=num;
		 int sum=0;
		 while(num>0)
		 {
			 int ld=num%10;
			 sum=sum+ld*ld*ld;
			 num=num/10;
		 }
		 if(sum==origi)
		 {
			 System.out.println("armstrong number");
		 }
		 else {
			
			System.out.println("lauda nhin");	
			}
		}
	}


