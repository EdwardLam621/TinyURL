package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pkg.TinyURL;

public class TinyURLTest {

	@Test
	public void longToShortTest() {
		
		TinyURL t = new TinyURL();
		
		String shortURL1 = t.longToShort("URL");
		assertEquals(shortURL1, t.shortToLong("URL"));		//should pass
		
		String shortURL2 = t.longToShort("URL2");
		assertNotEquals(shortURL2, t.shortToLong("URL"));	//should fail, because shortURL2 and return are not identical
		assertEquals(shortURL2, t.shortToLong("URL2"));		//should pass
		
	}
	
	@Test
	public void shortToLongTest() {
		
		TinyURL t = new TinyURL();
		
		String shortURL1 = t.longToShort("URL");
		assertEquals(shortURL1, t.shortToLong("URL"));			//should pass
		assertEquals("Error Message!", t.shortToLong("URL2"));	//should fail because URL2 was not recorded
		

	}
	
	@Test
	public void createCustomURLTest() {
		
		TinyURL t = new TinyURL();
		
	}
	
}
