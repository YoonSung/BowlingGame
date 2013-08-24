import java.util.ArrayList;


public class ScoreBoard {
	
	private static ScoreBoard instance = new ScoreBoard();
	public static String NEW_LINE = System.getProperty("line.separator");
	
	private ArrayList<Frame> frames = new ArrayList<Frame>(12);
	
	public ScoreBoard() {
		initialize();
	}
	
	public Frame getFrame(int frameNumber) {
		return frames.get(frameNumber);
	}
	
	public int getFrameSize() {
		return frames.size();
	}
	
	private void initialize() {
		frames.add(new Frame(1));
		frames.add(new Frame(2));
		frames.add(new Frame(3));
		frames.add(new Frame(4));
		frames.add(new Frame(5));
		frames.add(new Frame(6));
		frames.add(new Frame(7));
		frames.add(new Frame(8));
		frames.add(new Frame(9));
		frames.add(new Frame(10));
	}

	public static ScoreBoard getInstance(){
		return instance;
	}
	
	public String screenPrint(int currentFrameNumber){
		return frameScreen(currentFrameNumber);
	}
	
	public String frameScreen(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();


		sb.append(frameNumberPrint(currentFrameNumber));
		sb.append(frameScorePrint(currentFrameNumber));
		sb.append(frameAccumulatedScorePrint(currentFrameNumber));
	
		return sb.toString();
	}

	private String frameAccumulatedScorePrint(int currentFrameNumber) {
		int accumulatedScore = 300;
		int scoreLength = Integer.toString(accumulatedScore).length();
		
		StringBuilder sb = new StringBuilder();
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*           ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*");
			
			for (int vacumSpace = 0 ; vacumSpace < 11 - scoreLength ; vacumSpace ++) {
				sb.append(" ");
			}
			
			sb.append(accumulatedScore);
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("************");
		}
		sb.append("*"+NEW_LINE);
		
		
		return sb.toString();
	}

	private String frameScorePrint(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();
		
		int firstShoot = 1;
		int secondShoot = 2;
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*           ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*   ");
			sb.append(firstShoot);
			sb.append("   ");
			sb.append(secondShoot);
			sb.append("   ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*           ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("************");
		}
		
		sb.append("*"+NEW_LINE);
		
		
		return sb.toString();
	}

	private String frameNumberPrint(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("* ");
			
			if (frameNumber < 10) {
				sb.append(" ");
			}
			
			sb.append(frameNumber);
			sb.append(" FRAME  ");
		}
		
		
		sb.append("*"+NEW_LINE);
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("************");
		}
		sb.append("*"+NEW_LINE);
		
		return sb.toString();
	}
}	
