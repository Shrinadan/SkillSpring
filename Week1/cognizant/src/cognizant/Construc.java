package cognizant;

import java.nio.channels.Pipe.SourceChannel;

abstract class Animal{
	 public Animal() {
		// TODO Auto-generated constructor stub
		 System.out.println("animal constructor callled");
	}
 }
 class Dog extends  Animal{
	 Dog()
	 {
		// super(); // write or not does not matter 
		System.out.println("dog constructor");
	 }
 }
public class Construc {
	public static void main(String [] args)
	{
		Dog dog=new Dog();
	}

}
