package ifelse;

public class samegoblestaticevariable1 {
	static int age=30;//statice gobale variale

	public static void main(String[] args) {
		int age=20;//local variable
		System.out.println("age value"+age);//local vaeiable print 20
		System.out.println("age value"+samegoblestaticevariable1.age);// static gobal vaiable 
		

	}

}
