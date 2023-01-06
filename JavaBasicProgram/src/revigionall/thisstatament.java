package revigionall;

class G{
	G(){
		System.out.println("running defaut constrctuer");
	}
	G(int i){
		this();
		System.out.println("running G(int ) constrcture");
	}
	G(double d){
		this(12);
		System.out.println("ruuning double consatrur");
	}
}

public class thisstatament {

	public static void main(String[] args) {
		System.out.println("program start");
		G g1=new G(54.26);
		System.out.println("program End");

	}

}
