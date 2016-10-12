package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.StringCalculator.CalculatorTest");
	}


	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(5, Calculator.add("5"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(10, Calculator.add("5,5"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(40, Calculator.add("15,20,5"));
	}

	@Test
	public void testNewLine(){
		assertEquals(6, Calculator.add("1,2\n3"));
	}

	@Test
	public void testNegative(){
		assertEquals("Negatives not allowed: -1", Calculator.add("-1,2"));
	}
	
}
