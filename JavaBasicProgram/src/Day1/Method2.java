package Day1;

public class Method2 {

	static double salary=1000.67;
	static int empId=1001;
	public static int getEmpId() {
		System.out.println("printEmpsal is running.."+empId);
		return empId;
	}
		
		public static void printEmpsal() {
			System.out.println("printEmpsal is running.."+salary);
		}
		public static void main(String[] args) {
			System.out.println("prigeam statr");
			printEmpsal();
			int res=getEmpId();
			System.out.println("res");
			int sum=res+100;
			System.out.println("final result:" +sum);
		
		

	}
		}


