package com.rbgroup.play;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import com.rbgroup.score.Score;


public class ScoreTest {

	Score score;
	
	@Before
	public void init() {
		score = new Score();
	}
	
	@Test(expected=ExceedRollingException.class)
	public void add() {
		score.addScore(4);
		score.addScore(12);
		score.addScore(1);
	}
	
	@Test
	public void getScoreSize() {
		score.addScore(4);
		assertThat(score.getScoreSize(), is(1));
		assertThat(score.isCapacityEqualsScoreNumber(), is(false));
		
		score.addScore(12);
		assertThat(score.getScoreSize(), is(2));
		assertThat(score.isCapacityEqualsScoreNumber(), is(true));
	}
}
