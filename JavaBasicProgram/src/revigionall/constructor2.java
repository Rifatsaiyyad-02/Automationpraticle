package revigionall;
class A{
	int i=10;
	A(){
		System.out.println("running class constructor");
	}
	public static void sample1() {
		// TODO Auto-generated method stub
		
	}
}

public class constructor2 {

	public static void main(String[] args) {
		System.out.println("program start");
		A a1=new A();
		System.out.println("i:"+a1.i);
		System.out.println("program end");
		//created new object then also constructor executed
		A a2=new A();
		
		

	}

}
