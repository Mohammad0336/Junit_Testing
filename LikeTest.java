package Gameof21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LikeTest {

	@Test
	void test() { /* Testing the method to see if it returns correct 
		if the user guesses correctly based on the value of the card and if it is even */
		evenOrOddnew test = new evenOrOddnew();
		int a = 50;
		String ans = "Even";
		String res = test.answer(a, ans);
		assertSame("Correct", res);
	}

	@Test
	void test1() { /* Testing the method to see if it returns incorrect 
		if the user guesses incorrectly based on the value of the card and if it is even */
		evenOrOddnew test = new evenOrOddnew();
		int a = 0;
		String ans = "Odd";
		String res = test.answer(a, ans);
		assertSame("Incorrect", res);
	}
	
	@Test
	void test2() { /* Testing the method to see if it returns Invalid Entry 
		if the user does not input a valid input user valid input = "Even||Odd" not case sensitive */
		evenOrOddnew test = new evenOrOddnew();
		int a = 1;
		String ans = "anyinput";
		String res = test.answer(a, ans);
		assertSame("Invalid Entry", res);
	}
	
	@Test // Testing whether the method will return what is expected of the rank  
	public void test3() {
		DeckBuilder test = new DeckBuilder();
		String res = test.cardRank(0);
		assertEquals("2", res);
	} 
	// 0: "2", 1: "3", 2: "4", 3: "5", 4: "6", 5: "7", 6: "8",
	// 7: "9", 8: "10", 9: "Jack", 10: "Queen", 11: "King", 12: "Ace";

	@Test // Testing whether the method will return what is expected of the suit
	public void test4() {
		DeckBuilder test = new DeckBuilder();
		String res = test.cardSuit(0);
		assertEquals("Hearts", res);
	} 
	// 0: "Hearts", 1: "Spades", 2: "Clubs", 3: "Diamonds";
	
	@Test // Testing whether the method will return a value so it is not NULL
	
	public void test5() {
		DeckBuilder test = new DeckBuilder();
		String res = test.cardSuit(0);
		assertNotNull(res);
	}
	
@Test // Testing whether the method will return a value so it is not NULL
	
	public void test6() {
		DeckBuilder test = new DeckBuilder();
		String res = test.cardSuit(0);
		assertNotSame("Clubs", res);
	}
	

@Test
void test7() { /* Testing the method to see if it returns correct 
	if the user guesses correctly based on the value of the card and if it is odd */
	evenOrOddnew test = new evenOrOddnew();
	int a = 51;
	String ans = "odd";
	String res = test.answer(a, ans);
	assertSame("Correct", res);
}

}
