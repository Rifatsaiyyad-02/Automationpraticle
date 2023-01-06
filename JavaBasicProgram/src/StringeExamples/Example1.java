package StringeExamples;

public class Example1 {

	public static void main(String[] args) {
		//string class object can be create in two ways
		//1.using literals"
		//2.using  new kwyword
		String s1="Bangalore";//new odject
		String s2="Mumbai";//new object
		String s3="Bangalore";//no new object will be creatwd as its a duplicate
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("compare s1 and s2 object based on address:"+(s1==s2));//f
		System.out.println("compare s2 and s3 object based on address:"+(s2==s3));//f
		System.out.println("compare s1 and s3 object based on address:"+(s1==s3));//t becuess same addesess
		System.out.println("compare s1 and s2 object based on value:"+(s1.equals(s2)));//false value differct
		System.out.println("compare s2 and s3 object based on value:"+(s3.equals(s2)));//false value differct
		System.out.println("compare s1 and s3 object based on value:"+(s1.equals(s3)));//t


      /**
       * in string some method of object class are override
       * 1.tostring()--->to represent object in String format but string class it will give vlues strored in the object
       * 2.equals()--->to compare two object based address but in string it compare twwo object besed on there value
       * 3.==to copmare two value  but in string class it comparess two object besed on address
       */




		
		
		

	}

}
