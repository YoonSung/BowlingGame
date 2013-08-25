package com.rbgroup.point;

public class SparePoint extends Point {

	public SparePoint(int shootNumber) {
		super(shootNumber, Type.SPARE);
		Type type = getType();
		type.setPoint(shootNumber);
	}

	@Override
	public int getPoint() {
		// TODO Auto-generated method stub
		return 0;
	}
}
