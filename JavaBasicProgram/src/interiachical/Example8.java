package interiachical;
class Grandfather{
	Grandfather(){
		System.out.println("i am class grandfather constructor");
	}
	void myhome() {
		System.out.println("i am home");
	}
}
class father extends Grandfather{
	father(double d){
		super();
		System.out.println("i am class father constructor");
	}
	void mycar() {
		System.out.println("i am car ");
	}
}
class child1 extends father{
	child1(int i){
		super(12.34);
		System.out.println(" i am child1 constuctor");
		
	}
	void mybike() {
		System.out.println(" i am bike  of chlid");
	}
}

public class Example8 {

	public static void main(String[] args) {
		System.out.println("*******************");
		child1 a1=new child1(21);
		a1.myhome();
		a1.mycar();
		a1.mybike();
		System.out.println("**************************");
		father f1=a1;
		//referace father=object
		f1.myhome();
		f1.mycar();
		System.out.println("******************************************");
		Grandfather g1=a1;
		//refrace granther=odject
		g1.myhome();
		System.out.println("****************************************");
		Grandfather g2=f1;
		g2.myhome();
		
		
	

	}

}
