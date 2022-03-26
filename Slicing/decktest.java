package Slicing;

import java.util.ArrayList;

public class decktest {

	public static void main(String[] args){
		
		// Array for suits
		String suit[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks
		String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// String for specific card
		String n;	
		// Array for deck
		ArrayList<String> deck = new ArrayList<String>();
		
		for(int i = 0; i < suit.length; i++ ){
			for(int j = 0; j < rank.length; j++) {
				n = rank[j] + " of " +suit[i];
				deck.add(n);
			}
		}
		
		System.out.println(deck);
	}
}
