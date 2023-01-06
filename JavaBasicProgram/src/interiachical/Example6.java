package interiachical;
class A{
	public void rifat() {
		System.out.println("rifat pass in first division");
	}
}
class B extends A{
	public void sadaf() {
		System.out.println("sadaf pass in secound division");
	}
}
class C extends B {
	public void tanuja() {
		System.out.println("tanuja pass in third division");
		
	}
}


public class Example6 {
	

	public static void main(String[] args) {
		C a1=new C();
		
		 a1.rifat();
		 a1.sadaf();
		 a1.tanuja();
		

	}

}
