package poly;
class Animal{
	void eat () {
		System.out.println("animal eat");
	}
}
class herbiores extends Animal{
	void eat() {
		System.out.println("herbiors eat");
		
	}
}
class omnivores extends Animal{
	void eat() {
		System.out.println("omnivores eat");
	}
}
class carnivores extends Animal{
	void eat() {
		System.out.println("carnivore eat");
	}
}

public class Runtime {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		Animal h=new herbiores();//up casting
		h.eat();
		Animal g=new omnivores() ;
		g.eat();
		
		//when method gets to know its implemetation at time of exxcution/run time is run
		//runtimr poly this can ahived method overriding
		//1.inheritance
		//2.upcasting
		//overrriding
		
	

	}

}
