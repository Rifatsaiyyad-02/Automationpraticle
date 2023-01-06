package Interfaces;
interface Bank{
	float rateofinterest();//by defaut ---> public abstract float rateofinterest()
	
}
class sbi1 implements Bank{
	public  float rateofinterest() {

		
		return 9.51f;
		
	}
}
class Pnb1 implements Bank{
	public float rateofinterest() {
		return 5.22f;
	}
}

public class interfaces2 {

	public static void main(String[] args) {
		sbi1 g1=new sbi1();
		System.out.println("sbi1 value"+g1.rateofinterest());
				Pnb1 p1=new Pnb1();
		System.out.println("pnb value"+p1.rateofinterest());

				
		Bank b1=new sbi1();
		System.out.println("sbi1 value"+b1.rateofinterest());

						
		

	}

}
