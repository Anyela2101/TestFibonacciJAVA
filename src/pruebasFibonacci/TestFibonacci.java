package pruebasFibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFibonacci {

	@Test
	void test() {
		int numero = program.serieFibonacci(0);
		assertEquals(0, numero);
	}
	
	@Test
	void test1() {
		int numero = program.serieFibonacci(1);
		assertEquals(1, numero);
	}
	
	@Test
	void test2() {
		int numero = program.serieFibonacci(2);
		assertEquals(1, numero);
	}
	
	@Test
	void test3() {
		int numero = program.serieFibonacci(3);
		assertEquals(1, numero);
	}
	

}
