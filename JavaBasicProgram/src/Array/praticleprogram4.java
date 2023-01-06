package Array;

public class praticleprogram4 {

	public static void main(String[] args) {
		int arr[]=new int[] {4,5,6,4,8,8,9,7,5};
		System.out.println("length"+arr.length);
		System.out.println("duplicat elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			//System.out.println("*************************");
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]);
				System.out.println(arr[j]);
	
					
			}
		}
				
		}

	}


