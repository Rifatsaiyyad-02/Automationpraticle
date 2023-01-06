package Interfaces;
interface printlable2{
	void print();
}
interface showable2 extends printlable2{
	void show();
}

public class interface5 implements showable2{
	public void print() {
		System.out.println("hello");
}
	public void show() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		interface5 obj=new interface5();
		obj.print();
		obj.show();
		printlable2 obj1=new interface5();
		obj1.print();
		
		

	}

}
