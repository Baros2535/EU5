package day14Lab;

public class LabQuestion4 {

	public static void main(String[] args) {
		boolean isSummer=true;
		int temperature=95;
		deerPlay(temperature,isSummer);
		
		
		
		
	}

	private static void deerPlay(int temperature, boolean isSummer) {
		if(isSummer)
		{
			if (temperature>=60&temperature<=100) {
				System.out.println(true);
			}
			else {
				
				System.out.println(false);
			}
			
		}
		
		else  {
			if (temperature>=60&temperature<=90) {
				System.out.println(true);
			}else {
				
				System.out.println(false);
			}
			
			
		}
	}

}
