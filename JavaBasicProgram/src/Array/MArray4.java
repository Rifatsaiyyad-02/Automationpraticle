package Array;

import java.util.Arrays;

public class MArray4 {

	public static void main(String[] args) {
		int numarray[]= {33,3,4,5};
		System.out.println("pritln oringal array:");
		for(int i:numarray) {
			System.out.println(i);
		}
		System.out.println("println clone of the array:");
		int copyofnumarray[]=numarray.clone();
		for(int i:copyofnumarray) {
			System.out.println(i);
		}
		System.out.println("are both equal numrarray and copyofnumarray");
		System.out.println(Arrays.equals(numarray, copyofnumarray));
		System.out.println("*************************");
		Arrays.sort(numarray);//3,4,5,33
		System.out.println("are both equal numberarray and copyofnumberArray?");
		
		System.out.println(Arrays.equals(numarray,copyofnumarray));
		
		


	}

}
