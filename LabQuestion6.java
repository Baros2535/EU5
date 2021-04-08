package day14Lab;

public class LabQuestion6 {

	public static void main(String[] args) {
		boolean isWeekend=true;
		int numberOfCigars=70;
		cigarParty(numberOfCigars,isWeekend);
	

	}

	public static void cigarParty(int numberOfCigars, boolean isWeekend) {
		
		if (isWeekend) {
			if (numberOfCigars>=40) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}else {
			if (numberOfCigars>=40&&numberOfCigars<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
		
	}

}
