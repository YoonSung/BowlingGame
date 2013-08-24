package com.rbgroup.play;

import java.util.ArrayList;

public class Score {

	int frameNumber;
	ArrayList<Integer> score;
	public Score(int frameNumber) {
		this.frameNumber = frameNumber;
		score = new ArrayList<Integer>(2);
	}
	
	int getFrameNumber() {
		return frameNumber;
	}

	public void addScore(int shootNumber) {
		score.add(shootNumber);
	}
}
