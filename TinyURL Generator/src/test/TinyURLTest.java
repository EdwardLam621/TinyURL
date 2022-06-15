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
		assertEquals(shortURL1, t.shortToLong("URL"));		//should pass
		assertNotEquals(shortURL2, t.shortToLong("URL"));	//should fail, because shortURL2 and return are not identical
		assertEquals(shortURL2, t.shortToLong("URL2"));		//should pass
	}
	
	@Test
	public void getTinyURL() {
		
		TinyURL t = new TinyURL();
		
		String shortURL1 = t.longToShort("URL");
		String shortURL2 = t.longToShort("URL2");
		assertEquals(shortURL1, t.shortToLong("URL"));		//should pass
		assertNotEquals(shortURL2, t.shortToLong("URL"));	//should fail, because shortURL2 and return are not identical
		assertEquals(shortURL2, t.shortToLong("URL2"));		//should pass
	}
	
}
