package Exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("program start from here...");
		//1.abnoramal stattement
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter array size:.");
		int size=scn.nextInt();
		int[] empIds=new int[size];
		try {
			System.out.println(empIds[3]);//arrayIndexofBoundsexception
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("expetion hendle"+e);
			e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
		System.out.println("program end");

	}

}
