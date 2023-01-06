package Array;

import java.util.Arrays;

public class Array6 {

	public static void main(String args[]) {
	int [] num1= {5,2,55,80,100,20,3};
	for (int a:num1) {
		System.out.println(a);
	}
	//sort will sort(num1);
	Arrays.sort(num1);
	System.out.println("*******num after scort*******");
	for(  int a:num1) {
		System.out.println(a);
	}
	System.out.println("****copy range********");
	int[] num2=Arrays.copyOfRange(num1,0,5);
	for(int a:num2) {
		System.out.println(a);
	}
	

	}

}
