package cognizant;


import java.util.Scanner;


public class StringMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String s1=scanner.next();
		int m=scanner.nextInt();
		String s2=scanner.next();
		int i=0;
		int j=0;
		StringBuilder sb=new StringBuilder();
		
		while(i<n && j<m)
		{
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(j));
			i++;
			j++;
		}
     
		while(i<n)
		{
			sb.append(s1.charAt(i));
			i++;
		}
		while(j<m)
		{
			sb.append(s2.charAt(j));
			j++;
		}
		
		System.out.println(sb.toString());

	}

}
//4 
//shri
//4
//ragh
//srhargih

