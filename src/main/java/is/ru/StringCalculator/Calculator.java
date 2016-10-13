package is.ru.StringCalculator;

public class Calculator {
	
	
	public static int add(String input){
		
		String delimeter;

		if(input.startsWith("//")  && input.contains("\n")){
			delimeter = Character.toString(input.charAt(2));
			input = input.substring(4, input.length());
			input = input.replaceAll(delimeter, ",");
		}		


		if(input.contains("\n")){
			input = input.replaceAll("\n", ",");
		}

		if(input == ""){
			return 0;
		}
		else if(input.contains(",")){
			String[] numbers = input.split(",");
			numbers = checkNumbers(numbers);

			return sum(numbers);
		}
		else{
			if(toInt(input) < 0)
				throw new IllegalArgumentException("Negatives not allowed: " + input);
			else if(toInt(input) > 1000){
				return 0;
			}
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
	public static String[] checkNumbers(String[] numbers){
		String numbs = "";

		for(int i = 0; i < numbers.length; i++){
			if(toInt(numbers[i]) > 1000){
				numbers[i] = "0";
			}
			if(toInt(numbers[i]) < 0){
				numbs += numbers[i] + ",";
			}
		}
		
		if(numbs != ""){
			numbs = numbs.substring(0, (numbs.length()-1));
			throw new IllegalArgumentException("Negatives not allowed: " + numbs);
		}
		return numbers;
	}
}
