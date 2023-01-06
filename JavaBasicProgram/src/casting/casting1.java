package casting;
class member{
	long phone;
	void chat() {
		System.out.println("chatting in whatsapp "+phone); 
	}
}
class Admin extends member{
	void addnumber() {
		System.out.println("addinge a new ");
	}
}

public class casting1 {

	public static void main(String[] args) {
		member a1=new Admin();//implicit up casting
		a1.phone=968547;//value intinlise
		a1.chat();
		Admin e1=new Admin();
		e1.phone=586974;
		e1.chat();
		e1.addnumber();
		
		

	}

}
