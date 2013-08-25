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
	
	public void addPoint(int extraPoint) throws Exception{
		if (isSpareCalculated)
			throw new Exception("Invalid Access to Caculated Point");
		
		int sparePinNumber = type.getPoint();
		type.setPoint(sparePinNumber+extraPoint);
		isSpareCalculated = true;
	}
}
