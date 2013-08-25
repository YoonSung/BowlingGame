package com.rbgroup.point;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import com.rbgroup.point.Point.Type;
import com.rbgroup.score.Score;

public class SparePointTest {
	
	Point instance;
	
	@Before
	public void init() {
		instance = new SparePoint(4);
	}
	
	@Test
	public void getOrdinaryContent() {
		assertThat(instance.getDownPinNumber(), is(4));
		assertThat(instance.getLetter(), is('/'));
		assertThat(instance.getType(), is(Type.SPARE));
	}
	
	@Test
	public void getOneFramePoint() {
		Score score = new Score();
		score.addScore(new PlainNumberPoint(3));
		score.addScore(new SparePoint(7));
		assertThat(score.getScore(), is(3));
	}
}
