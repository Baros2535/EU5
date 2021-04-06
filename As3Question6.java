package assegnment3;

public class As3Question6 {

	public static void main(String[] args) {
		
		int maxGramOfCaffein=10;
		int numberOfMilligramsOfCaffeineIn=500;
		int numberOfDrink=maxGramOfCaffein*1000/numberOfMilligramsOfCaffeineIn;
      System.out.println("Number of milligrams in drink: "+numberOfMilligramsOfCaffeineIn);
      System.out.println("It would take about "+ numberOfDrink+ " drinks for a lethal overdose");
	
	}

}
