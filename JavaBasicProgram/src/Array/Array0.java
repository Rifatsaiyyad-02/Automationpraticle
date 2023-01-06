package Array;

public class Array0 {
	
	public static void main(String[] args) {
	//String[] cars;
	//cars=new String[4];
		//or
		//String[] cars=new String[4];
	//cars[0]="Volvo";
	//cars[1]="BMW";
		//cars[2]="Ford";
		//cars[3]="Mazada";
		
	//System.out.println(cars[0]);
	//System.out.println(cars[1]);
		//or
		String[]cars= {  "Volvo" ,"BMW","Ford","Mazada"};
		System.out.println(cars[0]);//volvo
		//System.out.println(cars[1]);//Bmw
		//chang an array elements
		cars[0]="ople";
		System.out.println(cars[0]);
		//array elements count
		System.out.println(cars.length);
		System.out.println("**********normal for loop********");
		for (int i=0; i<cars.length;i++) {//< less
			System.out.println(cars[i]);
		}
			System.out.println("**********for each lope*********");
			for (String l :cars) {
				System.out.println(l);
			}
		}

	

	}


