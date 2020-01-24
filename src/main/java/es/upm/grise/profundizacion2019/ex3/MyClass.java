package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	//Cambio: Añadir return String
	public String nextTime(long seconds) {
		Time time=new Time();
		String next = time.getFutureTime(seconds);
		System.out.println(next);
		
		return next;
	}

}
