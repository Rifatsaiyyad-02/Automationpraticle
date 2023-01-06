package Day1;
class Adder1{
	static int add(int a,int b) {
		//System.out.println("vlaue a and b is"+(a+b));
		return a+b;
	}

	static double add(double a,double b) {
		return a+b;
	}
}


public class overloadingchaingdatatype {

	public static void main(String[] args) {
		System.out.println(Adder1.add(11, 11));
		System.out.println(Adder1.add(11.3, 11.0));

		

	}

}

