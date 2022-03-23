package Gameof21;

import java.util.ArrayList;

public class programSlicing {
	
	// Program Slice for the ArrayList 'cardrank'
	public void rankdeck(int a) {
		
		// Array for ranks to be used for deck creation
		String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// Array for card rank
		ArrayList<String> cardrank = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++ ){
			for(int j = 0; j < ranks.length; j++) {
				//n = ranks[j] + " of " +suits[i];
				//cardsuit.add(suits[i]);
				cardrank.add(ranks[j]);
				//deck.add(n);
			}
		}
		System.out.println("Rank: " + cardrank.get(a));
	}
	
	// Program Slice for 'score'
	public int Handscore(int a) {
		
		int score = 0;
		// Array for ranks to be used for deck creation
		String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// Array for card rank
		ArrayList<String> cardrank = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++ ){
			for(int j = 0; j < ranks.length; j++) {
				//n = ranks[j] + " of " +suits[i];
				//cardsuit.add(suits[i]);
				cardrank.add(ranks[j]);
				//deck.add(n);
			}
		}
		
		switch (cardrank.get(a)) {
		  case "Ace": score += 1; break;
		  case "2": score += 2; break;
		  case "3": score += 3; break;
		  case "4": score += 4; break;
		  case "5": score += 5; break;
		  case "6": score += 6; break;
		  case "7": score += 7; break;
		  case "8": score += 8; break;
		  case "9": score += 9; break;
		  default: score += 10; break;
		}
		System.out.println("Score: " + score);
		return score;
	}
	
	// Program Slice for size of the deck prints variable 'total'
	public void sizeofdeck() {
	
		int total = 0;
		// Array for suits to be used for deck creation
		String suits[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks to be used for deck creation
		String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// Array for deck
		ArrayList<String> deck = new ArrayList<String>();
		for(int i = 0; i < suits.length; i++ ){
			for(int j = 0; j < ranks.length; j++) {
				String n = ranks[j] + " of " +suits[i];
				//cardsuit.add(suits[i]);
				//cardrank.add(ranks[j]);
				deck.add(n);
			}
			total = deck.size();
		}
		System.out.println("Amount of cards: " + total);
		
	}
	
	// Program Slice for size of the deck prints variable 'ans'
	public String answer(int x, String ans) {
	
		int score = Handscore(x);
		
		if(ans.equalsIgnoreCase("even")) {
			if(score % 2 == 0) {
				System.out.println("Correct");
				return "Correct";
			}
			else {
				System.out.println("Incorrect");
				return "Incorrect";
			}
		}
		else if(ans.equalsIgnoreCase("odd")) {
			if(score % 2 != 0) {
				System.out.println("Correct");
				return "Correct";
			}
			else {
				System.out.println("Incorrect");
				return "Incorrect";
			}
		}
		else {
			System.out.println("Invalid Entry");
			return "Invalid Entry";
		}

	}
	
	// Program Slice for the cards in deck prints variable 'a' for index in deck
	public void deck(int a) {
		
		// Array for suits to be used for deck creation
		String suits[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks to be used for deck creation
		String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// Size of deck
		String n;
		// Array for deck
		ArrayList<String> deck = new ArrayList<String>();
		
		for(int i = 0; i < suits.length; i++ ){
			for(int j = 0; j < ranks.length; j++) {
				n = ranks[j] + " of " +suits[i];
				//cardsuit.add(suits[i]);
				//cardrank.add(ranks[j]);
				deck.add(n);
			}
		}
		
		System.out.println("Card: " + deck.get(a));
	}
	
	public static void main(String[] args){

		programSlicing test = new programSlicing();
		System.out.println("----------Slice1----------");
		test.rankdeck(0);
		System.out.println("----------Slice2----------");
		test.Handscore(10);
		System.out.println("----------Slice3----------");
		test.sizeofdeck();
		System.out.println("----------Slice4----------");
		test.answer(1, "odd");
		System.out.println("----------Slice5----------");
		test.deck(51);
	}
	
}
