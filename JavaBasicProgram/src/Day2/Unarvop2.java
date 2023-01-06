package Day2;

public class Unarvop2 {

	public static void main(String[] args) {
    int a =55,b;
    b=a++;
    int x =a,y;
    System.out.println("x"+x);
    y=++x;
    System.out.println("a"+a);
    System.out.println("b"+b);
    System.out.println("x"+x);
    System.out.println("y"+y);
    int p=-10,q=20,res;
    res= p++ + --q;
    System.out.println("res:"+res);
    System.out.println("p:"+p);
    System.out.println("q:"+q);
    System.out.println("***********");
    int res1 =++p + ++q;
    System.out.println("res:"+res1);
    System.out.println("p:"+p);
    System.out.println("q:"+q);








	}

}
