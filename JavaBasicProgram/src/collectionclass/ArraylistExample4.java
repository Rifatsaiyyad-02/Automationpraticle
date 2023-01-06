package collectionclass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample4 {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();//generic
		System.out.println("is Arraylist empty"+a1.isEmpty());
		a1.add("Ravi");
		a1.add("vijay");
		a1.add("Ajay");
				a1.add("Hanumat");
				ArrayList<String>a12=new ArrayList<String>();//generic
				a1.add("Ravi");
				a1.add("Hanumat");
				a1.add("pune");
				System.out.println("a1 list elemets:"+a1);
				System.out.println("a12 list elemts "+a12);
				a1.retainAll(a12);
				System.out.println("a1 list after retalall()"+a1);
				System.out.println("iterator the elemts after retaining the elemts of ");
				Iterator itr=a1.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
     List l1=new ArrayList();
     l1.add("pune");
     l1.add("pune");
     l1.add("123");
     System.out.println(l1);
     
				
				



	}

}
