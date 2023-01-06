package collectionclass;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {
		//using generic way
		ArrayList<String>a1=new ArrayList<String>();//generic
		a1.add("Ravi");
		a1.add("vijay");
		a1.add("Ajay");
		a1.add("anuj");
		a1.add("gaurav");
		System.out.println("an initial list of elemets :"+a1);
		//Removing specific elements from Arralist
		System.out.println("remove  vijay from collection:"+a1.remove("vijay"));
		System.out.println("afetr invoking remove (object) method :"+a1);
		//removing specification elemets position
		System.out.println("remove index o from collection :"+a1.remove(0));
		System.out.println("after invoking remove (index) method"+a1);
		System.out.println("***************************");
		//creating another arraylist
		ArrayList<String>a12=new ArrayList<String>();
		a12.add("ravi");
		a12.add("hanumat");
		//Adding new elemets to Arraylist
		a1.addAll(a12);
		System.out.println("updated list"+a1);
		//removing all the new elemts from Arraylist
		a1.removeAll(a12);
		System.out.println("After invoking removing removeall"+a1);
		//removing elments on the basic if specific condition
		if (a1.contains("Ajay")){
			a1.remove("Ajay");
			
		}
		System.out.println("After invoking removing removeall"+a1);
		//removing all the elemets available in list
		a1.clear();
		System.out.println("After invoking clear() method"+a1);


		
				

		


		

	}

}
