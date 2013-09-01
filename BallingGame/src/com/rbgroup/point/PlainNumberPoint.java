package com.rbgroup.point;

public class PlainNumberPoint extends Point{

	private char letter;
	private int point;
	
	public PlainNumberPoint(int shootNumber) {
		super(shootNumber);
		
		this.point = shootNumber;
		this.letter = Integer.toString(shootNumber).charAt(0);
	}

	@Override
	public int getPoint() {
		return this.point;
	}

	@Override
	public char getLetter() {
		return this.letter;
	}
	
	@Override
	public void addPoint(int extraPoint) {}

	@Override
	public boolean isCalculateComplete() {
		return true;
	}
}
