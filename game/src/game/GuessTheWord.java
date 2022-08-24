package game;

public class GuessTheWord {
	private boolean play = true;
	
	public void start() {
		do {
			showWord();
			getInput();
			checkInput();
		}while(play);
	}
	
	void showWord() {
		System.out.println("showWord");
	}
}
