package poly;
class Bank {
	float getratofInterest() {
		return 0;
	}
}
class rsc extends Bank{
	float getratofInterest() {
		return 8.5f;
	}

	
}
class IcIcI extends Bank{
	float getratofInterest() {
		return 7.5f;
	}

}
class AXIS extends Bank{
	float getratofInterest() {
		return 9.7f;
	}

}

public class runtime3 {

	public static void main(String[] args) {
		Bank b=new rsc();
		System.out.println("rate of inters:"+  b.getratofInterest());
		b=new IcIcI();
		System.out.println("rate of inters:"+b .getratofInterest());
		b=new AXIS();
		System.out.println("rate of inters:"+b .getratofInterest());
		

		 

		// TODO Auto-generated method stub

	}

}
