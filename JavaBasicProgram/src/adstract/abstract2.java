package adstract;
abstract class RBIBank{
	abstract double getrateofinterestforhome();
	final void loan() {
		System.out.println("as per RbI loan..");
	}
}
class SBI101 extends RBIBank{
	double getrateofinterestforhome() {
		return 6.5;
	}

	
}
class PNB extends  RBIBank{
	double getrateofinterestforhome() {
		return 7.5;
	}
	
}

public class abstract2 {

	public static void main(String[] args) {
		PNB P1=new PNB();
		System.out.println("PBN.."+ P1.getrateofinterestforhome());
		P1.loan();
		System.out.println("*****************************");
		SBI101 S1=new SBI101();
		System.out.println("SBI.."+ S1.getrateofinterestforhome());
		System.out.println("**********OR*********");
		RBIBank b1= new PNB();
		System.out.println("PNB.."+ b1.getrateofinterestforhome());
		
		
		

		

	}

}
