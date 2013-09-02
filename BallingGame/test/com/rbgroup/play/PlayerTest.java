package com.rbgroup.play;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void MultiPlay() {
		Player player = new Player("윤성1");
		player.playNewBowlingGame();
		
		while (player.isPlayEnd() == false)
			player.playRoll();
	}

}
