package cognizant;
 class Prod{
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int mul(int a, int b, int c)
	{
		return a*b*c;
	}
}
public class Method_Overloading {
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prod p=new Prod();
	
		System.out.println(p.mul(2, 3));
		System.out.println(p.mul(2, 3,4));

	}

}
