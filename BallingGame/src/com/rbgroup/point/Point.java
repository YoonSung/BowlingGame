package com.rbgroup.point;
import static com.rbgroup.point.Point.Type.*;

public abstract class Point {

	//enum class start
	public enum Type{
		GUTTER	 ('-', 0),
		PLAIN 		 (' ',0),
		SPARE		 ('/', 0),
		STRIKE	 ('X', 10), 
		BLANK 	 (' ', 0);
		
		
		private char letter;
		private int point;
		
		
		
		private Type(char letter, int point) {
			this.letter = letter;
			this.point = point;
		}
		
		protected char getLetter() {
			return letter;
		}
		
		protected void setDefaultPoint(int point) {
			this.point = point;
		}
		
		protected int getDefaultPoint() {
			return point;
		}
	}
	//enum class end
	
	private Type type;
	private int downPinNumber;
	
	protected Point(int shootNumber, Type type) {
		downPinNumber = shootNumber;
		this.type = type;
	}
	
	protected Point(int shootNumber) {
		downPinNumber = shootNumber;
		
		switch (shootNumber) {
			case  0:
				type = GUTTER;
				break;
			case 10:
				type = STRIKE;
				break;
			default:
				type = PLAIN;
				break;
		}
	}
	
	protected int getDownPinNumber() {
		return downPinNumber;
	};
	
	public char getLetter() {
		return type.getLetter();
	};
	
	public Type getType() {
		return type;
	}
	
	public abstract int getPoint();
	public abstract void addPoint(int extraPoint);
	public abstract boolean isCalculateComplete();
}
