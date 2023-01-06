package singletonClass;
class sampletone{
	/**
	 * 1.constructor should be private
	 * 2.create static instance/object of class
	 * 3.crate satatic method which return current class object
	 */
	int age =25;
	//1.constructor should be private
	private sampletone() {
		System.out.println("Sampletone class cons");
		
	}
	//create static instance/object of class
	static sampletone obj=new sampletone();
	public static sampletone getsampletoneonobject() {
		return obj;
	}
	void display() {
		System.out.println(" i am dispay method"+age);
	}

}

public class singletonclass1 {
	static int getage() {
		return 10;
	}

	public static void main(String[] args) {
		
		int res=singletonclass1.getage();
		//sampletone.getsampletoneonobject().age=45;
		//sampletone.getsampletoneonobject().display();

		//sampletone.getsampletoneonobject().age=30;
		sampletone s=sampletone.getsampletoneonobject();
		//or
		sampletone.getsampletoneonobject();
		s.age=45;
		s.age=30;
		s.display();
		s.age=30;
		



		
		

	}

}
