package revigionall;

class F1{
			F1(){
		System.out.println("running f()constructor--");
				
		
	}
	}
class G1 extends F1{
	int r;
		G1(){
		super();
		System.out.println("running g()constructor--");
		r=15;
	}
}
class H1 extends G1{
	int r;

	H1(){
		super();
		System.out.println("running h()constctor");
		r=14;
		
	}
	void dispay() {
		System.out.println("F1 variable vlaue"+r);
		System.out.println("g1 variable value"+super.r);
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		H1 h1=new H1();
		h1.dispay();
		
		

	}

}
