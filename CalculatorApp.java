package Kodnest_Java_Programming;
import java.util.*;
public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Hello guys..lets develop a calculator app");
		boolean b=true;
		System.out.println("+ ========>Find Addition");
		System.out.println("- ========>Find Subtraction");
		System.out.println("* ========>Find Multiplication");
		System.out.println("/ ========>Find Division");
		System.out.println("% ========>Find Remainder");
		System.out.println("^ ========>Find Square");
		while(b) {
			System.out.println("Enter Your Choice");
			char ch=scan.next().charAt(0);
			switch(ch) {
			case '+':c.addition();
			break;
			case '-':c.subtraction();
			break;
			case '*':c.multiplication();
			break;
			case '/':c.division();
			break;
			case '%':c.remainder();
			break;
			case '^':c.square();
			default:System.out.println("Kallu kappalu mingaayaa mawa");
			}
			System.out.println("Do you want to perform another operation..enter 1 or 0");
			int select=scan.nextInt();//1 or 0 thats it
			if(select==0) {
				break;
			}
		}
		scan.close();
	}
}
