package interiachical;
//super class /parent class
class A1{
	//java complier will write defaut constructor
	static int a=10;
	int b=20;
	double c=30;
}
//subclass /child class ,b1 inherits class a1 non static member
class B1 extends A1{
	//java complier will write defaut constructor with defaut super statment(extends)
	static int x=40;
	int  y=50;
	double z=60.0;
		
}
//c1 interits class b1 non static members
class C1 extends B1{
	//java complier will write defaut constructor with defaut super statment(extends)
	static int p=70;
	int q=80;
	double  r=90;

}
	

public class Example3 {

	public static void main(String[] args) {
		System.out.println("static variable.."+A1.a);
		System.out.println("static variable.."+B1.x);
		System.out.println("static variable.."+C1.p);
		System.out.println("**********************");


		
		C1 a1 =new C1();
		System.out .println("non satice");
		System.out.println(" with class C1 refer.."+a1.b);//same object
		System.out.println("with class C1 refer"+a1.c);
		System.out.println("with class C1 refer"+a1.y);
		System.out.println("with class C1 refer."+a1.z);
		System.out.println("with class C1 refer"+a1.q);
		System.out.println("with class C1 refer"+a1.r);



		
	

	}

}
