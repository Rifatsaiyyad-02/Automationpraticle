package ifelse;

public class thiskeyword5 {
	int variable=5;
	int age=10;

	public static void main(String[] args) {
		thiskeyword5 obj=new thiskeyword5();
		obj.method(20);
		obj.method();
		
		
		System.out.println("obj gv variable"+obj.variable);
		thiskeyword5 obj2=new thiskeyword5();
		System.out.println("obj gv variable"+obj2.variable);
		
		
		

	}
	void method(int variable) {
		System.out.println("value of variable:"+variable);
		System.out.println(" gv value of this variable:"+this.variable);
		this.variable=variable;
		System.out.println("value of variable:"+variable);
		System.out.println("gv value of variable"+this.variable);
		
	}
	void method() {
		int variable=40;
		System.out.println("value of variable:"+variable);
	}

}
