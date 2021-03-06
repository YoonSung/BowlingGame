package com.rbgroup.play;

import com.rbgroup.point.Point;
import com.rbgroup.score.Score;
import com.rbgroup.score.ScoreOperand;
import com.rbgroup.score.ScoreTenFrame;

public class Frame {
	
	int frameNumber;
	ScoreOperand score;
	
	
	Frame(int frameNumber) {
		this.frameNumber = frameNumber;
		score = new Score();
		
		if (frameNumber == 10)
			score = new ScoreTenFrame();
	}

	public int getFrameNumber() {
		return frameNumber;
	}
	
	void roll(Point shootNumber) {
		score.addScore(shootNumber);
	}
	
	int getRollingIndex() {
		return (score.getScoreSize());
	}
	
	boolean isFrameEnd() {
		return score.isCapacityEqualsScoreNumber();
	}
	
	public int getScore() {
		return score.getScore();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + frameNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frame other = (Frame) obj;
		if (frameNumber != other.frameNumber)
			return false;
		return true;
	}

	public String getFramePointString() {
		return score.getPointString();
	}
}
