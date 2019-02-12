package test;

import org.junit.Test;

import patron.creacionales.SingletonEjemplo;

public class TestSingleton {
	@Test
	public void prueba() {
		SingletonEjemplo cindy = SingletonEjemplo.getSingletonInstance("Cindy Lopez");
    	SingletonEjemplo joel = SingletonEjemplo.getSingletonInstance("Joel Osorio");
        
        System.out.println(cindy.getNombre());
        System.out.println(joel.getNombre());  
	}

}
