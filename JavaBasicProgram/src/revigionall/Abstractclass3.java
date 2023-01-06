package revigionall;

abstract class D1{
	abstract void demo1();
	abstract void demo2();
}
abstract class E1 extends D1{
	void demo1() {
		System.out.println("demo1 imlemention in class");
	}
	
}
class F2 extends E1{
	void demo2() {
		System.out.println("demo2 implemetion in class");
	}
}
  


public class Abstractclass3 {

	public static void main(String[] args) {
		F2 r=new F2();
		r.demo1();
		r.demo2();

	}

}
