package interiachical;
class testing1{
	void callingfromvoda() {
		System.out.println("vodaphone network busy");
		
	}
}
class testing2{
	void callingfromidea() {
		System.out.println(" grt idea string");
	}
}
  class tesing3{
	void callingfromaairtal() {
		System.out.println(" airtal is best network");
	}
}

public class Example1 {
	void callingfromme() {
		System.out.println("i am calling....");
	}

	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.callingfromme();
		testing1 a1=new testing1();
		a1.callingfromvoda();
		testing2 b1=new testing2();
		b1.callingfromidea();
		tesing3 d1=new tesing3();
		d1.callingfromaairtal();
		
		
		
		

	}

}
