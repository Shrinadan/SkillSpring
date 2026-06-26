package cognizant;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String string="shrinan dan kumar";
         String str=string.toLowerCase();
         int count=0;
         for(int i=0; i<str.length(); i++)
         {
        	 char ch=str.charAt(i);
        	 if(ch=='a' || ch=='i' || ch=='e' || ch=='o' ||  ch=='u')
        	 {
        		 count++;
        	 }
         }
         System.out.println(count);
	}

}
