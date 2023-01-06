package Objectedclass;
class Demo123{
	

	void dispay(){
		System.out.println("i am dispaly123");
		
	}
	
	
}

public class Example3 extends Demo123 {
	static int lastroll=100;
	int rollno;
	//constructor
	Example3(){
		rollno=lastroll;
		lastroll++;//101
	}
	void dispay() {
		System.out.println("i am dispay()of class odjectclass2");
	}
	//@override
	public int hashCode() {
		return rollno;
	}
	

	public static void main(String[] args) {
		Example3 s=new Example3();
		//below two statments are equivatlent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("hashcode() vlaue from objectclass:"+s.hashCode());
		s.dispay();
		Demo123 d2=new Demo123();
		System.out.println(d2);
		System.out.println("hashcode() vlaue from Demo123:"+d2.hashCode());
		d2.dispay();

		
		

	}

}
