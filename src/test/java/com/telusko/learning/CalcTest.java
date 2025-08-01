package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
		int actual=c.divide(10,5);
		int expected=2;
		
		assertEquals(actual,expected);
	}
	
	@Test
	public void test1() {
		Calc c = new Calc();
		int actual=c.divide(6,3);
		int expected=2;
		
		assertEquals(actual,expected);
	}
	
	@Test
	public void test2() {
		Calc c = new Calc();
		int actual=c.divide(10,2);
		int expected=5;
		
		assertEquals(actual,expected);	
	}
	
	@Test
	public void test3() {
		Calc c = new Calc();
		int actual=c.divide(16,4);
		int expected=4;
		
		assertEquals(actual,expected);	
	}
	
	@Test
	public void test4() {
		Calc c = new Calc();
		int actual=c.divide(20,4);
		int expected=5;
		
		assertEquals(actual,expected);	
	}
}
