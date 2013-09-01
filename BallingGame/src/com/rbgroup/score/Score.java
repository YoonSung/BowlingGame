package com.rbgroup.score;

import java.util.ArrayList;
import java.util.List;
import com.rbgroup.point.BlankPoint;
import com.rbgroup.point.Point;
import com.rbgroup.point.Point.Type;
import com.rbgroup.util.ExceedRollingException;

public class Score {

	protected List<Point> scores;
	protected int capacity = 2;
	
	public Score() {
		scores = new ArrayList<Point>(capacity);
	}
	
	public void addScore(Point shootPoint) throws ExceedRollingException {
		if (scores.size() >= capacity)
			throw new ExceedRollingException(capacity);
		
		ScoreUtil.AutoManagePoint(shootPoint);
		scores.add(shootPoint);
		
		if (shootPoint.getType() == Type.STRIKE)
			scores.add(new BlankPoint());
	}

	public int getScore() {
		int currentScore = 0;
		
		for (Point point : scores)
			currentScore += point.getPoint();

		return currentScore;
	}

	public int getScoreSize() {
		return scores.size();
	}

	public boolean isCapacityEqualsScoreNumber() {
		return (capacity == scores.size());
	}

	public String getPointString() {
		StringBuilder sb = new StringBuilder();
		for (Point point : scores)
			sb.append(point.getLetter());
		return sb.toString();
	}
}
