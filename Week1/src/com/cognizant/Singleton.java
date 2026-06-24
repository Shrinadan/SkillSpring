package com.cognizant;
 class OnePrint{
	 public void print()
	 {
		 System.out.println("printing");
	 }
 }
public class Singleton {

	public static void main(String [] args)
	{
		OnePrint onePrint=new OnePrint();
		onePrint.print();
		
	}
}
