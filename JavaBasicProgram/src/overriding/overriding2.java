package overriding;
class Animal2{
	public void move() {
	System.out.println("Animal can move");
}
	void dispay() {
		System.out.println("i am dispay() of animal");
	}
}
class Dog2 extends Animal2{
	public void move() {
		super.move();//oR Animal2 a1=new Animal2();
		//a1.move();

		System.out.println("dog can walk run");
		//dispay();
		
	}
}

public class overriding2 {

	public static void main(String[] args) {
				  Dog2 f1=new Dog2 (); 
		             f1.move();
		             f1.dispay();
		            // OR
		//Animal2 f1=new Dog2();//Animal reference but Dog object
				//f1.move();
				//f1.dispay();

		
		
		

	}

}
