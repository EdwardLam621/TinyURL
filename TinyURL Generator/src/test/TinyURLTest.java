package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pkg.TinyURL;

public class TinyURLTest {

	@Test
	public void addTinyURL() {
		
		TinyURL t = new TinyURL();
		
		String shortURL1 = t.longToShort("URL");
		String shortURL2 = t.longToShort("URL2");
		assertEquals(shortURL1, t.shortToLong("URL"));
		assertNotEquals(shortURL2, t.shortToLong("URL"));
	}
	
}
