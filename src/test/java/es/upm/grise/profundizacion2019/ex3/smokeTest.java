package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class smokeTest {
	MyClass my;
	
	@Before
	public void setUp() {
		my = new MyClass();
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS, new Time(LocalDateTime.now()));
	}
	
	@Test
	public void Add120Seconds() {
		long SECONDS = 120;
		System.out.println();
		assertEquals("2020/01/01 00:02:00", my.nextTime(SECONDS, new Time(LocalDateTime.of(2020, 01,01,00,00,00,00))));
	}
	
	@Test
	public void smokeTest() {
		Time time=mock(Time.class);
		
		
	}
}
