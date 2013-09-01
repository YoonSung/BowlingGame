package com.rbgroup.point;

public class BlankPoint extends Point {

	public BlankPoint() {
		super(0, Type.BLANK);
	}

	@Override
	public int getPoint() {
		return 0;
	}

	@Override
	public void addPoint(int extraPoint) {}

	@Override
	public boolean isCalculateComplete() {
		return true;
	}

}