package interiachical;//herharical intrtanc
class vehice{//parent class
	public void wheels() {
		System.out.println("i have wheels");
	}
}
class bike extends vehice{//first chlid class of vehice
	public void countwl() {
		System.out.println("i am bike and has wheels");
	}
} 
class car extends vehice{//secound chlid class of vehice
	public void countwlc() {
		System.out.println("i am car and has 4 wheels");
	}
	
}
class scoter extends vehice{// third chlid class of vehice/
	public void countwls() {
		System.out.println("i am scoter ans has 2 wheels");
	}
}



public class Example5 {
	public static void  main(String[] args) {
		car f1=new car();// object of car class
		f1.wheels();
		f1.countwlc();
	}
	
	

}


























