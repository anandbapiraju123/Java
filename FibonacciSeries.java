package practice;
import java.util.*;
public class FibonacciSeries {
	void fib(int a,int b,int n) {
		int t;
		for(int i=0;i<n-2;i++) {
			t=a+b;
			System.out.print(t+" ");
			a=b;
			b=t;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fs=new FibonacciSeries();
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many numbers you want to print in fibonacci series");
		int n=s.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		fs.fib(a,b,n);
		
	}

}
