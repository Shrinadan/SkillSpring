package cognizant;

public class StringReverse {
 public static void main(String [] args)
 {
	 String string="shrinandan";
	  char [] arr=string.toCharArray();
	 int left=0;
	 int right=arr.length-1;
	 while(left<right)
	 {
		 char temp=arr[left];
		 arr[left]=arr[right];
		 arr[right]=temp;
		 left++;
		 right--;
	 }
	 String fString=new String(arr);
	 System.out.println(fString);
	 String revString=new StringBuilder(string).reverse().toString();
	 System.out.println(revString);
	 String loopString=" ";
	 for(int i=string.length()-1; i>=0; i--)
	 {
		 loopString+=string.charAt(i);
	 }
	 System.out.println(loopString);
 }
}
