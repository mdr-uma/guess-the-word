package game;

import java.util.Random;

public class Words {
	private String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights", "ceremony", "independence",
									"beneath", "information", "students", "employee"};
	private String selectedWord;
	private Random random = new Random();
	private char[] letters;
	
	public Words() {
		selectedWord = randomWords[random.nextInt(randomWords.length)];
		letters = new char[selectedWord.length()];
	}
	
	public String toString() {
		StringBuilder text = new StringBuilder();
		return selectedWord;
	}
}
