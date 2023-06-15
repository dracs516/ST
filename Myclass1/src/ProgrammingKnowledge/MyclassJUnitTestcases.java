package ProgrammingKnowledge;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

public class MyclassJUnitTestcases {

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	}

}
