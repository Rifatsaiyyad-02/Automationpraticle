package Interfaces;
interface printable1{
	void print();
}
interface showable1{
	void print();
}

public class interface4 implements printable1,showable1 {
	public void print() {
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		interface4 obj= new interface4();
		obj.print();
		showable1 obj1=new interface4();
		obj1.print();
		printable1 obj2=new interface4(); 
		obj2.print();

		

	}

}
