package ProgrammingKnowledge;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class Myclassconcat {

	@Test
	public void concattest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
