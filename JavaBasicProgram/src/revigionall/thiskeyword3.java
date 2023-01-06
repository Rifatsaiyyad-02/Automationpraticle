package revigionall;

public class thiskeyword3 {
	int a;
	int b;
	thiskeyword3(int a, int b){
		
	
	this.a=a;
	this.b=b;
	}
	void display() {
		
		System.out.println("a"+a+"b"+b);
	}

	public static void main(String[] args) {
		thiskeyword3 g= new thiskeyword3(10,20);
		g.display();
		System.out.println(g.a+""+g.b);
		thiskeyword3 g1= new thiskeyword3(101,202);
		g1.display();
		System.out.println(g1.a+""+g1.b);



	}

}
