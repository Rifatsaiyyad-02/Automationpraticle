package Day3;

public class cons2 {
	int r=10;
	
			cons2() {
		System.out.println("zero parametrized"+r);
	}
	cons2(char c){
		System.out.println("singe parametrized");
		
		
		
	}
	cons2(int num1 , int num2) {
		System.out.println(" int-int parameterized constructor");
	}
	cons2(double num1, int num2){
		System.out.println("double-int parametrized con");
	}
	cons2(int num1,double num2){
		System.out.println("int-doble cons");
		
		
	}

	public static void main(String[] args) {
		cons2 a=new cons2();
		cons2 a1=new cons2('f');

		
		
		
				
		

	}

}
