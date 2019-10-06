package com.mavendevop;

import static org.junit.Assert.*;

import org.junit.Test;
public class AddTest {

	@Test
	public void test() {
		Add a=new Add();
		int rs=a.addf(2,4);
		assertEquals(6,rs);

	}
}
