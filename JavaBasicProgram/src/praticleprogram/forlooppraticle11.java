package praticleprogram;

public class forlooppraticle11 {

	public static void main(String[] args) {
		int x=-60;
		System.out.println("factors of "+x);
		for(int i=x;i<=Math.abs(x);++i) {
			if(i==0) {
				continue;
			}
			else {
				if(x %i==0) {
					System.out.println(i+"");
				}
			}
		}

	}

}
