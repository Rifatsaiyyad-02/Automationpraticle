package revigionall;

public class methodoverloding2 {
	//changing data type
	int diapay(int a,int m) {
		System.out.println("i am diapsy");
		return (a+m);
		
	}
	double dispay(double r,double x) {
		System.out.println("i am dispay");
		return (r+x);
	}
	 
		
	

	public static void main(String[] args) {
		methodoverloding2 s= new methodoverloding2();
		s.diapay(114, 45);
		s.dispay(45.0, 45.0);
				
		

	}

}
