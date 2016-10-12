package is.ru.StringCalculator;

import static org.junit.Asser.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
}