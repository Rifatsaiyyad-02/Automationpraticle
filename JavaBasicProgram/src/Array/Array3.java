package Array;

public class Array3 {
	

	public static void main(String[] args) {
		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		double sum=0;
		double avarage;
		//access all elements using  for each loop add each elements 
		for (int number:numbers) {
			sum=sum + number;
			//0+2+0-9+0+0+0+5+0+5+0+12+0-25+0+22+0+9+0+8+0+12=36 but sum is double than 36.0
		}
		int arraylength=numbers.length;
		avarage =sum/arraylength;
		//36/10=3.6
		
		System.out.println("sum==="+sum);
		System.out.println("avarage=="+avarage);
		
	

	}

}
