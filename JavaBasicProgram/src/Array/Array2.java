package Array;

public class Array2 {

	public static void main(String[] args) {
		int[] age= {12,4,25,2,5};
		System.out.println("first elements:"+age[0]);
		System.out.println("saecound elements"+age[1]);
		System.out.println("thirh elements :"+age[2]);
		System.out.println("forn elements"+age[3]);
		System.out.println("fifth elements"+age[4]);
		System.out.println("array size"+age.length);
		System.out .println("*******for loop**********");
		for(int i=0;i<age.length;i++) {
			if(age[i]==25) {//index 0 value is 12 and i value  is not equal to 25
				//index 1 value is 4 and i value is not equal to 25
				//but index 2 value is 25 and i equal to 25 than break
				System.out.println(age[i]);
				break;
				
			}else {
				System.out.println("age not 25");
			}
		}
		System.out.println("***for each loop*********");
		for (int a:age) {
			if (a==25) {
				System.out.println(a);
				break;
			}else {
				System.out.println("age is not 25");
			}
		}

	}
}

