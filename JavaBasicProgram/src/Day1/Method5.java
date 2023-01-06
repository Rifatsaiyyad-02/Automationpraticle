package Day1;

public class Method5 {
	static int age;
	static double salary;
	

	public static int test1() {
		int pin=201201;

		//System.out.println("i am test method"+pin);
				return pin;
	}
	static void test2() {
		System.out.println("i am test2 method");
		

	}
	static double test3(boolean b1) {
		System.out.println(" i am test3 method");
		return 15.36;
	}
	public static void main(String[] ages) {
		System.out.println("age value"+age);
		System.out.println("salary value"+salary);
		Method5.test1();
		System.out.println("test1 value"+test1());
		Method5.test2();
		//Method5.test3(true);
		System.out.println("test"+test3(true));
		
		
	}


	}
