package ifelse;

public class ifelse2 {

	public static void main(String[] args) {
		int marks=89;
		if(marks<50) {
			System.out.println("fail");//> grather and <less
			
		}else if(marks>=50 && marks<60) {
			
			System.out.println("d grade");
		}else if(marks>60 && marks<70) {
			System.out.println("c grade");
		}else if(marks>=70 && marks<80) {
			System.out.println("b grade");
		}else if(marks>=80 && marks<90) {
			System.out.println("a grade");
			
		}else if(marks>=90 && marks<100) {
			System.out.println("a grade");
		}else {
			System.out.println("invaild");
		}

	}

}
