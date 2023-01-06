package Array;

public class mArray3 {

	public static void main(String[] args) {
		//declaring a sources array
		char[] copyfrom= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		///                0   1   2   3   4   5   6   7   8   9   10  11  12
		//declaring a destination array
		char[] copyto=new char[7];
		//copy array using system.arraycopy() method
		   
		
	System.arraycopy(copyfrom,2, copyto, 0, copyto.length);
	for(int i=0; i<copyto.length;i++) {
		System.out.println(copyto[i]);
	}
		
		

	}

}
