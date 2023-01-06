package Exceptionhandling;

import java.util.Scanner;

public class ExceptionHanding1 {

	public static void main(String[] args) {
	System.out.println("program start from here...");
	//1.abnormal statements 
	int i,j,k;
	Scanner scn=new Scanner(System.in);
	System.out.println("enter first num1");
	i=scn.nextInt();
	System.out.println("enter first num2");
	j=scn.nextInt();
	try {
		k=i/j;//Arithmeticexception
		System.out.println("res:"+k);
	}catch(ArithmeticException obj) {
 {
		//System.out.println("Exception handled"+obj);
		obj.printStackTrace();
	}
	System.out.println("program end here.....");

	}
	

}
}
