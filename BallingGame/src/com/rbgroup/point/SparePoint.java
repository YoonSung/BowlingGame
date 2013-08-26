package com.rbgroup.point;

public class SparePoint extends Point {

	private boolean isSpareCalculated = false;
	private int calculatedPoint;
	
	public SparePoint(int shootNumber) {
		super(shootNumber, Type.SPARE);
		calculatedPoint = shootNumber;
		Type.SPARE.setDefaultPoint(shootNumber);
	}

	@Override
	public int getPoint() {
		if (isSpareCalculated)
			return calculatedPoint;
		return 0;
	}
	
	@Override
	public void addPoint(int extraPoint){
		if (isCalculateComplete()) {
			try {
				throw new Exception("Invalid Access to Caculated Point");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		calculatedPoint += extraPoint;
		isSpareCalculated = true;
	}

	@Override
	public boolean isCalculateComplete() {
		return isSpareCalculated;
	}
}
