package revigionall;

public class Variable1 {
	static int r=45;
	int e=10;
	static {
		System.out.println("hi i am static block program is start");
	}
	{
		System.out.println(" i am non static bock");
	}
	//static method
	static void dispay1() {
		System.out.println("static method"+r);
	}
	//non satic method access static varible or non satic varible
	void dispay2() {
		System.out.println("non static method with static varible"+r);
		System.out.println("non static method with non satic varible"+e);
	}
	


	
		

	public static void main(String[] args) {
		int r=10;
		System.out.println("local variable"+r);
		System.out.println("static glocal variable"+Variable1.r);
		Variable1 t=new Variable1();
		System.out.println("non static variable"+t.e);
		Variable1.dispay1();
		t.dispay2();
		
		//  non satic block
		  //{
		 
			//System.out.println(" i am non static bock");
		//}
		


		

	}

}
