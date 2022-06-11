package pruebasFibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFibonacci {

	@Test
	void test() {
		int numero = program.serieFibonacci(0);
		assertEquals(0, numero);
	}
	
	

}
