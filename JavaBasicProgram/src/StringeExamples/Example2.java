
package StringeExamples;


public class Example2 {

	public static void main(String[] args) {
		String s1="corejavabasic";//using literals
		String s2=new String("Basiccodejava");//using new
		/**
		 * string  two object will be created
		 * 1.in  constant pool
		 * 2.in non constant pool
		 * 
		 */
		String s3=new String("corejavabasic");
		//obj 1     obj 2 two object created becussea of string
		
		/**ideally there should be two object created but constant pool already"corejavabasic" object present
		 * hennce only one object will be created in non constant pool area
		 * 
		 */
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);


		

	}

}
