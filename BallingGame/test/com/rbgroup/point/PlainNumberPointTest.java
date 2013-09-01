package com.rbgroup.point;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class PlainNumberPointTest {

	Point instance;
	
	@Before
	public void init() {
		instance = new PlainNumberPoint(3);
	}
	
	@Test
	public void getOrdinaryContent() {
		assertThat(instance.getLetter(), is('3'));
		assertThat(instance.getDownPinNumber(), is(3));
	}
}
