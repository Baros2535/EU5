package day14Lab;

public class LabQuestion2 {

	public static void main(String[] args) {
		int num1=1;
		int num2=3;
		
		love6(num1,num2);
		

	}

	public static void love6(int num1, int num2) {
if(num1==6||num2==6||(num1-num2)==6||(num2-num1)==6||(num1+num2)==6)
		{
			
			System.out.println(true);
			
		}
else {
	System.out.println(false);	
}
		
		
		
	}

}
