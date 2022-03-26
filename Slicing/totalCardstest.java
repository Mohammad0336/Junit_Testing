package Slicing;

public class totalCardstest {

	public static void main(String[] args){
	
		// Integer for all cards in deck
		int totalCards = 0;
		// Array for suits
		String suit[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks
		String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		long startTime = System.nanoTime();
		for(int i = 0; i < suit.length; i++ ){
			for(int j = 0; j < rank.length; j++) {
				totalCards++;
			}
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		double time = (double) duration / 1_000;
		System.out.println(time);
		
		System.out.println("Total cards in deck: " + totalCards);
	}
	
}
