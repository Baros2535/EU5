package day14Lab;

public class LabQuestion1 {

	public static void main(String[] args) {
		stringTimes("Hi",2);
	}

	public static void stringTimes(String string, int i) {
		for (int j = 0; j < i; j++) {
			System.out.print(string);
		}
	}

}
