package com.rbgroup.score;

import java.util.LinkedList;
import java.util.Queue;

import static com.rbgroup.point.Point.Type.*;
import static com.rbgroup.point.Point.Type;

import com.rbgroup.point.Point;


public class ScoreUtil {
	private static Queue<Point> queue = new LinkedList<Point>();
	private ScoreUtil(){};
	
	
	public static void AutoManagePoint(Point point) {
		queue.add(point);
		
		if (queue.size() > 1)
			managePoint();
	}

	private static void managePoint() {
		
		Point peekPoint = queue.peek();
		Type peekPointType = peekPoint.getType();
		int queueSize = queue.size();
		
		
		if (peekPointType == SPARE && queueSize > 1) {
			calculateSparePoint();
			return;
		}
		
		if (peekPointType == STRIKE && queueSize > 2) {
			calculateStrikePoint();
			return;
		}
		
		queue.poll();
	}

	private static void calculateStrikePoint() {
		
	}


	private static void calculateSparePoint() {
		Point peekPoint = queue.poll();
		Point targetPoint = queue.poll();
		int targetPointValue = targetPoint.getPoint();
		
		peekPoint.addPoint(targetPointValue);
	}
}
