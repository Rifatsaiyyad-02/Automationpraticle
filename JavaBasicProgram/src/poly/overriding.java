package poly;
class vehicle{
	void run() {//parent class
		System.out.println("vehicle is having");
	}
}
class car2 extends vehicle{//chid class 
	void run() {
		System.out.println("car is running");
		//super.run();
	}
}

public class overriding {//parent and chlid class method is same then is ovrriding

	public static void main(String[] args) {
		car2 obj =new car2();
		obj.run();
		
		

	}

}
