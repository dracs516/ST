package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertFalseEx {

	@Test
	public void test() {
		MyJunitClass junit = new MyJunitClass();
		boolean result = junit.isPalindrome("RACECAR");
		assertFalse(result, "Palindrome");
	}

}