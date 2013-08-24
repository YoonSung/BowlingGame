import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ScoreBoardTest {

	ScoreBoard scoreBoard;
	
	@Before
	public void init() {
		scoreBoard = ScoreBoard.getInstance();
	}
	
	@Test
	public void frameArray() {
		assertThat(scoreBoard.getFrame(0), is(new Frame(1)));
		assertThat(scoreBoard.getFrameSize(), is(10));
	}
	
	@Test
	public void print() {
		System.out.println(scoreBoard.screenPrint(10));
	}
}
