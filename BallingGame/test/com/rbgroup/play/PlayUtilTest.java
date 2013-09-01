package com.rbgroup.play;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayUtilTest {

	@Test
	public void generateRandomNumber() {
		int remainPinNumber = 10;
		
		int downPinNumber = PlayUtil.getKnockDownPinRandomNumber(remainPinNumber);
		for (int i = 0; i < 10000 ; i++) {
			assertTrue(isGenerateInRange(downPinNumber, remainPinNumber));
		}
	}

	private boolean isGenerateInRange(int downPinNumber , int remainPinNumber) {
		return (downPinNumber <= remainPinNumber);
	}
}
