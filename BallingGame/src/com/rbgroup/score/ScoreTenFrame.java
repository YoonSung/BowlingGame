package com.rbgroup.score;

import com.rbgroup.point.Point;
import com.rbgroup.point.Point.Type;
import com.rbgroup.util.ExceedRollingException;

public class ScoreTenFrame extends Score{
	
	public ScoreTenFrame() {
		super();
	}
	
	@Override
	public void addScore(Point shootPoint) throws ExceedRollingException {
		if (scores.size() >= capacity)
			throw new ExceedRollingException(capacity);
		
		ScoreUtil.AutoManagePoint(shootPoint);
		scores.add(shootPoint);
		
		if (shootPoint.getType() == Type.STRIKE || shootPoint.getType() == Type.SPARE)
			this.capacity = 3;
	}

	@Override
	public String getPointString() {
		return super.getPointString();
	}

	@Override
	public int getScore() {
		return super.getScore();
	}

	@Override
	public int getScoreSize() {
		return super.getScoreSize();
	}

	
	@Override
	public boolean isCapacityEqualsScoreNumber() {
		return super.isCapacityEqualsScoreNumber(); 
	}
}
