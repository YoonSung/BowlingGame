package com.rbgroup.play;
import org.junit.Before;
import org.junit.Test;
import com.rbgroup.play.Game;

public class GameTest {

	Game game;
	
	@Before
	public void init() {
		game = new Game("윤성");
		game.AutoPlayStart();
	}
	
	@Test
	public void print() {
		game.showScoreBoard();
	}
	
	@Test
	public void pauseTest() {
		
	}
}
