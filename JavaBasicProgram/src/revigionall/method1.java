package revigionall;

public class method1 {
	static int age=12;//static variable
	double n=45;//non static variable
	//static method
	static void dispay(){
		
		System.out.println("l am static method"+age);
		
	}
	static int diapay1( int a,int b) {
		System.out.println("l am static method diapay1"+(a+b));
		return (a+b);
	}
	//non static method
	void xyz() {
		System.out.println("l am xyz method"+n);
	}


	public static void main(String[] args) {
		System.out.println("program start");
		method1.dispay();//static method
		method1.diapay1(14, 16);//static method 
		method1 m=new method1();//non static method
		m.xyz();
		
	

	}

}
