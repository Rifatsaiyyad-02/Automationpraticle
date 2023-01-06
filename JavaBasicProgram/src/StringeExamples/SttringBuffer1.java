package StringeExamples;

public class SttringBuffer1 {

	public static void main(String[] args) {
		//String str="Abc";
		//str.
		StringBuffer sb =new StringBuffer("hello");
		System.out.println("original stringbuffre value"+sb);//hello
		
		sb.append("java");//now original string is changed
		System.out.println(sb);//hellojava
		sb.append("pune");//hellojava pune
		System.out.println(sb);
		sb.replace(1, 3, "xxx");
		System.out.println(sb);//hxxxlopune java
		StringBuffer s1 =new StringBuffer("banglorre is know for it");
		s1.reverse();
		System.out.println(sb);//
		System.out.println("***************");
		StringBuffer s2 =new StringBuffer();
		System.out.println(s2.capacity());
		s2.append("helloo");
		System.out.println(s2.capacity());
		s2.append("java is my favorite lanauvae");
		System.out.println(s2.capacity());//(16*2)+2=34 i.e (oldcapacity*2)
		s2.append(" l am yhujiok");
		System.out.println(s2.capacity());
		
		

		



	}

}
