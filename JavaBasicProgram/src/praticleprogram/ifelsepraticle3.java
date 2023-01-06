package praticleprogram;

public class ifelsepraticle3 {

	public static void main(String[] args) {
		double n1=5.8,n2=-3.5,n3=1.5;
		if(n1>=n2&& n1>=n3) {
			System.out.println("largest number"+n1);
		}else if(n2>=n1&&n2>=n3) {
			System.out.println("largest number"+n2);
		}else {
			System.out.println("largest number"+n3);
		}

	}

}
