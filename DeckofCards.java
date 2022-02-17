package Gameof21;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DeckofCards {
	
	public static void main(String[] args){

		int totalCards = 0;
		// Array for suits
		String suit[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks
		String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// Size of deck
		String n;
		// Array for deck
		ArrayList<String> deck = new ArrayList<String>();
		// Array for card suit
		ArrayList<String> cardsuit = new ArrayList<String>();
		// Array for card suit
		ArrayList<String> cardrank = new ArrayList<String>();
		
		for(int i = 0; i < suit.length; i++ ){
			for(int j = 0; j < rank.length; j++) {
				n = rank[j] + " of " +suit[i];
				cardsuit.add(suit[i]);
				cardrank.add(rank[j]);
				totalCards++;
				deck.add(n);
			}
		}
		
		int randomNum = ThreadLocalRandom.current().nextInt(0, totalCards);
		int score = 0;
		
		switch (cardrank.get(randomNum)) {
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("For this test guess weather the next card you pick is even or odd: ");
		
		String uinput = sc.nextLine();
		
		System.out.println(deck.get(randomNum));
		if(uinput.equalsIgnoreCase("even")) {
			if(score % 2 == 0) {
				System.out.println("Correct");
			}
			else {
				System.out.println("Incorrect");
			}
		}
		else if(uinput.equalsIgnoreCase("odd")) {
			if(score % 2 != 0) {
				System.out.println("Correct");
			}
			else {
			System.out.println("Incorrect");
			}
		}
		else {
			System.out.println("Invalid Entry");
		}
		sc.close();
	}
	
}
