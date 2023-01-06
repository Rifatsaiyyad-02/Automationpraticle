package adstract;
abstract class Bike1{//abstract class
	abstract void run();//abstract method
	void speed(int spd) {//non-abstract method
		System.out.println("Bike speed"+spd);
	}
}
class Honda4 extends Bike1{
	void run() {//remove abstract method
		System.out.println("running...");
	}
	void speed(int spd) {
		System.out.println("honada speed"+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("honada color is blue");
	}
}

public class adstract {

	public static void main(String[] args) {
		Honda4 h1=new Honda4();
		h1.run();
		h1.speed(60);
		h1.color();
		
	}

}
