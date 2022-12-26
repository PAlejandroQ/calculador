package com.pipeline.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class CalculatorApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	private Calculador calculador = new Calculador();
	@Test
	public void testSum() {
		assertEquals(5, calculador.sum(2, 3));
	}
}
