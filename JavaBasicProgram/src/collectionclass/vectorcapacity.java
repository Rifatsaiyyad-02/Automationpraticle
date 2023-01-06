package collectionclass;

import java.util.Vector;

public class vectorcapacity {

	public static void main(String[] args) {
		Vector<String>vcTr=new Vector<String>();
		System.out.println("Defaut vector capacity"+vcTr.capacity());
		System.out.println("vectror size :"+vcTr.size());//0
		vcTr.setSize(2);
		System.out.println("vectror size :"+vcTr.size());//
		System.out.println("vectror elemnts :"+vcTr);
		vcTr.addElement("sundey");
		vcTr.addElement("monday");
	System.out.println("after addtion ,vector elemets :"+vcTr);
	System.out.println("after add vector size :"+vcTr.size());
	vcTr.addElement("wennesday");
   System.out.println("after addelemnts vector size "+vcTr.size());
   System.out.println(" vector capacity"+vcTr.capacity());




		


		


	}

}
