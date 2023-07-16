package Kodnest_Java_Programming;
import java.util.*;
import java.math.*;
public class Calculator {
	Scanner s=new Scanner(System.in);
	static int a,b;
	void userInput() {
		System.out.println("enter two values to perform operations");
		a=s.nextInt();
		b=s.nextInt();
	}
	void addition() {
		this.userInput();
		System.out.printf("%d+%d=%d\n",a,b,(a+b));
	}
	void subtraction(){
		this.userInput();
		System.out.printf("%d-%d=%d\n",a,b,(a-b));
	}
	void multiplication(){
		this.userInput();
		System.out.printf("%d*%d=%d\n",a,b,(a*b));
	}
	void division(){
		this.userInput();
		System.out.printf("%d/%d=%d\n",a,b,(a/b));
	}
	void remainder(){
		this.userInput();
		System.out.printf("%d % %d=%d\n",a,b,(a%b));
	}
	void square(){
		this.userInput();
		System.out.printf("%d^2=%d\n",a,(Math.pow((double)a, 2)));
	}	

}
