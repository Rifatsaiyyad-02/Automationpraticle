package revigionall;
class D{
	int i;
	double d;
	//constructorovrloding
	D(int a){
		System.out.println("running d(int a) consatructor");
		i=a;
		
	}
	D(double b){
		System.out.println("runing d(double)constructor");
		d=b;
		
		
		
	}
	D(int a,double b){
		System.out.println("running d(int ,doublle)consturctor");
		i=a;
		d=b;
	}
	//method
	void println() {
		System.out.println("i="+i);
		System.out.println("d="+d);
	}
}


public class constructoroverloding1 {

	public static void main(String[] args) {
		System.out.println("program star");
		D d1=new D(12);
		d1.println();
		System.out.println("-------------");
		D d2=new D(15.0);
		d2.println();
		System.out.println("---------------");
		D d3=new D(10,25.4);
		d3.println();
		
		

	}

}
