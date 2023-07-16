package practice;
import java.io.*;
import java.util.*;
public class Prime {
      public static boolean isPrime(int x) {
    	  if(x==2) {
    		  return true;
    	  }else if(x<2) {
    		  return false;
    	  }else {
    		  for(int i=2;i<x;i++) {
    			  if(x%i==0) {
    				  return false;
    			  }
    		  }
    	  }
    	  return true;
      }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		if(isPrime(x)) {
			System.out.printf("%d is a prime number",x);
		}else {
			System.out.printf("%d is not a prime number",x);
		}
		// TODO Auto-generated method stub
         scan.close();
	}

}
