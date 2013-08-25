package com.rbgroup.play;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.rbgroup.point.PlainNumberPoint;
import com.rbgroup.util.ExceedRollingException;

public class FrameTest {

	Game screen;
	Frame firstFrame, secondFrame, thirdFrame; 
	
	@Before
	public void init() {
		Game.getInstance();
		firstFrame = new Frame(1);
		secondFrame = new Frame(2);
		thirdFrame = new Frame(3);
	}
	
	@Test
	public void create() {
		assertThat(firstFrame.getFrameNumber(), is(1));
		assertThat(secondFrame.getFrameNumber(), is(2));
		assertThat(thirdFrame.getFrameNumber(), is(3));
	}
	
	@Test(expected=ExceedRollingException.class)
	public void roll() {
		firstFrame.roll(new PlainNumberPoint(3));
		firstFrame.roll(new PlainNumberPoint(4));
		firstFrame.roll(new PlainNumberPoint(5));
	}
	
	@Test
	public void getScore() {
		firstFrame.roll(new PlainNumberPoint(3));
		assertThat(firstFrame.getScore(), is(3));
		
		firstFrame.roll(new PlainNumberPoint(4));
		assertThat(firstFrame.getScore(), is(7));
	}
	
	@Test
	public void isEnd() {
		firstFrame.roll(new PlainNumberPoint(3));
		assertFalse(firstFrame.isFrameEnd());
		
		firstFrame.roll(new PlainNumberPoint(4));
		assertTrue(firstFrame.isFrameEnd());
	}
}
