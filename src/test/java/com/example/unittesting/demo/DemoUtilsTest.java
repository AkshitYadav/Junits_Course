package com.example.unittesting.demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;



@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
class DemoUtilsTest {

	
	DemoUtils demo;
	
	
	@BeforeEach
	public void setup() {
		
		demo = new DemoUtils();
		
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
	@Test
	public void equalsAndNotEquals()
	{
		assertEquals(6,demo.add(2, 4),"2+4 is 6");
		assertNotEquals(6,demo.add(1, 2),"1+2 is not 6");
	}
	
	@Test
	public void nullAndNotNull()
	{
		assertNull(demo.checkNull(null));
		assertNotNull(demo.checkNull("Akshit"));
	}
	
	@Test
	public void sameAndNotSame()
	{
		assertSame(demo.getAcademy(),demo.getAcademyDuplicate(),"Same Object");
		assertNotSame("Luv2Code",demo.getAcademy());
	}
	
	@Test
	public void trueOrFalse()
	{
		assertTrue(demo.isGreater(10, 5),"10 is greater than 5");
		assertFalse(demo.isGreater(1, 5),"1 is greater than 5");
	}
	
	@Test
	public void testArrayEquals()
	{
		String[] str = {"A","B","C"};
		assertArrayEquals(str, demo.getFirstThreeLettersOfAlphabet());
	}
	
	@Test
	public void testIterableEquals()
	{
		List<String> str = List.of("luv","2","code");
		assertIterableEquals(str, demo.getAcademyInList());
	}
	
	@Test
	public void testThrowsAndDoesNotThrows()
	{
		assertThrows(Exception.class,()->{demo.throwException(-9);},"Should throw exception");
		assertDoesNotThrow(()->{demo.throwException(9);},"Should not throw exception");
	}
	
	@Test
	public void testTimeout()
	{
		assertTimeoutPreemptively(Duration.ofSeconds(3),()->{demo.checkTimeout();});
	}
	
	
	
	
	
	
	
}
