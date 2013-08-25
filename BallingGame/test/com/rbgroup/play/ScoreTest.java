package com.rbgroup.play;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import com.rbgroup.point.PlainNumberPoint;
import com.rbgroup.score.Score;
import com.rbgroup.util.ExceedRollingException;


public class ScoreTest {

	Score score;
	
	@Before
	public void init() {
		score = new Score();
	}
	
	@Test(expected=ExceedRollingException.class)
	public void add() {
		score.addScore(new PlainNumberPoint(4));
		score.addScore(new PlainNumberPoint(12));
		score.addScore(new PlainNumberPoint(1));
	}
	
	@Test
	public void getScoreSize() {
		score.addScore(new PlainNumberPoint(4));
		assertThat(score.getScoreSize(), is(1));
		assertThat(score.isCapacityEqualsScoreNumber(), is(false));
		
		score.addScore(new PlainNumberPoint(12));
		assertThat(score.getScoreSize(), is(2));
		assertThat(score.isCapacityEqualsScoreNumber(), is(true));
	}
}
