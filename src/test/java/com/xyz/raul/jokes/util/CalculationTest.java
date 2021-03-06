package com.xyz.raul.jokes.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationTest {



	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testFindMax() {
		System.out.println("test case find max");
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(0, Calculation.findMax(new int[] { -12, -3, -4, -2 }));
	}

	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(27, Calculation.cube(3));	
	}

	@Test  
	    public void testReverseWord(){  
	        System.out.println("test case reverse word");  
	        assertEquals("ym eman si nahk ",Calculation.reverseWord("my name is khan"));  
	    }

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}
