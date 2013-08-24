package com.rbgroup.play;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import com.rbgroup.play.Game;

public class FrameTest {

	Game screen;
	
	@Before
	public void init() {
		Game.getInstance();
	}
}
