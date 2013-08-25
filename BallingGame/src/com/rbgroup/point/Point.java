package com.rbgroup.point;
import static com.rbgroup.point.Point.Type.*;

public abstract class Point {

	//enum class start
	enum Type{
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
		
		public char getLetter() {
			return letter;
		}
		
		
		public int getPoint() {
			return point;
		}
	}
	//enum class end
	
	Type type;
	int downPinNumber;
	
	public Point(int shootNumber) {
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
	
	int getDownPinNumber() {
		return downPinNumber;
	};
	
	char getLetter() {
		return type.getLetter();
	};
	
	public abstract int getScore();
}
