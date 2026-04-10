package mypackage;

import java.util.Scanner;

public class ScannerMultiplyNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		
		int multiply = num1*num2;
		
		System.out.println("The multiplication is : "+multiply);
		
		sc.close();
		
		
		
	}

}
