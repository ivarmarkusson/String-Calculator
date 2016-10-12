package is.ru.StringCalculator;

public class Calculator {
	
	public static int add(String input){
	
		if(input == ""){
			return 0;
		}
		else if(input.contains(",")){
			String[] numbers = input.split(",");
			return sum(numbers);
		}
		else{
			return toInt(input);
		}
	}

	public static int toInt(String number){
		return Integer.parseInt(number);
	}		
	public static int sum(String[] numbers){
		int sum = 0;
		for(String number : numbers)
			sum += toInt(number);
		return sum;
	}
}
