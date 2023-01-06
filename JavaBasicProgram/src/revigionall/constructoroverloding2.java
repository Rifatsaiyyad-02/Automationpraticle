package revigionall;

class r{
	//costrctourovreloading
	r(){
		System.out.println("running constructor r");
		
	}
	r(int a){
		System.out.println("runing constrctour r(int a"+a);
	}
}

public class constructoroverloding2 {
	constructoroverloding2(){
		System.out.println("running construe 2");
	}
	//methods
	void dispay1() {
		System.out.println("running mrthod");
	}
	

	public static void main(String[] args) {
		System.out.println("program Start");
		
		r a1=new r();
				r a2=new r(10);
		constructoroverloding2 a3 =new constructoroverloding2();
		a3.dispay1();
	}

}
