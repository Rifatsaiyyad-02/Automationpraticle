package predefinedclass;

public class unboxingopration1 {

	public static void main(String[] args) {
		Double doubleobj=25.524;//autoboxing
		System.out.println("doubleobj:"+doubleobj);
		
		//only boxed object can be unboxed 
		double salary=doubleobj.doubleValue();//unboxing
		System.out.println(salary);
		System.out.println(doubleobj==salary);
		Boolean b= true ;//boxing
		boolean b1=b.booleanValue();//unboxing 
		System.out.println(b1);
		Character c1=new Character('a');//boxing
		char c2=c1.charValue();//unboxing
		Integer i=25;
		double d=i.intValue();
		

	}

}
