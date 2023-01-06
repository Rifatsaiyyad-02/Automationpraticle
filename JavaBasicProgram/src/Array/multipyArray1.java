package Array;

public class multipyArray1 {

	public static void main(String[] args) {
	int [] [] arr=new int [3][3];//3 row and coloum 
	System.out.println("Array size:"+arr.length);
	for (int i=0;i<arr.length;i++) {//row count
		for(int j=0; j<arr[i].length;j++) {//colum count
			
			System.out.println(arr[i][j]+"");
	//coulum //   0  1  2
	//row   // 0  
			// 1
			// 2
			
		}
		System.out.println();
		
	}
	System.out.println("*********************");
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	arr[1][0]=40;
	arr[1][1]=50;
	arr[1][2]=60;
	arr[2][0]=70;
	arr[2][1]=80;
	arr[2][2]=90;
	
	for (int i=0;i<arr.length;i++) {//to get row num
		for(int j=0; j<arr[i].length;j++) {//to get coloum num
			System.out.println(arr[i][j]+"");

	

	}

}
	}
}
