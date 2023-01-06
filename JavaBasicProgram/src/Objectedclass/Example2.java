package Objectedclass;


public class Example2 extends Demo {
		

	public static void main(String[] args) {
		Example2 s=new Example2();
		//below two statments are equlavalent
		System.out.println(s);
		System.out.println(s.toString());//String repesented of object
		System.out.println(s.hashCode());//it convert Hexadecimal address in to decimal and return value
		Demo d1=new Demo();
		System.out.println(d1);
		//or 
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
		
	
		

	}

}
