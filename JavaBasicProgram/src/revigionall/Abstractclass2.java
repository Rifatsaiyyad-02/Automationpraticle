package revigionall;

abstract class B1{
	abstract void sample1();
	
}
class C1 extends B1{
	void sample1() {
		System.out.println("sample1()implemeted class c");
	}
	
}

public class Abstractclass2 {

	public static void main(String[] args) {
	System.out.println("program satrt");
	C1 c1=new C1();
	c1.sample1();

	}

}
