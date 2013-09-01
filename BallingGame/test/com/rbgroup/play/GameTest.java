package com.rbgroup.play;
import org.junit.Before;
import org.junit.Test;

import com.rbgroup.play.Frame;
import com.rbgroup.play.Game;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GameTest {

	Game game;
	
	@Before
	public void init() {
		game = new Game();
		game.AutoPlayStart();
	}
	
	@Test
	public void frameArray() {
		assertThat(game.getFrame(0), is(new Frame(1)));
	}
	
	@Test
	public void print() {
		game.screenPrint();
	}
}
