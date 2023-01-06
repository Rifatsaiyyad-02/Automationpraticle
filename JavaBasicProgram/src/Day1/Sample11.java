package Day1;

public class Sample11 {
    static int  pincode=1000;
    int j=14;
    double salary=4500;
	static int additon(int x,int y)
	{ 
		System.out.println("value of x: "+x);
		System.out.println("value if y is: "+y);
		System.out.println("value if y is: "+x+y);
		

			
	return (x+y);
	}


	public static void main(String[] args) {
		System.out.println("Program Start");
		System.out.println("pincod is: "+pincode);
		Sample11 g1 = new Sample11();
		System.out.println("j="+g1.j);
		//or
		//Sample11 g2 = new Sample11();
		//System.out.println("salary is: "+g2.salary);

		System.out.println("salary is: "+g1.salary);
		Sample11.additon(30, 40);
		//or

		//Sample11 g2 = new Sample11();
		//System.out.println("salary is: "+g2.salary);
		//int x=30,y=40;
		//System.out.println("value of x: "+x);
		//System.out.println("value if y is: "+y);
		//System.out.println("value if y is: "+x+y);
		
		
		
		
		

	}
		}


