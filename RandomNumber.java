package practice;
import java.lang.*;
import java.util.*;
public class RandomNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt(),min=sc.nextInt();
		double d=Math.random()*(max-min+1)+min;
		System.out.println(d);
		int x=(int)(Math.random()*(max-min+1)+min);
		System.out.println(x);
		
	}

}
