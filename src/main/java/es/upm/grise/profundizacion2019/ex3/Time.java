package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	LocalDateTime time;
	Time (LocalDateTime time){
		this.time=time;
	}
	
	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		time.plusSeconds(seconds);
		return formatter.format(time);	
	}

}
