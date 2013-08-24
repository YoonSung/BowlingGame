import java.awt.Frame;
import java.util.ArrayList;


public class ScoreBoard {
	
	public static ScoreBoard instance = new ScoreBoard();
	public static String NEW_LINE = System.getProperty("line.separator");
	ArrayList<Frame> frames = new ArrayList<Frame>(12);
	
	private ScoreBoard() {}
	
	public static ScoreBoard getInstance(){
		return instance;
	}
	
	public String boardPrint(){
		return null;
	}
	
	public String framePrint(int frameNumber) {
		StringBuilder sb = new StringBuilder();
		int firstShoot = 1;
		int secondShoot = 2;

		sb.append("*  ");
		sb.append(frameNumber);
		sb.append(" FRAME  *");
		sb.append(NEW_LINE);
		sb.append("*************");
		sb.append(NEW_LINE);
		
		sb.append("*           *");
		sb.append(NEW_LINE);
		sb.append("*   ");
		
		sb.append("2");
		sb.append("   ");
		sb.append("1");
		
		sb.append("   *");
		sb.append(NEW_LINE);
		sb.append("*           *");
		sb.append(NEW_LINE);
		
		sb.append("*************");
		sb.append(NEW_LINE);
		sb.append("*           *");
		sb.append(NEW_LINE);
		sb.append("*************");
		return sb.toString();
	}
}	
