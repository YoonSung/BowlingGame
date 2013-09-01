package com.rbgroup.play;

public class PlayUtil {

	public static int getKnockDownPinRandomNumber(int remainPinNumber) {
		int downPinNumber = (int)(Math.random() * (remainPinNumber )) + 1;
		return downPinNumber;
	}
	
}
