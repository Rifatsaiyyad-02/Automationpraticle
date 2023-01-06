package Objectedclass;
class print12{
	int a=10;
	public int hashCode() {
		return 101;
	}
	public String toString() {
		return "I am printl12 class toString";
	}
}

public class Example5 {
	

	


	

	public static void main(String[] args) {
		Example5 s1=new Example5();
		System.out.println("s:tostring of objectclass4:"+s1);
		System.out.println("s:hashcode of objectclass4"+s1.hashCode());
		Example5 s2=new Example5();
		System.out.println("s2 :toString of objectclass4:"+s2);
		System.out.println("s.hashcode of objectclass1"+s2.hashCode());
		System.out.println("s1 & s2 copamare :"+s1.equals(s2));//f differrnt object
		Example5 s3=s2;
		System.out.println("s3 & s2 copmare :"+s3.equals(s2));//t same object
		print12 p1=new print12();
		System.out.println("toString of print"+p1);
		System.out.println("hashcode of print:"+p1.hashCode());
		print12 p2=new print12();
		System.out.println("toString of print"+p2);
		System.out.println("hashcode of print:"+p2.hashCode());
		System.out.println("compare print class object p1 and p2 with ovrride equal():"+p1.equals(p2));//f differt object

//d1.equals(d2)--->compare two object based on there adderess
		
		

		
		
	
		
		
		

	}

}
