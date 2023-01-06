package interiachical;
class fruit{//parent class
	fruit(){//consrtor
		System.out.println("fruit class con..");
	}
	public void taste() {//method

		System.out.println("fruits are sweet");
	}
}
	class apple  extends fruit{//child class
		//child class/sub class of fruit
		apple(){//constore
	                    //super();//java compile will write defaut super()		
			System.out .println("apple class conn..");
		}
		public void shape() {
			System.out.println("apple is round");
		}
	}


public class Example4 {

	public static void main(String[] args) {	
		apple e1=new apple();

		e1.taste();//call method parent class
		e1.shape();//call method of chlid class
		
		

	}

}
