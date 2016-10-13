package is.ru.StringCalculator;

public class Calculator {
	
	public static int add(String input){
	
		if(input.contains("\n")){
			input = input.replaceAll("\n", ",");
		}

		if(input == ""){
			return 0;
		}
		else if(input.contains(",")){
			String[] numbers = input.split(",");
			checkNegative(numbers);

			return sum(numbers);
		}
		else{
			if(toInt(input) < 0)
				throw new IllegalArgumentException("Negatives not allowed: " + input);

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
	public static void checkNegative(String[] numbers){
		String numbs = "";

		for(String number : numbers){
			if(toInt(number) < 0){
				numbs += number + ",";
			}
		}
		
		if(numbs != ""){
			numbs = numbs.substring(0, (numbs.length()-1));
			throw new IllegalArgumentException("Negatives not allowed: " + numbs);
		}
	}
}
