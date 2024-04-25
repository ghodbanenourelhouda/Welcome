package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}
	
	@Test
	void test2() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
	}
}
