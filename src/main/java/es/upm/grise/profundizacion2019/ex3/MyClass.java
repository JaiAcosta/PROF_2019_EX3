package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	private Time time;
	
	public MyClass (Time time) {
		this.time=time;
	}
	//Cambio: Añadir return String
	public String nextTime(long seconds) {
		String next = time.getFutureTime(seconds);
		System.out.println(next);
		
		return next;
	}

}
