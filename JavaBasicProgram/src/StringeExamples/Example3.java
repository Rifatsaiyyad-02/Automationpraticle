package StringeExamples;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		String s1="coreJavabasic";
		System.out.println(s1.charAt(0));//c
		System.out.println(s1.charAt(5));//a
		System.out.println(s1.charAt(3));//e
		System.out.println(s1.charAt(1));//o
		for (int i=0;i<s1.length();i++) {
			System.out.println("char at index "+i+":"+s1.charAt(i));
		}
		System.out.println("*******************");
		String s2="hi i am shailesh staying in pune";
		for (int i=0;i<s2.length();i++) {
			System.out.println("char at index "+i+":"+s2.charAt(i));

		

	}
		String name;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=scn.next();
		System.out.println("my name is"+name);
		String[] names=new String[5];
		for (int i=0;i<name.length();i++) {
			System.out.println("Enter emp name:");
			names[i]=scn.next();

		
	}
		for (String n:names) {
			System.out.println(n);
		}
}
}