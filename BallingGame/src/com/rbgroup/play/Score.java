package com.rbgroup.play;

import java.util.ArrayList;
import java.util.List;

public class Score {

	int frameNumber;
	List<Integer> scores;
	int capacity = 2;
	
	Score(int frameNumber) {
		this.frameNumber = frameNumber;
		scores = new ArrayList<Integer>(capacity);
	}
	
	int getFrameNumber() {
		return frameNumber;
	}

	void addScore(int shootNumber) throws ExceedRollingException {
		if (scores.size() >= capacity)
			throw new ExceedRollingException(shootNumber);
		scores.add(shootNumber);
	}

	int getScore() {
		int currentScore = 0;
		for (Integer score : scores) {
			currentScore += score;
		}
		return currentScore;
	}
}
