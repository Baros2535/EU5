package myWorks;

public class Question28 {

	public static void main(String[] args) {
		
		fizzArray(5,10);
		
	}

	public static void fizzArray(int i, int j) {
		String str="[" +i ;
		System.out.print(str);
		int k=0;
		for(k=i+1;k<j;k++) {
			
			str=","+k;
			System.out.print(str);
			
			
		}
		
		
		System.out.print("]");
		
	}

}
