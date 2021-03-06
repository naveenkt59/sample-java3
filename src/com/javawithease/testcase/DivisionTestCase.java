package com.javawithease.testcase;

import com.javawithease.business.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This is test case class for division method.
 * @author javawithease
 */
public class DivisionTestCase {
	//DivisionTest class objects
	DivisionTest divisionTest1 = new DivisionTest(10, 2); 
	DivisionTest divisionTest2 = new DivisionTest(10, 0); 
	
	//Test case for division
	@Test
	public void test() {
		int ii=5;
		assertEquals(5, ii);
	}
	
	@Test
	public void test1(){
		assertEquals(5, divisionTest1.division());
	}
	
	//Test case for expected ArithmeticException, 
	//As in this case ArithmeticException
	// is the expected exception so JUnit 
	//will pass this unit test. 
	/** @Test(expected = ArithmeticException.class)  
	public void testException() {
		assertEquals(5, divisionTest2.division());
	} */
}
