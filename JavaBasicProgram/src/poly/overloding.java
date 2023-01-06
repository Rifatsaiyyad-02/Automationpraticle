package poly;
class Shapes{
	public void area() {
		System.out.println("find area");
	}
	public void area(int r) {
		System.out.println("circle area ="+3.14 * r * r);
	}
	public void area(double b,double h) {
		System.out.println("triagle area ="+0.5 * b * h);
	}
	public void area(int l,int b) {
		System.out.println("rectangle area=" +l * b);
	}
}


public class overloding {//same method but differt parameter

	public static void main(String[] args) {
	 Shapes s1=new Shapes();
	 s1.area();
	 s1.area(5);
	 s1.area(6.0,1.2);
	 s1.area(6,2);

	}

}
