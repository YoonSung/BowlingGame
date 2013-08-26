package com.rbgroup.play;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.rbgroup.point.PlainNumberPoint;
import com.rbgroup.point.SparePoint;
import com.rbgroup.point.StrikePoint;
import com.rbgroup.util.ExceedRollingException;

public class FrameTest {

	Frame firstFrame, secondFrame, thirdFrame; 
	
	@Before
	public void init() {
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
	
	@Test
	public void getSpareFramePoint() {
		firstFrame.roll(new PlainNumberPoint(3));
		assertThat(firstFrame.getScore(), is(3));
		
		firstFrame.roll(new SparePoint(7));
		assertThat(firstFrame.getScore(), is(3));
		
		secondFrame.roll(new PlainNumberPoint(8));
		assertThat(firstFrame.getScore(), is(18));
	}
	
	@Test
	public void getStrikeFramePoint() {
		
		firstFrame.roll(new StrikePoint());
		assertThat(firstFrame.getScore(), is(10));
		
		secondFrame.roll(new StrikePoint()); 
		assertThat(firstFrame.getScore(), is(10));
		
		thirdFrame.roll(new PlainNumberPoint(8));
		assertThat(firstFrame.getScore(), is(28));
		
		thirdFrame.roll(new SparePoint(2));
		assertThat(firstFrame.getScore(), is(28));
		assertThat(secondFrame.getScore(), is(20));
		
	}
}
