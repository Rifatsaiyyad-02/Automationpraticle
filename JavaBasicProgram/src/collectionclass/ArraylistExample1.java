package collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample1 {

	public static void main(String[] args) {
		ArrayList  list =new ArrayList();//creating arraylist
		list.add("Mango");//atuo upcasting from string to object class object 
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		//printing the arraylise object 
		System.out.println("size of list :"+list.size());
		System.out.println("Elements of list :"+list);
	
		System.out.println("Travesing list througth for loop");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Travesing list througth for each loop");
		//traversing list through for each loop
		for(Object fruit:list ) {
			System.out.println(fruit);
		}
		//accesing the elements 
		System.out.println("Retuning elemets :"+list.get(1));//it will return  the 2nd elements because index start from 0
		
		
		
		//chenging elements 
		list.set(1, "dates ");
		System.out.println("size of list "+list.size());
		System.out.println("Elements of list :"+list);
		
		
		
		//shorting the list
		Collections.sort(list);//dy defaut it sort the passed collection elements in assing order and stroe it in the same collection
		System.out.println("size of list "+list.size());
		System.out.println("Elements of list :"+list);
		 
		System.out.println("Travesing list througth for each() method");
		//the foreach()method is new feature,introduction in java 8
		list.forEach(a ->{//here we are using lambo experession
			System.out.println(a);
		});
		System.out.println("Travesing list througth Intertor interface:");
		Iterator itr=list.iterator();
		/**
		 * list elemets :[Banana ,Datesn,grapes,mango]
		 * Interator is a Interface in collection which is used to iterate collection elements
		 * interator interface  has  following method to iterate collection elements
		 * 1.hasnext()---->boolean -->true next element is present ,false no next elemnts
		 * 2.next()-->object-->it will return next elements from collection
		 * 3.removr()-->void -->elemets deletion 
		 * iterator object can be use to iterate a collection only once ,for 2nd interration crate new intrator object
		 * 
		 */ 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());
		System.out.println("**********with used intrrator object*********");
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("******wiht new interator object******");
		Iterator itr2=list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}


		


		




		

		
		

	}

}
