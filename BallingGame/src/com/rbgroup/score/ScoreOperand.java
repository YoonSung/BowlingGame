package com.rbgroup.score;

import com.rbgroup.point.Point;

public interface ScoreOperand {
	void addScore(Point shootPoint);
	int getScore();
	int getScoreSize();
	boolean isCapacityEqualsScoreNumber();
	String getPointString();
}
