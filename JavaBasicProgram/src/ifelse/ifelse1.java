package ifelse;

public class ifelse1 {

	public static void main(String[] args) {
		int num1=45,num2=30;
		if(num1!=num2) {
			System.out.println("numbber1 is grater than number2");
			
			
		}else {
			System.out.println("number1 is less thsn number2");

		}
		if(num1>num2) {
			System.out.println("number1 is greter than number2");
		}else {
			System.out.println("number1 is less than number2");
			
		}
		if(num2<num1) {
			System.out.println("number1 is greatr than number2");
			
		}else {
			System.out.println("number1 is less thna number2");
			
		}
		if(num1==num2 ||num1>num2) {
			System.out.println("number1 is either equals to number2 or greater");
		}else {
			System.out.println("number1 is smaller than number2 ");
			
		}
		if(num1>=num2 && num1>num2 ) {
			System.out.println("number1 is either equal to number2 or greater");
			
		}else {
			System.out.println("number1 is smaller than number2");
			
		}
		int sub1=50,sub2=30;
		if(sub1>35 && sub2>35) {
			System.out.println("pass...");
			
		}else {
			System.out.println("fail...");
		}

	}

}
