package com.rbgroup.point;
import static com.rbgroup.point.Point.Type.*;

public abstract class Point {

	//enum class start
	protected enum Type{
		GUTTER	 ('-', 0),
		ONE 	 ('1', 1),
		TWO 	 ('2', 2),
		THREE	 ('3', 3),
		FOUR	 ('4', 4),
		FIVE	 ('5', 5),
		SIX	 	 ('6', 6),
		SEVEN	 ('7', 7),
		EIGHT	 ('8', 8),
		NINE	 ('9', 9),
		SPARE	 ('/', 0),
		STRIKE	 ('X', 0);
		
		
		private char letter;
		private int point;
		
		
		
		private Type(char letter, int point) {
			this.letter = letter;
			this.point = point;
		}
		
		protected char getLetter() {
			return letter;
		}
		
		
		protected int getPoint() {
			return point;
		}

		protected void setPoint(int shootNumber) {
			this.point = shootNumber;
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
			case  1:
				type = ONE;	
				break;
			case  2:
				type = TWO;
				break;
			case  3:
				type = THREE;
				break;
			case  4:
				type = FOUR;
				break;
			case  5:
				type = FIVE;
				break;
			case  6:
				type = SIX;
				break;
			case  7:
				type = SEVEN;
				break;
			case  8:
				type = EIGHT;
				break;
			case  9:
				type = NINE;
				break;
			case 10:
				type = STRIKE;
				break;
		}
	}
	
	protected int getDownPinNumber() {
		return downPinNumber;
	};
	
	protected char getLetter() {
		return type.getLetter();
	};
	
	protected Type getType() {
		return type;
	}
	
	public abstract int getPoint();
}
