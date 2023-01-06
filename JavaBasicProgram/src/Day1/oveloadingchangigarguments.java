package Day1;
class Adder{
	static int add(int a,int b) {
		//System.out.println("vlaue a and b is"+(a+b));
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static  int add(int a,int b,int c,int d) {
		return a+b+c+d;
		
	}
}

public class oveloadingchangigarguments {

	public static void main(String[] args) {
		//Adder.add(11,11);
		//or
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11,12));
		System.out.println(Adder.add(11, 11,14,15));


		

	}

}
