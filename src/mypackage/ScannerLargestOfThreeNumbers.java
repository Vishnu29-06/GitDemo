package mypackage;

import java.util.Scanner;

public class ScannerLargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter Third number: ");
		int c = sc.nextInt();
		
		if(a>=c && a>=b) {
		
		System.out.println(a +"is the largest number");
		}
		
		else if(b>=c && b>=a) {
		
		System.out.println(b +"is the largest number");
		}
		
		else {

		System.out.println(c +"is the largest number");
		}
		
		sc.close();
		
		
		
		
		
		

	}

}
