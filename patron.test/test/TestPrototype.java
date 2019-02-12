package test;

import org.junit.Test;

import patron.creacionales.prototype.TV;
import patron.creacionales.prototype.TvProtoType;

public class TestPrototype {
	@Test
	public void testPrototype() throws Exception{
	TvProtoType tvp = new TvProtoType();
	TV tv = (TV) tvp.prototipo("plasma");
	
	System.out.println(tv.getPrecio());
	}
}
