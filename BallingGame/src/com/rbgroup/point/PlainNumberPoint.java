package com.rbgroup.point;

public class PlainNumberPoint extends Point{

	public PlainNumberPoint(int shootNumber) {
		super(shootNumber);
	}

	@Override
	public int getScore() {
		return type.getPoint();
	}
}
