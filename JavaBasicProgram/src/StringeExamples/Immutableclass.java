package StringeExamples;

public class Immutableclass {

			/**
		 * class and it data member should be declare as final
		 * constructor should be parametreize so that above data memeber can be initialize
		 * only getter() method should be writtenin the class for data members		 */
            final String name;
            final double salary;
		
            Immutableclass(String name,double salary){
            	this.name=name;;
            	this.salary=salary;
            }
            public String getName() {
            	return name;
            	
            }
            public double getsalary() {
            	return salary;
            }
            

}
         class sample1{
        	          public void main(String[] args) {
        	        	  Immutableclass obj=new Immutableclass("pune",65894);
        	        	  System.out.println(obj.getName());
        	        	  System.out.println(obj.getsalary());
        	        	          	        	  Immutableclass obj2=new Immutableclass("mumbai",657894);
        	        	  System.out.println(obj2.getName());
        	        	  System.out.println(obj2.getsalary());

        	        	  

        	        	  
        	          }

        	 
         }
