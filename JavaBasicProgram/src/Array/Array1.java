package Array;

public class Array1 {

	public static void main(String[] args) {
		/*
		 //declaration
		  int a[];
		  //size initialization
		   a=new int[5];
		 */
		//or
		int a[]=new int [5];//declartion and instatiation
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//or
		//int a1[]=new int [] {10,20,30,40,50};//declartion and instatiation
		//or
		//int a2[]={10,20,30,40,50}
		
		
				System.out.println("***********after initialization*********");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//or
		System.out.println("Array elemtes count:"+a.length);
		System.out.println("******normal for loop*******");
		//traversing array
		for (int i=0; i<a.length;i++) {
		System.out.println(a[i]);
		//System.out.println("********for each loop*********");
		}
		//LHS should be same as RHS type in from of datatype or class
		//for(LHS:RHS)
		System.out.println("********for each loop*********");

		for(int num:a) {
			//arrdatatyr variable:arryname
			System.out.println(num);
		}
		char[] getArray=new char[4];
		getArray[0]='A';
		getArray[1]='B';
		getArray[2]='c';
		getArray[3]='D';
		//System.out.println(getArray[0]);
		System.out.println("******************");
		  //or
		
		char[] getArray2= {'A','B','c','D'};
		System.out.println(getArray2[0]);
		System.out.println(getArray2[1]);


		     //or
		char[]getArray3=new char[] {'A','B','C','D'};
		System.out.println("***********for loop******5**********");
		for (char num:getArray3) {
			System.out.println(num);
		}





		
		




		
		


	}

}
