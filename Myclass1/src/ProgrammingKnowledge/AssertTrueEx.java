package ProgrammingKnowledge;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertTrueEx {

	@Test
	public void test() {
		MyJunitClass junit = new MyJunitClass();
		boolean result = junit.isPrime(12);
		assertTrue(result, "Not prime");
	}

}
