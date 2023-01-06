package revigionall;
//constructor example
class c{
	double d=3.41;
	c(double a){
		System.out.println("running constructor"+d);
		d=a;
	}
}

public class run3 {

	public static void main(String[] args) {
		System.out.println("program start");
		c a=new c(12.3);
		System.out.println("d"+a.d);
		System.out.println("-------");
		c a1=new c(2.3);

		System.out.println("d"+a1.d);

	}

}
