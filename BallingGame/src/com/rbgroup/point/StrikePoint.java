package com.rbgroup.point;

public class StrikePoint extends Point {

	private boolean isFirstPointCalculated = false;
	private boolean isSecondPointCalculated = false;
	public static final int tenPoint = 10;
	private int calculatedPoint;
	
	public StrikePoint() {
		super(tenPoint, Type.STRIKE);
		 calculatedPoint = tenPoint;
	}

	@Override
	public int getPoint() {
		return calculatedPoint;
	}

	@Override
	public void addPoint(int extraPoint) {
		if (isCalculateComplete()) {
			try {
				throw new Exception("Invalid Access to Caculated Point");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if ( isFirstPointCalculated == false && isSecondPointCalculated == true) {
			try {
				throw new Exception("UnExpected Strike addPoint Error Occur");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		calculatedPoint += extraPoint;
		
		if ( isFirstPointCalculated == false ) {
			isFirstPointCalculated = true;
		} else {
			isSecondPointCalculated = true;
		}
		
	}

	@Override
	public boolean isCalculateComplete() {
		return (isFirstPointCalculated == true && isSecondPointCalculated == true);
	}

}
