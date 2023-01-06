package Day1;

public class Sample5 {
     static int empId=1002;
     static boolean resut=true;
	public static void main(String[] args) {
		int age=30;
		
		System.out.println("Age is: "+age);
		System.out.println("SGV empId: "+empId);
		System.out.println("SGV resut: "+resut);
		
		
		
		

	}
    public static int empId1() {
    	System.out.println("pritemId is running..");
    	return empId=1002;
    }
    static boolean resut1(boolean b1) {
    	System.out.println("resut is running..");
    	return resut=false;
    }

}
