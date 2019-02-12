package test;

import org.junit.Test;

import patron.creacionales.builder.Cocina;
import patron.creacionales.builder.HawaiPizzaBuilder;
import patron.creacionales.builder.PicantePizzaBuilder;
import patron.creacionales.builder.Pizza;
import patron.creacionales.builder.PizzaBuilder;

public class BuilderTest {
@Test
 public void ejemploBuilder() {
	 Cocina cocina = new Cocina();
	 PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
	 PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();

	 cocina.setPizzaBuilder( hawai_pizzabuilder );
	 cocina.construirPizza();

	 Pizza pizza = cocina.getPizza();
	 }
 }

