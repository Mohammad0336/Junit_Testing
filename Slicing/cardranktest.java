package Slicing;

import java.util.ArrayList;

public class cardranktest {

	public static void main(String[] args){
		
		// Array for suits
		String suit[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks
		String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};	
		// Array for card rank
		ArrayList<String> cardrank = new ArrayList<String>();
		
		for(int i = 0; i < suit.length; i++ ){
			for(int j = 0; j < rank.length; j++) {
				cardrank.add(rank[j]);
			}
		}
		System.out.println(cardrank);
	}
}
