package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

import pkg.TinyURL;

class TinyURLTest {
	
	@Test
	public void addTinyURL() {
		
		TinyURL t = new TinyURL();
		
		String shortURL1 = t.longToShort("URL");
		String shortURL2 = t.longToShort("URL2");
		assertEquals(shortURL1, t.shortToLong("URL"));
		assertEquals(shortURL2, t.shortToLong("URL"));
	}
	

}
