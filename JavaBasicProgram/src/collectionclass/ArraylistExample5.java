package collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistExample5 {

	public static void main(String[] args) {
		//generic with the hepl of generic we can force collection to strore similar type of data
		List<Integer>l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(13);
		l2.add(15);
		System.out.println("Size "+l2.size());
		System.out.println("elemets of collection:"+l2);
		Collections.reverse(l2);
		System.out.println("reversing scored elemts of collection"+l2);
		

	}

}
