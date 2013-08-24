package com.rbgroup.play;

import java.util.ArrayList;
import java.util.List;

public class Score {

	List<Integer> scores;
	int capacity = 2;
	
	Score() {
		scores = new ArrayList<Integer>(capacity);
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
