package poly;

public class comiletime {//only static memebre run comeiltime
	static void sum(int a,int b) {
		int c=a+b;
		System.out.println("Addition of two number"+c);
	}
	static void sum(int a,int b,int e) {
		int c=a+b+e;
		System.out.println("addition of three number"+c);
	}

	public static void main(String[] args) {
		comiletime.sum(45,80,45);
		

	}

}//static  method oreloading
