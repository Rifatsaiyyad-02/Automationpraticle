package StringeExamples;

public class Example4 {

	public static void main(String[] args) {
		Example4 cl=new Example4();
		System.out.println("cl:"+cl);//string represent of object becuse of tostring()
		//string class object creation
		//1,using literal
		String s1="Mumbai";//new object created in string object  constant pool
		String s2="Mumbai";//no object created as it duplicate object so 's2'will point to 's1' object
		String s3="Bangalore";//new object created in string constant pool
		System.out.println("s1:"+s2);
		System.out.println("s1:"+s3);
		System.out.println("s1 char count :"+s1.length());
		System.out.println("s2 char count :"+s2.length());
		System.out.println("s3 char count :"+s3.length());
		    
		  /**
		   * outside string class;
		   *     == -->compar two  object values
		   *     eqauls(obj)-->compare two object based on address
		   *     inside String class;
		   *     ==>compare two object  baesd on address
		   *     equal(obj)-->compare two object based on vlaue
		   *     
		   */
		System.out.println("s1 and s2 using equal():"+s1.equals(s2));//t
		System.out.println("s1 and s2 ===:"+(s1==s2));//t
		System.out.println("s1 and s3 using equal():"+s1.equals(s3));//f
		System.out.println("s1 and s3 ==:"+s1==(s3));//f
		String s4=new String("Mumbai");//two object created 1.constent pool 2.non constant pool

		System.out.println("s4:"+s4);
		System.out.println("s1 and s4 using equal():"+s1.equals(s4));//t

		System.out.println("s1 and s4 using ==:"+(s1==s4));//f
		String s5=new String("Mumbai");//two object created 1.constent pool 2.non constant pool
		System.out.println("s5:"+s5);

		System.out.println("s4 and s5 using equal():"+s4.equals(s5));//t
		System.out.println("s4 and s5 using ==:"+(s4==s5));//f vlue differnt
		String s6=new String("hyderabad");//two object created 1.constent pool 2.non constant pool
		System.out.println("s6:"+s6);

		System.out.println("s1 and s6 using equal():"+s1.equals(s6));//f
		System.out.println("s1 and s6 using ==:"+(s1==s6));//f
		

		

		
		



		// TODO Auto-generated method stub

	}

}
