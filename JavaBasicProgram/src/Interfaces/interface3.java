package Interfaces;
interface pritnable{
	
	int age=30;//by defaut public static final int age=30
	void print();//public abstract void print();
}
interface showable{
	public void show();//public abstarct void show()
}

public class interface3  implements pritnable,showable{
	public static int age=45;
	public void print() {
		System.out.println("hello,print");
	}
	public void show() {
		System.out.println("welcome,show");
	}

	public static void main(String[] args) {
		interface3 obj=new interface3();
		obj.print();
		obj.show();
		System.out.println(pritnable.age);
		System.out.println(interface3.age);
	

	}

}
