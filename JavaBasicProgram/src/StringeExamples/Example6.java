package StringeExamples;

public class Example6 {

	public static void main(String[] args) {
		String s1="i am working in accenture , i working qa";
		System.out.println("Actual string :"+s1);
		String[] strAry=s1.split("");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("********************");
		String s2="i am from up";
		System.out.println("Actual string :"+s2);
		String[] strAry2=s2.split("",3);
		for(String s:strAry2) {
			System.out.println(s);
		}
			System.out.println("********************");
			String s3="i am from pune";
			System.out.println("Actual string :"+s3);
			String str[]=s3.split("");
			String temp="";
			//for(String s:str) {
				//System.out.println(s);
			
			for(int i=str.length-1;i>=0;i--) {
				temp=temp+""+str[i];
			}
			System.out.println("revers statment:"+temp);
			System.out.println("************************");
			String s4="      l am shalines      ";
			
			System.out.println("actual string with spache:"+s4);
			System.out.println("actual string with length:"+s4.length());
			
			System.out.println("actual string without spache:"+s4.trim());
			System.out.println("actual string without length spache:"+s4.trim().length());
			String s5="l   am   shalies";
			System.out.println("actual string with spache:"+s5.trim());
			System.out.println("actual string without length spache:"+s5.trim().length());

			


			
			
			



	}

}
