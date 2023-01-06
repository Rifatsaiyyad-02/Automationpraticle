package revigionall;

abstract class A1{
	static void sample1() {
		System.out.println("running sample()");
	}
	//abstract method
	abstract void sample2();
}

public class Abstractclass1 {

	public static void main(String[] args) {
		System.out.println("program start");
		A1.sample1();

	}

}
