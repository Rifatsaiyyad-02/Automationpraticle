package StringeExamples;

public class StringBuilderclass {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("helloo");
		sb.append("java");//now oringinal stringis change
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuilder sb1= new StringBuilder("hello java");
		System.out.println(sb1);
		StringBuilder sb2= new StringBuilder("hello java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		System.out.println((sb1.toString().equals(sb2.toString())));


		

		 


		

	}

	
	{

		}

	}

	

