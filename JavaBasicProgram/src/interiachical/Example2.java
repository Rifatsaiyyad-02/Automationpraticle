package interiachical;
class testing10{
	//defaut constructor
	void callingfromvoda() {
		System.out.println("voda");
	}
}
class testing20 extends testing10{
	//defaut contruntor
	void callingfromidea() {
		System.out.println("idea");
	}
}
class testing30 extends testing20{
	void callingfromairtal() {
		System.out.println("airtal");
	}
}

public class Example2 extends testing30 {
	//defaut constructor with defaut super
	void callingme() {
		System.out .println("i am calling");
	}

	public static void main(String[] args) {
		Example2 e1= new Example2();
		e1.callingme();
		e1.callingfromairtal();
		e1.callingfromidea();
		e1.callingfromvoda();


		


				
		

	}

}
