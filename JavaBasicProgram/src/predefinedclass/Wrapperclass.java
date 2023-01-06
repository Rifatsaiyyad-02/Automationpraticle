package predefinedclass;

public class Wrapperclass {

	public static void main(String[] args) {
	int a=20;
	//converting int into interger
	Integer k=new Integer(a);//converting int into interger explicitly
	Integer l=new Integer(20);//converting int into interger explicitly
	Integer j=a;//autoboxing ,now compiler will write interger .value of (a)
	System.out.println("a:"+a+"\nk:"+k+"\nl:"+l+"\nj:"+j);
	System.out.println("*****unboxing of boxed object ********");
	//converting interger to int 
	Integer a1=new Integer(3);
	int i1=a1.intValue();//coverting Integer to int explicitly
	System.out.println("a1:"+a1+"\ni1:"+i1);
	System.out.println("a1==i1:"+(a1==i1));
	System.out.println("a1.equals(i1:"+a1.equals(i1));


	/**
	 * wrapper class is perdefined class in java belongs to java.lenge package
	 * its used to convert primitive type to object type 
	 *         -------->boxing operation --->implicitive or auto-boxing 
	 *  converting back the boxed object into primitive type is known as 
	 *  ------->un-boxing opration-->
	 *  in wapper class toString () and equlas and '=='are ovrrided      
	 */
	
	
	
	

	}

}

