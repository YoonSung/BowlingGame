package com.rbgroup.point;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class PointControllerTest {

	PointController pointController ;
	
	@Before
	public void init() {
		pointController = new PointController();
	}
	
	
	@Test
	public void getProperPointTestStrikeVersion() {
		String returnClassName = forTestMethod(10);
		
		assertThat(returnClassName , is("StrikePoint"));
	}
	
	@Test
	public void getProperPointTestPlainVersion() {
		String returnClassName = forTestMethod(1);
		assertThat(returnClassName , is("PlainNumberPoint"));
		
		String returnClassName2 = forTestMethod(5);
		assertThat(returnClassName2 , is("PlainNumberPoint"));
	}
	
	@Test
	public void getProperPointTestSpareVersion() {
		String returnClassName = forTestMethod(1);
		assertThat(returnClassName , is("PlainNumberPoint"));
		
		String returnClassName2 = forTestMethod(9);
		assertThat(returnClassName2 , is("SparePoint"));
	}
	
	public String forTestMethod(int generateNumber) {
		Point pointInstance = pointController.getProperPoint(generateNumber);
		Class<?> clazz = pointInstance.getClass();
		String returnPoinClassName = clazz.getSimpleName();
		
		return returnPoinClassName;
	}
}
