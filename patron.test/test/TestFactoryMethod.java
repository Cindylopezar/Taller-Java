package test;

import org.junit.Test;

import patron.creacionales.factorymethod.Triangulo;
import patron.creacionales.factorymethod.TrianguloFactory;
import patron.creacionales.factorymethod.TrianguloFactoryMethod;

public class TestFactoryMethod {

	@Test
	public void testFactoryMethod() {
		TrianguloFactoryMethod factory = new TrianguloFactory();
		Triangulo triangulo = factory.createTriangulo(10, 10, 10);
		System.out.println(triangulo.getDescription());
	}
}
