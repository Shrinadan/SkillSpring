package cognizant;

public class CountStringLength {
 
	public static void main(String [] args)
	{
		int count=0;
		String string="abcd";
		for(int i=0; i<string.length(); i++)
		{
		
			count++;
			
		}
		System.out.println(count);
		System.out.println(string.length());
	}
}
