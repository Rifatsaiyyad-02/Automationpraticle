package Exceptionhandling;

public class Exceptionhandling3 {

	public static void main(String[] args) {
		try {
			//below code do not throw any exception
			int data =25/0;
			System.out.println(data);
		
		}
		
		
		//catch wont be executed 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled...");
		
		//executed regardless of exception occurred or not		
			}
		finally {
			System.out.println("finally block is alwaly exxecuted");
		}
		System.out.println("rest of the code...");

	}

}
