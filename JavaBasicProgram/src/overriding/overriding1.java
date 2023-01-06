package overriding;
//parent class and child calss mrthod shoud be same 
class Animal1{//parent class 
	
	public void move() {
		System.out.println(" Animals can move");
	}
}
class Dog extends Animal1{//child class
	public void move() {
	System.out.println("dog can wlk run ");
	//super.move();// we call Animal method we write super keyword
}
	public void bark() {
		System.out.println("Dog can bark");
	}
}

public class overriding1 {

	public static void main(String[] args) {
		Animal1 a=new Animal1();//Aniaml class reference and object
		a.move();
		
		Dog b=new Dog();//Animal class reference dog oject
		b.move();//run the method dog class
	  b.bark();//run the method dog class
		System.out.println("*************************");
		Animal1 a1=new Dog();//
		a1.move();//dog class run only move
		
	
		

	}

}
