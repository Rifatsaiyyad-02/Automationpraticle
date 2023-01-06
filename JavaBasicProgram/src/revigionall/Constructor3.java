package revigionall;
  class B{
	  double d=3.45;
	  B(){
		  System.out.println("running class b consturctor"+d);
		  //chnage variable value
		 		  d=12.45;
	  }
	
}

 class Constructor3 {

	public static void main(String[] args) {

		System.out.println("program start");
		B b1=new B();
		System.out.println("d=:"+b1.d);
				System.out.println("-----------");
		B b2=new B();
		System.out.println("d="+b2.d);

		
		

	}

}
