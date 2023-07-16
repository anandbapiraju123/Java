package Kodnest;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter + or - or * or / operator");
		char c=scan.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println("Addition Operator");
			break;
		case '-':
			System.out.println("Subtraction Operator");
			break;
		case '*':
			System.out.println("Multiplcation Operator");
			break;
		case '/':
			System.out.println("Division Operator");
			break;
		default:
			System.out.println("Idiot Look into message carefully");
			
		}
		
		
	}

}
