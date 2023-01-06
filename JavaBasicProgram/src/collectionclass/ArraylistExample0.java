package collectionclass;

import java.util.ArrayList;

public class ArraylistExample0 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();//crating arraylist -default size is 10
		list.add("mango");//auto upcating from String to object class object
		list.add(1235);//first boxing for int to integer class object-->upcasting to odject classs
		list.add("Banana");//auto upcating from String to object class object
		list.add('c');//first boxing for char to charater class object-->upcasting to odject classs
		list.add(15.66);//first boxing for double  to Double class object-->upcasting to odject classs
		list.add(true);//first boxing for boolean to Boolean class object-->uocasting to odject classs
		list.add(new ArraylistExample0());//ArraylistExample class object will be upcasted to object class object
		list.add("Banana");//dupicated
		//printing the arraylist object 
		System.out.println("size of list:"+list.size());
		System.out.println("elements of list:"+list);
		System.out.println("Traversing list through for loop");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for loop");
         //for each loop
		for(Object fruit:list) {
			System.out.println(fruit);
		}
		//accessing the element
		System.out.println("returning element:"+list.get(2));
		
		//changing /update existing object
		list.set(1, "Dates");
		System.out.println("size of list:"+list.size());
		
		System.out.println("Elements of list:"+list);
		
		

		

	}

}
