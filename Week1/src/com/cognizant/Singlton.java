package com.cognizant;
class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {

        if(instance == null) {
            instance = new Logger();
        }

        return instance;
    }
}
public class Singlton {

	public static void main(String[] args) {
		 Logger l1 = Logger.getInstance();
	        Logger l2 = Logger.getInstance();

	        System.out.println(l1);
	        System.out.println(l2);
     
	}

}
