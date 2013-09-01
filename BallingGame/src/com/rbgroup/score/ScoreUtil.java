package com.rbgroup.score;

import java.util.LinkedList;
import java.util.Queue;

import static com.rbgroup.point.Point.Type.*;
import static com.rbgroup.point.Point.Type;

import com.rbgroup.point.Point;


public class ScoreUtil {
	private static LinkedList<Point> linkedList = new LinkedList<Point>();
	
	private ScoreUtil() {
		linkedList.clear();
	};
	
	public static void AutoManagePoint(Point point) {
		linkedList.addLast(point);
		
		if (linkedList.size() > 1)
			managePoint();
	}

	private static void managePoint() {
		Point peekPoint = linkedList.peek();
		Type peekPointType = peekPoint.getType();
		
		int listSize = linkedList.size();

		if (peekPointType != SPARE && peekPointType !=STRIKE)
			linkedList.poll();
		
		if (peekPointType == SPARE && listSize > 1) 
			calculateSparePoint();
		
		if (peekPointType == STRIKE && listSize > 2) 
			calculateStrikePoint();
	}

	private static void calculateStrikePoint() {
		
		Point sourcePoint = linkedList.poll();
		
		Point targetPoint1 = linkedList.get(0);
		int targetValue1 = targetPoint1.getPoint();
		
		
		Point targetPoint2 = linkedList.get(1);
		int targetValue2 = targetPoint2.getPoint();
		
		if (targetPoint2.getType() == Type.SPARE) {
			sourcePoint.addPoint(10);
			return;
		}
			
		sourcePoint.addPoint(targetValue1);
		sourcePoint.addPoint(targetValue2);
		
		
//		System.out.println("sourcePoint : "+sourcePoint.getPoint());
//		System.out.println("targetValue1 : "+targetValue1);
//		System.out.println("targetValue2 : "+targetValue2);
	}


	private static void calculateSparePoint() {
		Point sourcePoint = linkedList.poll();
		Point targetPoint = linkedList.peek();
		int targetPointValue = targetPoint.getPoint();
		
		sourcePoint.addPoint(targetPointValue);
	}
}
