package com.rbgroup.play;

import java.util.ArrayList;

public class Score {

	int frameNumber;
	ArrayList<Integer> scores;
	int capacity = 2;
	
	public Score(int frameNumber) {
		this.frameNumber = frameNumber;
		scores = new ArrayList<Integer>(capacity);
	}
	
	int getFrameNumber() {
		return frameNumber;
	}

	public void addScore(int shootNumber) throws ExceedRollingException {
		if (scores.size() >= capacity)
			throw new ExceedRollingException(shootNumber);
		scores.add(shootNumber);
	}

	public int getScore() {
		int currentScore = 0;
		for (Integer score : scores) {
			currentScore += score;
		}
		return currentScore;
	}
}
