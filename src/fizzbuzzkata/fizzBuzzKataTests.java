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
} 