package assegnment3;

public class As3Question7 {

	public static void main(String[] args) {
		
	int priceInCents=45;
	int quarter=(100-priceInCents)/25;
	int  dimes=(100-priceInCents)%25/10;
	int nickles=(100-priceInCents)%25%10/5;
		
	System.out.println("Price in cents: "+priceInCents );
	System.out.println("Your change is "+ quarter+ " quarters, "+ dimes+ " dimes, and " + nickles + " nickles");
		
	}

}
