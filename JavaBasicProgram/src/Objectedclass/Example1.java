package Objectedclass;

class Demo{
	void dispalay() {
		System.out.println("i am dispay");
	}
}


public class Example1 extends Demo {
	static int last_roll=100;
	int rollno;
	//constructor
	Example1(){
		rollno=last_roll;
		last_roll++;
	}

	public static void main(String args[]) {
		
		Example1 s=new Example1();
		System.out.println(s);//java compler  writes----->s.toString()------>string represents of object-->hexadecimaladdress
		//or
		System.out.println(s.toString());
		Demo d1=new Demo();
		System.out.println(d1);//d1.toString 
		Demo d3=new Demo();
		System.out.println(d3);
		Demo d2=new Example1();
		System.out.println(d2);
		
		
		
		
	}

}
/**
 * String repesented---->fullqulifiedclassname@hexadecimaladderess
 * packagename.classname@hexadecimaladdress
 */
