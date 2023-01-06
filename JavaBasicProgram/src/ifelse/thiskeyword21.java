package ifelse;

public class thiskeyword21 {
	int a;
	int b;
	thiskeyword21(int a,int b){
	{
		this.a=a;
		this.b=b;}
		
	}
	void dispay() {
		System.out.println("a.."+a +"b.."+b);
	}

	public static void main(String[] args) {
		thiskeyword21 obj=new thiskeyword21(10,20);
		obj.dispay();
		System.out.println(obj.a+""+obj.b);
		thiskeyword21 obj2=new thiskeyword21(101,201);
		obj.dispay();
		System.out.println(obj2.a+""+obj2.b);
		
		

	}

}
