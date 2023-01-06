package Day1;

public class Sample9 {

	public static void main(String[] args) 
	{
		System.out.println("program Start...");
		int res=Sample(12,32);
		System.out.println("result is: "+res);
		System.out.println("**********");
		int res2=Sample(33,32);
		System.out.println("result is"+res2);
		System.out.println("******");
		int res3=Sample(85,85);
		System.out.println("result is"+res3);
		System.out.println("program end");
	
	}

	  
	
	static int Sample(int a, int b)
	{
		System.out.println("running sample method");
		System.out.println("value of a is: "+a);
		System.out.println("value of b is: "+b);
		int sum=a+b;
		return sum;
	}
	
	{
		
	}

}
