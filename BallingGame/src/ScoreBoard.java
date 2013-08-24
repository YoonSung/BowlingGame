
public class ScoreBoard {
	
	public static ScoreBoard instance = new ScoreBoard();
	private ScoreBoard() {}
	
	public static ScoreBoard getInstance(){
		return instance;
	}
	
	public String boardPrint() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return null;
	}
}
