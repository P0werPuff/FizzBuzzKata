package fizzbuzzkata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fizzBuzzKataTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void lengthCoincidence() {
		fizzBuzzKata fb = new fizzBuzzKata();
		assertEquals(100, fb.getNumbers().length);
	}
	
	@Test
	public void mupltiplesOfThree() {
		fizzBuzzKata fb = new fizzBuzzKata();
		assertEquals("fizz", fb.fizzbuzzkata(3));
		assertEquals("fizz", fb.fizzbuzzkata(27));
		assertEquals("fizz", fb.fizzbuzzkata(93));
	}
	
	@Test
	public void mupltiplesOfFive() {
		fizzBuzzKata fb = new fizzBuzzKata();
		assertEquals("buzz", fb.fizzbuzzkata(5));
		assertEquals("buzz", fb.fizzbuzzkata(25));
		assertEquals("buzz", fb.fizzbuzzkata(85));
	}
	
	@Test
	public void mupltiplesOfThreeAndFive() {
		fizzBuzzKata fb = new fizzBuzzKata();
		assertEquals("fizzbuzz", fb.fizzbuzzkata(30));
	}
} 
