package com.rbgroup.point;

public class PointController {

	private int cumulativeKnockDownPin;
	private int defaultPinNumber = 10;
	
	public Point getProperPoint(int knockDownPinNumber) {
		
		cumulativeKnockDownPin += knockDownPinNumber;
		
		if (knockDownPinNumber == defaultPinNumber)
			return new StrikePoint();
		
		if (cumulativeKnockDownPin == defaultPinNumber) 
			return new SparePoint(knockDownPinNumber);
		
		return new PlainNumberPoint(knockDownPinNumber);
	}
}
