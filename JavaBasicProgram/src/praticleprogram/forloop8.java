package praticleprogram;

public class forloop8 {

	public static void main(String[] args) {
		String str="xyz",reversestr="";
		int strLength=str.length();

		for(int i=(strLength-1);i>=0;--i) {
			reversestr=reversestr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reversestr.toLowerCase())) {
			System.out.println(str + "is a palindrome string.");
		}else {
			System.out.println(str+"is not palindrome string");
		}

	}

}
