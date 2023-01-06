package ifelse;

public class nonstatice1 {
	int rollno;//gobal variable
	float free;//gobal variable
	nonstatice1(int rollno,float free){//local variable
		System.out.println("local variable:"+rollno);
		System.out.println("local variable"+free);
		System.out.println("gobal variable:"+this.rollno);
		System.out.println("gobal variable:"+this.free);
		System.out.println("**************");
		//global variable=local variable
		this.rollno=rollno;
		this.free=free;
		System.out.println("local variable"+rollno);
		System.out.println("local variable"+free);
		System.out.println("gobal variable"+this.rollno);
		System.out.println("gobal variable"+this.free);
		
		
	}
	void dispay() {
		
		System.out.println(rollno +""+ free);
	}



	public static void main(String[] args) {
		nonstatice1 f1 =new nonstatice1(200,3000f);
		f1.dispay();
		System.out.println("************************");
		nonstatice1 f2 =new nonstatice1(100,200f);
		f2.dispay();
		System.out.println("************************");

	}

}
