package Exceptionhandling;

public class Exceptionhandling5 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			//below code therow divide by zero exception 
			int data =25/0;
			System.exit(0);
			System.out.println(data);
			
		}
		//handle the Arithemetic Exception/divide by zero exption 
		catch(ArithmeticException e) {
			System.out.println("Exception handled ");
			System.out.println(e);
		}
		//executed regardless of exception occured or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of code...");

	}

}
