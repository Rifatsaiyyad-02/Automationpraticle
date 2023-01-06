package revigionall;

public class Method2 {
	static double x(double a,double b) {
		System.out.println(" vlaue of a is"+a);
		System.out.println(" vlaue of a is"+b);
		System.out.println(" vlaue of a is"+(a+b));
		return (a+b);


	}//method overoding
	  void  x(int a,int b,int c) {
		System.out.println(" vlaue of a is"+a);
		System.out.println(" vlaue of a is"+b);
		System.out.println("vlaue of c is "+c);
		System.out.println(" vlaue of a is"+(a+b+c));
		

		
		
	}
	

	public static void main(String[] args) {
		Method2.x(12.0, 14.0);
		System.out.println("****************");
		Method2.x(45.0, 48.0);
		System.out.println("*********non satic method*****");
		//non satic method
		Method2 v=new Method2();
		v.x(12, 14, 14);
		
		

	}

}
