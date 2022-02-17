package Gameof21;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class CardDriver {
	
	public static void main(String[] args){

		int totalCards = 52;
		int randomNum = ThreadLocalRandom.current().nextInt(0, totalCards);
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess weather the card's value will be even or odd: ");
		
		String ans = sc.nextLine(); // alter to change guess;
		
		evenOrOddnew test = new evenOrOddnew();
		test.answer(randomNum, ans);
		
		sc.close();
	}
}
