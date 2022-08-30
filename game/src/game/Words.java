package game;

import java.util.Random;

public class Words {
	private String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights", "ceremony", "independence",
									"beneath", "information", "students", "employee"};
	private String selectedWord;
	private Random random = new Random();
	
	public Words() {
		selectedWord = randomWords[random.nextInt(randomWords.length)];
	}
	
	public String toString() {
		return selectedWord;
	}
}
