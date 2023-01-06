package Array;
	

	

class testarray1{//array pass with paramert
	                                         //0  1  2  3  4   5
	static void min(int arr[]) {//int arr[]=a={33 13, 4, 50,15, 0}
		int min=arr[0];//33
		for (int i=1;i<arr.length;i++) {//index 1 value is 13
			if (min >arr[i]) {//min value  33 gethr than>13,||13 is gerther than 4||4 is gether than 50 false||
				//|4 is gether than 15 false|4|is gether than 0|
				min=arr[i];//0
			}
		}
		System.out.println("min number in array is"+min);

		 	}
	static void max(int arr[]) {
    int max=arr[0];
    for (int i=1;i<arr.length;i++) {//i=1 value is 13
    	      if (max <arr[i]) {
    	    	  max=arr[i];

    	      }
    
    	
    }
    System.out.println("max number in array is"+max);

    

      
}
	}

public class Array4 {

	public static void main(String args[]) {
		int a[]= {33,13,4,50,15,1,55,0};
		testarray1.min(a);
		testarray1.max(a);
		}
	}

