package Exceptionhandling;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		System.out.println("program start from here...");
		//1.abhormal statements
		int i=10;
		int j=i/0;//Arithmeticexception
		System.out.println("res:"+j);
		//2.abhormal statements
		//int[] empIds=new int[3];
		//empIds[3]=101;//arrayindexoutofboundsexception
		//3.abnormal statements
		//String str=null;
		//System.out.println(str.length());//nullpointexception
		//4.abnoraml statments 
		//String s="abc";
		//int num=Integer.parseInt(s);//numberformatexception
		//System.out.println("num:"+num);
		//System.out.println("program end here...");

	}

}
