package StringeExamples;

public class Example8 {

	public static void main(String[] args) {
		String s2="1234";
		System.out.println("s2:"+s2);
		//int sum=s2+100;comile time error,becausa can not store strig into int
		//is string object contain int value ,dn before using it for any artimaetic operation first convat it into int
		int num=Integer.parseInt(s2);
		int sum=num+100;
		System.out.println("resut:"+sum);


	}

}
