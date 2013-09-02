package com.rbgroup.play;

public class Player {
	private String name;
	private Game game;
	private boolean isRollingTurn = false;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void playNewBowlingGame() {
		game = new Game(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollingTurn() {
		this.isRollingTurn = true;
	}
	
	public void playRoll() {
		game.playOneFrame();
	}
	
	public boolean isRollingTurn() {
		return isRollingTurn;
	}

	public boolean isPlayEnd() {
		return game.isGameEnd();
	}
}
