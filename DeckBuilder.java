package Gameof21;

import java.util.ArrayList;

public class DeckBuilder {

	// Array for suits to be used for deck creation
	String suits[] = {"Hearts","Spades","Clubs","Diamonds"};
	// Array for ranks to be used for deck creation
	String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	// Size of deck
	String n;
	// Array for deck
	ArrayList<String> deck = new ArrayList<String>();
	// Array for card suit
	ArrayList<String> cardsuit = new ArrayList<String>();
	// Array for card suit
	ArrayList<String> cardrank = new ArrayList<String>();
		
	public String cardSuit(int suit) {
		
		return suits[suit];
	}
	
	public String cardRank(int rank) {
		
		return ranks[rank];
	}
	
	public void deck(int a) {
		
		for(int i = 0; i < suits.length; i++ ){
			for(int j = 0; j < ranks.length; j++) {
				n = ranks[j] + " of " +suits[i];
				cardsuit.add(suits[i]);
				cardrank.add(ranks[j]);
				deck.add(n);
			}
		}
		
		System.out.println("Card: " + deck.get(a));
	}
	
	public int Handscore(int a) {
		int score = 0;
		
		switch (cardrank.get(a)) {
		  case "Ace":
			  	score += 1;
			  	break;
		  case "2":
			  	score += 2;
			  	break;
		  case "3":
			  	score += 3;
			  	break;
		  case "4":
			  	score += 4;
			  	break;
		  case "5":
			  	score += 5;
			  	break;
		  case "6":
			  	score += 6;
			  	break;
		  case "7":
			  	score += 7;
			  	break;
		  case "8":
			  	score += 8;
			    break;
		  case "9":
			  	score += 9;
			    break;
		  default:
			  	score += 10;
			  	break;
		}
		System.out.println("Score: " + score);
		return score;
	}
}
