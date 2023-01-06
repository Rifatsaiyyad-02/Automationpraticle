package Objectedclass;
class  print extends Object{
	int a=10;
	public int hashCode() {
		return 101;
		
	}
	public String toString() {
		return "i am print class toString";
	}
	public boolean equal(Object obj) {
		print p=(print)obj;
		return(this.a==p.a);//10==1o
		
	}
	
}

public class Example6 {
	static int lastroll=100;
	int rollno;
	Example6(){
		rollno=lastroll;
		lastroll++;
	}

	public static void main(String[] args) {
		Example6 s1=new Example6();
		System.out.println("s: toString of objectclass4:"+s1);
		System.out.println("s: hsashcode of objectclass:"+s1.hashCode());
		Example6 s2=new Example6();//differet object adderss
		System.out.println("s: toString of objectclass4:"+s2);
		System.out.println("s: hsashcode of objectclass:"+s2.hashCode());
		System.out.println("s1 and s2 compare:"+s1.equals(s2));//f
		Example6 s3=s2;//same object adderess
		System.out.println("s3 and s2 compare:"+s3.equals(s2));//t 
		
		print p1=new print();
		System.out.println(" toString of objectclass4:"+p1);
		System.out.println(" hsashcode of objectclass:"+p1.hashCode());
		print p2=new print();
		System.out.println(" toString of objectclass4:"+p2);
		System.out.println(" hsashcode of objectclass:"+p2.hashCode());
		System.out.println("compare print class object p1 and p2 with overriden equals()"+p1.equals(p2));//f

		

		
		

		
		

		
		

	}

}
