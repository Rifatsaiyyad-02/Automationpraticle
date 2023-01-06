package poly;
class Hilstations{
	void location() {
		System.out.println("location is ");
	}
	void famousfor() {
		System.out.println("famousfor for");
	}
}
class manali extends Hilstations{
	void location() {
		System.out.println("manali is");
	}
	void famousfor() {
		System.out.println("ti is famous for hadime temple and adveture");
	}
}
class missorie extends  Hilstations {
	void locatoin() {
		System.out.println("missoris is");
	}
	void famousfor() {
		System.out.println("it missorie");
	}
}
class Gulmarg extends Hilstations{
	void location() {
		System.out.println("Gulmarg  is");
	}
	void famousfor() {
		System.out.println("is gumarg");
	}
}

public class runtime2 {

	public static void main(String[] args) {
		Hilstations a= new Hilstations();
		a.location();
		a.famousfor();
		Hilstations s=new manali();//up catsting
		s.location();
		s.famousfor();
		System.out.println("*****************************");
		Hilstations m=new missorie();
		m.location();
		m.famousfor();
		System.out.println("***************************");
		a=new Gulmarg();
		a.location();
		a.famousfor();
		//or
		Hilstations g=new Gulmarg();
		g.location();
		g.famousfor();
		
		
		// TODO Auto-generated method stub

	}

}
