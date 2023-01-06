package collectionclass;

import java.util.ArrayList;

public class ArraylistExample3 {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	System.out.println("intial list of elements "+al);
	System.out.println("list of elements stauts :"+al.isEmpty());//true
	//according elements to the end of the list
	al.add("Ravi");
	al.add("vijay");
	al.add("Ajay");
	System.out.println("after invoking add (E e) method "+al);
	//according to the specifiact position
	al.add(1,"Gaurav");
	System.out.println("After invoke add(int index ,E elements) method "+al);
	ArrayList al2=new ArrayList();
	al2.add("Sonoo");
	al2.add("hanumat");
	System.out.println("al2 ,member :"+al2);
	//according secound list elements to the first list
	System.out.println("list al elements before adding list al2:"+al);
	al.addAll(al2);
	System.out.println("list of al elements after adding list al2:"+al);
	ArrayList al3=new ArrayList();
	al3.add("john");
	al3.add("rahul");
	System.out.println("elemets of al2:"+al2);
	System.out.println("elements of al3:"+al3);
	//adding secound  list elemts  to the fist list at specification position 
	al2.addAll(1,al3);
	System.out.println("After adding al3 intc al2"+al2);
	
	
	
	
	

	}

}
