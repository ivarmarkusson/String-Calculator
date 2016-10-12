package is.ru.StringCalculator;

public class Calculator {
	
	public static int add(String input){
	
		if(input == ""){
			return 0;
		}
		
		int returnValue = Integer.parseInt(input);
		return returnValue;
	}		
}
