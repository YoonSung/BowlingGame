package com.rbgroup.point;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import com.rbgroup.point.Point.Type;

public class SparePointTest {
	
	Point instance;
	
	@Before
	public void init() {
		instance = new SparePoint(4);
	}
	
	@Test
	public void getOrdinaryContent() {
		assertThat(instance.getDownPinNumber(), is(4));
		assertThat(instance.getLetter(), is('/'));
		assertThat(instance.getType(), is(Type.SPARE));
	}
}
