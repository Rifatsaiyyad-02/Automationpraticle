package overriding;
class  Human{
	//overridden method
	//in overidden we can increase the visibility of overrided method----->private--->default--->protected---->public
	//defaut-->protected or public
	//protected-->public
	//public-->public
	void eat()  {//defaut method -->public
		
		System.out.println("human is eating");
	}
}
class Boy extends Human{
	//overriding method
	public void eat() {
		super.eat();
		System.out.println("boy is eating");
	}
	
}

public class overriding3 {

	public static void main(String[] args) {
		Boy obj=new Boy();
		obj.eat();
		//Human h1=new Boy();
		//h1.eat//boy method run
		
		

	}

}
