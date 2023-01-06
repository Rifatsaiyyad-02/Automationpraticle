package allparaticeprogam;

public class all1 {
	static double salary=200.2;
	int age=45;
	void dispay() {
		System.out.println("non static method");
	}
	static  double  deptnum2(int amount) { 
		System.out.println("amount"+amount);
		return 23 ;
		
		

	}


	public static void main(String[] args) {
		int age=30;
		System.out.println("hello");
		System.out.print("welcome");
		System.out.println("local variable"+age);
		System.out.println("staticl global variable"+salary);
		System.out.println("static global variable standler from"+all1.salary);
		all1 g1=new all1();
		System.out.println("non satic globla variable"+g1.age);
		g1.dispay();
		g1.deptnum2(12);
				

	}

}
