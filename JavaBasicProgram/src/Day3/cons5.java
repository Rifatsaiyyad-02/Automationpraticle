package Day3;

public class cons5 {
	int age;
	double salary;
	cons5() {
		System.out.println("zero parametirized");
	}
	cons5(int a){
		System.out.println("int parametzed");
		age=a;
	}
	cons5(double b){
		System.out.println("double parametrized");
		salary =b;
	}
	cons5(int a ,double b){
		
		System.out.println("int double prarametrized");
		age=a;
		salary=b;
		
	
	} 

	public static void main(String[] args) {
		cons5 c1=new cons5();
		System.out.println(c1.age);
		System.out.println(c1.salary);
		cons5 c2= new cons5(33);
		System.out.println(c2.age);
		System.out.println(c1.salary);
		cons5 c3 =new cons5(300.1);
		System.out.println(c3.salary);
		cons5 c4=new cons5(30,30.1);
		System.out.println(c4.age);
		System.out.println(c4.salary);
		
		

	}

}
