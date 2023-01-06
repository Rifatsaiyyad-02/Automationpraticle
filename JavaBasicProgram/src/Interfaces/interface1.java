package Interfaces;
interface Drawable{
	int salary=25000;//by defaut --->public static final int salary=25000;
	void draw();//by defaut--->public abstract void draw();
}
class rectangle1 implements Drawable{//interface + class=implements
	public void draw() {
		System.out.println("drawing rectangle ");
	}
	
}
class circle implements Drawable{//interface + class=implements

	public void draw() {
		System.out.println("drawing circle");
	}
}

public class interface1 {

	public static void main(String[] args) {
		System.out.println("interface varible salary"+ Drawable.salary);
		rectangle1 r1=new rectangle1();
		r1.draw();
		circle c1=new circle();
		c1.draw();
		Drawable d=new circle();
		d.draw();
		

	}

}
