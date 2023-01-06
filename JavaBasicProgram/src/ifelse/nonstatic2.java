package ifelse;

public class nonstatic2 {
	int x;
	public nonstatic2(int x) {
		System.out.println("value of x:"+x);
		this.x=x;
		System.out.println("value of x"+this.x);
		
	}
			
	

	public static void main(String[] args) {
		nonstatic2 f1=new nonstatic2(5);
		
		System.out.println("vaule of x:"+f1.x);
		

	}

}
