package com.mavendevop;

import static org.junit.Assert.*;

import org.junit.Test;

public class Subtest {

	@Test
	public void test() {
		Add a=new Add();
		int rs2=a.sub(5, 3);
		assertEquals(2,rs2);
	}

}
