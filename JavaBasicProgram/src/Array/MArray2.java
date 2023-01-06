package Array;

 class MArray2 {

	public static void main(String args[]) {
		// declaring and initializing 2d array
		int  arr[][]={ {1,2,3,},{4,5},{7,8,9,4}};//each entry is one row 
		//println 2d array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr[i].length;j++){
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
		char[] chararr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
		for (char i=0;i<chararr.length;i++) {
			for(int j=0;i<chararr[i].length;j++) {
				System.out.print(arr[i][j]+"");
				
			}
		}

	}

}
