package allparaticeprogam;

public class staticblock {
	static int age=30;
	double salaray=23.01;
	 static void demo() {
		 System.out.println("satic method");
	 }
	 
		static {
			System.out.println("static block"+age);
			staticblock.demo();
			
			}
		//non static method
		 void diapay() {
				System.out.println(" non satice method");
		 }

		 //non static block
		{
			System.out.println("non satic block"+age);
			System.out.println("nonsatic block"+salaray);
		
		}

			
		
	

	public static void main(String[] args) {
		System.out.println("heloo");
		staticblock a=new staticblock();
		a.diapay();
		

	}

}
