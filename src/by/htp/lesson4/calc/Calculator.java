package by.htp.lesson4.calc;

public class Calculator {

	public void greetUser() {
		System.out.println("Hello User!");
	}

	public int summ(int x, int y) {
		int result = x + y;
		return result;
	}

	public int subtract(int x, int y) {
		int result = x + y;
		return result;
	}

	public int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

	public int devide(int x, int y) {
		int result = x / y;
		return result;
	}

	public int increment(int x) {
		int result = x++;
		return result;
	}

	public int performOperation(String operation, int x, int y) {

		int result = 0;

		switch (operation) {
		case "+":
			result = summ(x, y);
			break;
		case "-":
			result = subtract(x, y);
			break;
		case "*":
			result = multiply(x, y);
			break;
		case "/":
			result = devide(x, y);
			break;
		default:
			System.out.println("It seems to me that smth went wrong, try another one time with valid operator.");
			break;
		}

		return result;
		
		//Version2 with FOR
		/*
		if(operation.equals("+")) {
			result = calc.summ(x, y);
			System.out.println("Result = " + result);
		}else if(operation.equals("-")) {
			result = calc.subtract(x, y);
			System.out.println("Result = " + result);
		}else if(operation.equals("*")) {
			result = calc.multiply(x, y);
			System.out.println("Result = " + result);
		}else if(operation.equals("/")) {
			result = calc.devide(x, y);
			System.out.println("Result = " + result);
		}
		*/
		
	}

}
