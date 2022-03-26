package Slicing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class answertest {

	public static void main(String[] args){

		int totalCards = 0;
		// Array for suits
		String suit[] = {"Hearts","Spades","Clubs","Diamonds"};
		// Array for ranks
		String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		// Variable for answer
		String answer = "";
		// Array for card rank
		ArrayList<String> cardrank = new ArrayList<String>();
		
		for(int i = 0; i < suit.length; i++ ){
			for(int j = 0; j < rank.length; j++) {
				cardrank.add(rank[j]);
				totalCards++;
			}
		}
		
		int randomNum = ThreadLocalRandom.current().nextInt(0, totalCards);
		int score = 0;
		
		switch (cardrank.get(randomNum)) {
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
		
		Scanner sc = new Scanner(System.in);
		System.out.print("For this test guess weather the next card you pick is even or odd: ");
		String uinput = sc.nextLine();
		if(uinput.equalsIgnoreCase("even")) {
			if(score % 2 == 0) answer = "Correct";
			else answer = "Incorrect";
		}
		else if(uinput.equalsIgnoreCase("odd")) {
			if(score % 2 != 0) answer = "Correct";
			else answer = "Incorrect";
		}
		else {
			answer = "Invalid Entry";
		}
		System.out.println("Score: " + score);
		System.out.println("Answer is: " + answer);	
		sc.close();
	}
	
}
