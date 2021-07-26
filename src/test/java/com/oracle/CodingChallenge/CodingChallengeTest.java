package com.oracle.CodingChallenge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CodingChallengeTest {
	private CodingChallenge test = new CodingChallenge();

	@Test
	void verifyInvalidEntry() {
		assertEquals("Enter digits only", test.nextHighestNumber("ded"));
	}
	
	@Test
	void verifyEmptyValue() {
		assertEquals("Enter digits only", test.nextHighestNumber(" "));
	}
	
	@Test
	void verifyGenericCase1() {
		assertEquals("12354", test.nextHighestNumber("12345"));
	}
	
	@Test
	void verifyGenericCase2() {
		assertEquals("22222220", test.nextHighestNumber("22222202"));
	}
	
	@Test
	void verifyGenericCase3() {
		assertEquals("10109", test.nextHighestNumber("10091"));
	}
	
	@Test
	void verifyEdgeScenario1() {
		assertEquals("010", test.nextHighestNumber("001"));
	}
	
	@Test
	void verifyEdgeScenario2() {
		assertEquals("110", test.nextHighestNumber("101"));
	}
	
	@Test
	void verifyEdgeScenario3() {
		assertEquals("123456798", test.nextHighestNumber("123456789"));
	}
	
	@Test
	void verifyEdgeScenario4() {
		assertEquals("123456791234567889", test.nextHighestNumber("123456789987654321"));
	}
	
	@Test
	void verifyEdgeScenario5() {
		assertEquals("512347789", test.nextHighestNumber("498775321"));
	}
	
	@Test
	void verifyNoResultCase1() {
		assertEquals("No result", test.nextHighestNumber("0"));
	}
	
	@Test
	void verifyNoResultCase2() {
		assertEquals("No result", test.nextHighestNumber("1"));
	}
	
	@Test
	void verifyNoResultCase3() {
		assertEquals("No result", test.nextHighestNumber("100"));
	}
	
	@Test
	void verifyNoResultCase4() {
		assertEquals("No result", test.nextHighestNumber("999999"));
	}
	
	@Test
	void verifyNoResultCase5() {
		assertEquals("No result", test.nextHighestNumber("21"));
	}
	
	@Test
	void verifyNoResultCase6() {
		assertEquals("No result", test.nextHighestNumber("110"));
	}
	
	@Test
	void verifyNoResultCase7() {
		assertEquals("No result", test.nextHighestNumber("111"));
	}
	
	@Test
	void verifyNoResultCase8() {
		assertEquals("No result", test.nextHighestNumber("654321"));
	}
}
