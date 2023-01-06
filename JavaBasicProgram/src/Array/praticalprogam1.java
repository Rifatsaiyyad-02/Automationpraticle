package Array;

import java.util.Arrays;

public class praticalprogam1 {

	public static void main(String[] args) {
	int a[]= new int[] {10,20,30,40,50};
	System.out.println("length "+a.length);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	//for(int b:a) {
	//	System.out.println(b);
	System.out.println("****copy the elements**********");
	int[] num=Arrays.copyOf(a,5);
	for (int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	}
	
	
			
	}

	


