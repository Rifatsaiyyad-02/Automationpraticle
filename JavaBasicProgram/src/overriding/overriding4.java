package overriding;
class ABC{
	public void mymethod() {
		System.out.println(" method of abc class");
	}
}

public class overriding4 extends ABC {
	public void mymethod() {
		super.mymethod();
		System.out.println("overriding method of class overriding");
	}

	public static void main(String[] args) {
		overriding4 g1=new overriding4();
		g1.mymethod();
		
		

	}

}
