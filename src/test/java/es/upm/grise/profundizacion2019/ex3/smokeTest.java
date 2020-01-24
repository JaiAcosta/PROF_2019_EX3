package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	
	@Before
	public void setUp() {
		my = new MyClass();
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}
	
	@Test
	public void Add120Seconds() {
		long SECONDS = 120;
		assertEquals("2020/01/01 00:02:00", my.nextTime(SECONDS));
	}
}
