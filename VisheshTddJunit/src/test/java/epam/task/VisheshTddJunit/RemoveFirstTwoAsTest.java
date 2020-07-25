package epam.task.VisheshTddJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class RemoveFirstTwoAsTest {
	/*
 * 1. 1st char A : ABCD => BCD - success
 * 2. 1st 2chars A : AACD => CD - success
 * 3. 2nd char A : BACD => BCD - success
 * 4. no 1st A's : BBAA => BBAA - success
 * 5. 1st last A's : AABAA => BAA - success
 */

RemoveFirstTwoAChars removefirsttwoachars;

@BeforeEach
void setUp() {
	removefirsttwoachars=new RemoveFirstTwoAChars();
}

@Test
void test1stChar() {
	assertEquals("BCD",removefirsttwoachars.remove("ABCD"));
}

@Test
void test1st2Chars() {
	assertEquals("CD",removefirsttwoachars.remove("AACD"));
}

@Test
void test2ndChar() {
	assertEquals("BCD",removefirsttwoachars.remove("BACD"));
}

@Test
void testNo1st2AChars() {
	assertEquals("BBAA",removefirsttwoachars.remove("BBAA"));
}

@Test
void testChars() {
	assertEquals("BAA",removefirsttwoachars.remove("AABAA"));
}

}