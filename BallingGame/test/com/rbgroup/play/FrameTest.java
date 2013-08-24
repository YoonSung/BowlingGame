package com.rbgroup.play;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import com.rbgroup.play.Game;

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
}
