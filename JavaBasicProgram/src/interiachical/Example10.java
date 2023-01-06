package interiachical;
class company202{
	void dispay() {
		System.out.println(" i am company  class dispay()...");
	}
}
class Employee202 extends company202{
	void dispay() {
		System.out.println("i am emp class diapay()...");
		super.dispay();//super keyword use to call same method
		
	}
	void callme() {
		System.out.println("i am emp class callme()....");
	}
}

public class Example10 {

	public static void main(String[] args) {
		Employee202 a1=new Employee202();
		a1.dispay();
		a1.callme();
		System.out.println("****************************");
		company202 f1=new company202();
		f1.dispay();
		System.out.println("***************************");
		company202 e2=new  Employee202();
		e2.dispay();
		
		

	}

}
