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
}
