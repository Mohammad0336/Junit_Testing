package Gameof21;

public class evenOrOddnew extends DeckBuilder {
	
	public String answer(int x, String ans) {
	
		deck(x);
	
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
}
