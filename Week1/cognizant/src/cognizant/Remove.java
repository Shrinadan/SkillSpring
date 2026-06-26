package cognizant;

public class Remove {
    public static String special(String str) {
        // Alphanumeric characters ko uda dega, sirf special chars bachenge
       //
    	//return str.replaceAll("[^a-zA-Z0-9]", "");
    	StringBuilder sb=new StringBuilder();
    	for(int i=0; i<str.length(); i++)
    		
    	{
    		char ch=str.charAt(i);
    		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')// || ch>='0' && ch<='9'
    		{
    			sb.append(ch);
    		}
    			
    	}
    	return sb.toString();
    }

    public static void main(String[] args) {
        String string = "Shri@123#$"; 
        System.out.println("Result: " + special(string)); // Output: @#$
    }
}
