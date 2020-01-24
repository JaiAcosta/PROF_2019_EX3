package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class smokeTest {
	private MyClass my;
	private Time time;
	
	@Mock
	private Time mock_time;
	
	@Before
	public void setUp() {
		
		MockitoAnnotations.initMocks(this);
		
		my = new MyClass(mock_time);
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}
	
	@Test
	public void Add120Seconds() {
		long SECONDS = 120;
		time=new Time(LocalDateTime.of(2020, 01,01,00,00,00,00));
		assertEquals("2020/01/01 00:02:00", time.getFutureTime(SECONDS));
	}
	
	@Test
	public void smokeTest() {
		my.nextTime((long)120);
		verify(mock_time, times(1)).getFutureTime((long)120);
		
		
	}
}
