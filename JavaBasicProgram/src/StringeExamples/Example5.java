package StringeExamples;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		String str1="Dhoripune";
		//to print one by one charactre of string
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("*************************");
		for(int i=str1.length()-1; i>=0;i--) {
			System.out.println(str1.charAt(i));

	}
		System.out.println("*************************");
		String temp="";
		for(int i=str1.length()-1; i>=0;i--) {
			temp=temp+str1.charAt(i);//""+en=>e+n=>en+u=>enu
		}
		System.out.println("str1"+str1);
		System.out.println("temp"+temp);
		System.out.println(reverseString("Dhoripune"));
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("enter string to be revese");
		s2=scn.next();
		System.out.println("reverse string  is:"+reverseString(s2));
		String s3;
		System.out.println("enter string to check for palindrome");
		s3=scn.next();
		palinString(s3);




}

	 static String reverseString(String str) {
		String temp="";
		for(int i=str.length()-1; i>=0;i--) {
			temp=temp+str.charAt(i);//
		}
		return temp;
		
	}

	 static void palinString(String str) {
		//String s1=str;
		String temp="";
		for(int i=str.length()-1; i>=0;i--) {
			temp=temp+str.charAt(i);//
		
	}
				}

		}

		
