package Day1;

public class all {
	static int x=25;
	int y=26;
	
	void dispay(int z) {
		System.out.println("value of z"+z);
	}
	
	

	public static void main(String[] args) {
		int age=23;
		System.out.println("program start ");
		System.out.println("value of age"+age);
		System.out.println("value of x"+x);
		System.out.println("value of x"+all.x);
		all f1=new all();
		f1.dispay(28);
		System.out.println("value of x"+f1.y);
		
		System.out.println("program end");

	}

}
