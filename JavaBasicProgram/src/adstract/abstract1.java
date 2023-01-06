package adstract;
abstract class shape {
	abstract void draw();//defaut modifire--->protected or public
	
} 
class Rectange extends shape{
	protected void draw() {//defaut modifire--->protected or public
		System.out.println("drawing retange");
	}
}
class circle1 extends shape{
	public void draw() {//defaut modifire--->protected or public
		
		System.out.println("drawing circle");
		
	}
}


public class abstract1 {

	public static void main(String[] args) {
		shape s= new circle1();
		s.draw();
		shape s1=new Rectange();
		s1.draw();
		
		

	}

}
