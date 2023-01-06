package revigionall;

public class methodoverloding {
	//changin the arruments
	static int x(int a,int b) {
		System.out.println("i am method"+a);
		System.out.println("i am method"+b);

		System.out.println("l am x method" +(a+b));
		return (a+b);
		
	}
	static int x( int a,int b,int c) {
		System.out.println("i am x1"+(a+b+c));
		return (a+b+c);
		
	}

	public static void main(String[] args) {
		methodoverloding.x(12, 15);
		methodoverloding.x(12, 45,56);
		
		

	}

}
