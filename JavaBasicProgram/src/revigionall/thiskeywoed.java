package revigionall;


class F{
	int i;
	double d;
	F(int i,double d){
		System.out.println("running F() consatructor --");
		this.i=i;
		this.d=d;
		
		
		
	}
	void println() {
				
		System.out.println("i="+i);
		System.out.println("d="+d);
			}
}
public class thiskeywoed {

	public static void main(String[] args) {
		F f1=new F(123,78.98);
		f1.println();
		

	}

}
