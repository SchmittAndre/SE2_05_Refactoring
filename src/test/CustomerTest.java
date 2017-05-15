package test;
import main2.*; 
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void testKMovie() {
		Movie m1 = new Movie("movie1" , 1);
		assertTrue(m1.getTitle() == "movie1");
		assertTrue(m1.getPriceCode() == Movie.NEW_RELEASE); 
	}
	
}
