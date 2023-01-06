package revigionall;
//constrctor with nonstaticblock
class E{
	//nonsaticblock
	{
		System.out.println("running non satic block");
	}
	//constrctor
	E(){
		System.out.println("running constrctuor");
		
		
	}
}

public class constructorwithnonsaticbock {

	public static void main(String[] args) {
		System.out.println("program satrt");
		E a=new E();
		System.out.println("----------");
		//non Static block executed n number of time
		E a2=new E();
	

	}

}
