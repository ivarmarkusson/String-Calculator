package is.ru.StringCalculator;

public class Calculator {
	
	public static int add(String input){
	
		if(input == ""){
			return 0;
		}
		else if(input.contains(",")){
			String[] numbers = input.split(",");
			return (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
		}
		else{
			int returnValue = Integer.parseInt(input);
			return returnValue;
		}
	}		
}
