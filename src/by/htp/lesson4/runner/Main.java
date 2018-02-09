package by.htp.lesson4.runner;

import by.htp.lesson4.calc.Calculator;
import by.htp.lesson4.calc.Console;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		Console cons = new Console();
		
		calc.greetUser();
		// Get input values from user
		int value1 = cons.readIntNumber();
		int value2 = cons.readIntNumber();
		String operation = cons.readOperation();
		int result = calc.performOperation(operation, value1, value2);
		
		//Print result
		System.out.println("Result = " + result);
			
	}

}