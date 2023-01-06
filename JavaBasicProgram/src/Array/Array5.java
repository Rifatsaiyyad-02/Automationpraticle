package Array;
class TestretuneArray{
	//creating method which retune an arry
	static int[] getArray() {
		return new int[] {10,30,50,90,60};
		//or 
		//int num[]=new int[3];
		//int[0]=10;
		//int[1]=30;
		//int[2]=50;
	//	int[3]=90;
		//int[4]=60;
	
		
	}
	static int getnum() {
		return(10+31);
	}
}

public class Array5 {

	public static void main(String[] args) {
		//calling method which retun as array
		int arr[]=TestretuneArray.getArray();
		for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);

	}

	}
}
