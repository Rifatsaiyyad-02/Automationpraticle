package Day1;

public class Sample10 {
	static double x,y,z;
	static int ac=30, df=40;
	public static double avarage(double p,double q,double r)
	{

		
		return (p+q+r) / 3;
	}
	public static int additio(int ac,int df) 
	{
		System.out.println("addition of "+ ac +"and" +df);
		
		return (ac+df);
	}
		

   
	public static void main(String[] args) {
		System.out.println("input the first number: "+x);
		System.out.println("input the first number: "+y);
		System.out.println("input the first number: "+z);
		x=20;
		y=30;
		z=90;
		System.out.println("the avarage value is " +avarage(x,y,z));
		System.out.println("the avarage value is "+avarage(10,30,50));
		System.out.println("input the first number: "+ac);
		System.out.println("input the first number: "+df);
		System.out.println("additon : "+(ac+df));
		System.out.println(additio(10,25));
		 System.out.println(additio(10,28));
		        
		
		
		
		
	}
			
		
		
		


	}


