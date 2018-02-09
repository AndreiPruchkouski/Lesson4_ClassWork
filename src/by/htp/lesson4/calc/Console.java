package by.htp.lesson4.calc;

import java.util.Scanner;

public class Console {

	public int readIntNumber() {	
		
		System.out.println("Please input Integer value: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		return value;
	}

	public String readOperation() {
		
		System.out.println("Please enter the operation: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		String operation = sc.next();
		
		return operation;
	}

}
