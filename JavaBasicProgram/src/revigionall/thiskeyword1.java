package revigionall;

public class thiskeyword1 {
	int variable =5;
	int age=10;
	void method(int variable) {
		System.out.println("value of variable"+variable);
		System.out.println("value of golbal varible v"+this.variable);
		this.variable=variable;
		System.out.println("value of variable"+variable);
		System.out.println("value of golbal varible v"+this.variable);	
		
		

	}
	void method() {
		int variable=40;
		System.out.println("variable of varible"+variable);
		System.out.println("value of varible v"+this.variable);

	}

	public static void main(String[] args) {
		thiskeyword1 obj=new thiskeyword1();
				
				obj.method(20);
		obj.method();
		System.out.println("obj global of varible v"+obj.variable);
		thiskeyword1 obj2=new thiskeyword1();
		System.out.println("obj global of varible v"+obj2.variable);


		

		
		

	}

	}


