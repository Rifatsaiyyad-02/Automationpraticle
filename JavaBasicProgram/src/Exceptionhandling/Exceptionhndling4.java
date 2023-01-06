package Exceptionhandling;

public class Exceptionhndling4 {

	public static void main(String[] args) {
	try {
		System.out.println("inside the try block");
		//below code throws divied by zero expcetion
		int data =25/5;
		//System.exit(0);
		System.out.println(data);
	}
	//cannot handle Arithmetic type exception 
	//can only accep null pointer type exception
	catch(NullPointerException e) {
		System.out.println(e);
	} 
	//executed regardless of expception occured or not
	finally {
		System.out.println("i am inside finally block");
		int k=10/0;
		System.out.println("finally block is always executed"+k);
	}
	System.out.println("rest of the code....");

	}

}
