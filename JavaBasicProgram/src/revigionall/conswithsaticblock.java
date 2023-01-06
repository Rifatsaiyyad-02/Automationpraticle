package revigionall;

  class T{
	  //static block
	  static {
		  System.out.println("running static block of class t");
		  
	  }
	  //non static block
	  {
		  System.out.println("running nontatic block");
	  }
	  //consatructor
	  T(){
		  System.out.println("running constrctor");
	  }
	
}

  public class conswithsaticblock {
	static {
		System.out.println("running static block of class constrctor");
	}

	public static void main(String[] args) {
		T e1=new T();
		System.out.println("**********************");
		T e2=new T();

	}

}
