package day14Lab;

public class LabQuestion5 {

	public static void main(String[] args) {

boolean isMyBirthDay=true;
int speed=65;
caughtSpeeding(speed,isMyBirthDay);

		
		
		
	}

	public static void caughtSpeeding(int speed, boolean isMyBirthDay) {
if (isMyBirthDay) {
	if (speed<=65) {
		System.out.println(0);
	}
	else if (speed>=66&speed<=85) {
		System.out.println(1);
	}else {
		System.out.println(2);
	}
}else {
	
	if (speed<=60) {
		System.out.println(0);
	}
	else if (speed>=61&speed<=80) {
		System.out.println(1);
	}else {
		System.out.println(2);
	}
	
	
}

		
	}

}
