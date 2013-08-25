package com.rbgroup.point;

public class SparePoint extends Point {

	boolean isSpareCalculated = false;
	private Type type;
	
	
	public SparePoint(int shootNumber) {
		super(shootNumber, Type.SPARE);
		type = getType();
		type.setPoint(shootNumber);
	}

	@Override
	public int getPoint() {
		if (isSpareCalculated)
			return type.getPoint();
		return 0;
	}
	
	@Override
	public void addPoint(int extraPoint){
		if (isSpareCalculated) {
			try {
				throw new Exception("Invalid Access to Caculated Point");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int sparePinNumber = type.getPoint();
		type.setPoint(sparePinNumber+extraPoint);
		isSpareCalculated = true;
	}
}
