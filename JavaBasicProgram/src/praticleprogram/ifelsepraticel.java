package praticleprogram;

public class ifelsepraticel {

	public static void main(String[] args) {
		int num=60;
		if(num%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		checkevenoddnumber(160);
		checkevenoddnumber(111);
				
	}
	static void checkevenoddnumber(int num) {
		if(num%2==0){
			System.out.println("given number is even number:"+num); 
		}else {
			System.out.println("given number is odd number:"+num);
			
			
		}
		
		
	

	}

}
