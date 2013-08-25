package com.rbgroup.score;

import java.util.ArrayList;
import java.util.List;

import com.rbgroup.play.ExceedRollingException;

public class Score {

	List<Integer> scores;
	int capacity = 2;
	
	public Score() {
		scores = new ArrayList<Integer>(capacity);
	}
	
	public void addScore(int shootNumber) throws ExceedRollingException {
		if (scores.size() >= capacity)
			throw new ExceedRollingException(shootNumber);
		scores.add(shootNumber);
	}

	public int getScore() {
		int currentScore = 0;
		
		for (Integer score : scores)
			currentScore += score;

		return currentScore;
	}

	public int getScoreSize() {
		return scores.size();
	}

	public boolean isCapacityEqualsScoreNumber() {
		return (capacity == scores.size());
	}
}
