package ifelse;

public class nonstaticgoablevariable {
	int empId=1200;//non static gobal

	public static void main(String[] args) {
		int age=20;
		System.out.println("I am local variable"+age);
		nonstaticgoablevariable f1=new nonstaticgoablevariable();
		f1.diapay();
		

	}
	void diapay() {
		int empId=303;// local variable
		System.out.println("I am local variable"+empId);
		System.out.println("I am golbal  variable"+this.empId);

	}

}
