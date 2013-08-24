import static org.junit.Assert.*;

import java.awt.Frame;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest {

	ScoreBoard scoreBoard;
	
	@Before
	public void init() {
		scoreBoard = ScoreBoard.getInstance();
	}
	
	@Test
	public void print() {
		
		String screen = scoreBoard.boardPrint();
		System.out.println();
	}
}
