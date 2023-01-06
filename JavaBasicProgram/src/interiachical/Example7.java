
package interiachical;
class honor{//parent class
	public void honor1() {
		//default constructor
		System.out.println("i am honor");
	}
}
class onepuls extends honor{//child class of honor and parent of sumg
	//defaut constructor with super()
	public void one1() {
		
		System.out.println("i am onepuls");
	}
}
class sumg extends onepuls{//child class of onepuls
	//defaut constructor with super()
	public void sumg1() {
		System.out.println("i am sumg");
	}
}
public class Example7{
	public static void main(String[]args) {
		sumg a1=new sumg(); 
		a1.honor1();
		a1.one1();
		a1.sumg1();
		
	}
}
