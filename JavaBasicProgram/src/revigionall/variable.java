package revigionall;

public class variable {
	static int r=45;//static goble variable
	double f=46;//non satic goable variable
	//satatic block
	static {
		System.out.println("running satic block");
	}
	//non static block
	{
		System.out.println("running non static block");
	}
	

	public static void main(String[] args) {
		int age=10;//locla variable
		System.out.println("local variable "+age);
		System.out.println("gobal variable"+r);
		//goable variable call also class name
		System.out.println("goable variable "+variable.r);
		variable e=new variable();
		System.out.println("non satic goable variable"+e.f);
		//non satic block excuted n number of type
		variable e2=new variable();


	}

}
