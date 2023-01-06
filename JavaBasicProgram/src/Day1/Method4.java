package Day1;

public class Method4 {
	static double x=10,y=20,z=30;
	public static double average() {
		return(x+y+z)/3;
	}
	public static double average(int a,int b,int c) {
		return(a+b+c)/3;
	}
	public static double addition(long a,int b) {
		return(a+b);
	}


	public static void main(String[] args) {
		System.out.println("input x:"+x);
		System.out.println("input y:"+y);
		System.out.println("input z: "+z);
		
		double res=Method4.average();
		System.out.println("Average:"+res);
		System.out.println("new average:"+average(12,25,23));
		//int p=55,q=58,r=82;
		//System.out.println("****"+average(p,p,r));
		System.out.println("addition of two number "+Method4.addition(25,20));
		

	}
		
	

}
