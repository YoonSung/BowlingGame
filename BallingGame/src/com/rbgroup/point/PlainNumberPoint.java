package com.rbgroup.point;

public class PlainNumberPoint extends Point{

	public PlainNumberPoint(int shootNumber) {
		super(shootNumber);
	}

	@Override
	public int getPoint() {
		Type type = getType();
		return type.getPoint();
	}

	@Override
	public void addPoint(int extraPoint) {}
}
