package Objectedclass;

class TestSample{
	void callme() {
		System.out.println("hello");
	}
	
}


public class Example4 extends TestSample {
	static int lastroll=100;
	int rollno;
	//constructor
	Example4(){
		rollno=lastroll;
		lastroll++;
	}
	//@override
	public int hashCode() {
		//System.out.println("hascode of ");
		return   505;
	}
	//@override
	public String toString() {
		return "Basiccorejava";
	}

	public static void main(String[] args) {
	  Example4 s=new Example4();
	  //Below two statment are eqaulent
	 // System.out.println(s);
	  System.out.println("lastroll is"+lastroll);
	  System.out.println("roll is "+ s.rollno);

	  System.out.println(s.hashCode());
	 System.out.println(s);
	  System.out.println("value"+ s.hashCode());
	  
	  s.hashCode();
	  TestSample t1=new TestSample();
	  System.out.println(t1);
	  System.out.println(t1.hashCode());
	  t1.callme();

	}

}
