package Kodnest;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Arithmetic a1=new Arithmetic();
		System.out.println("enter two numbers to perform arithmetic operations..");
		int a=s.nextInt();
		int b=s.nextInt();
		a1.add(a, b);
		a1.Subtract(a, b);
		a1.Multiply(a, b);
		a1.division(a, b);
		a1.Remainder(a, b);
		s.close();
	}

}
