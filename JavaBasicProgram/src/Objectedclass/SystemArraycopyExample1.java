package Objectedclass;

public class SystemArraycopyExample1 {
	

	public static void main(String[] args) {
		String a[]= {"A","B","B","H","A","M"};//source array
		String b[]= {"S","H","U","N","U","L","L","J","A","D","O","N"};
		String src[],dest[];
		int srcpos,destpos,length;
		src=a;
		srcpos=2;
		dest=b;
		destpos=3;
		length=4;
		System.out.println("scours array:");
		for(int i=0;i<src.length;i++) {
			System.out.println(a[i]);
						
		}
		System.out.println();
		System.out.print("destination array:");
		System.out.println("length"+src.length);
		for(int i=0;i<src.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println();
System.out.println("soucrce position:"+srcpos);
System.out.println("destination postion:"+destpos);
System.out.println("length"+length);
System.arraycopy(src, srcpos, dest, destpos, length);
System.out.println("destination array after use of arraycopy()");
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);






		
		

	}

}
}
