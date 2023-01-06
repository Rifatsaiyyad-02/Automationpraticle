package interiachical;
class fruits{//parent class
	int fruitage;//variable
	fruits(){//constrtuctor
		System.out.println("fruit class cons..");
		fruitage=7;
	}
	public void taste() {//method
		System.out.println("fruit are sweet");
	}
}
class orange extends fruits{//child class
	int fruitage;//variable
	orange(){//constuctor
		   super();//super stament to call only constrtuctor
		System.out.println("orange class consrtuctor");
		fruitage=5;
	}
	public void taste() {//same method
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruitage"+fruitage);
		System.out.println("fruit fruitage"+super.fruitage);
		taste(); 
		super.taste();//super keyword use to call variable same method
	}
}

public class Example9 {

	public static void main(String[] args) {
		System.out.println("************************** ");
		orange  o1=new orange();
		o1.shape();
		System.out.println("********************************");
		

	}

}
//super keyword is use to call non static variable and non static method
//super() statment is call only consrtuctor
