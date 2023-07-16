package practice;
import java.util.*;
import java.lang.Math;
public class ArmstrongNumber {
	int n;
	double l;
    ArmstrongNumber(int n){
    	this.n=n;
    	l=this.length(n);
    }
    int length(int x) {
    	int c=0;
    	while(x>0) {
    		x/=10;
    		c++;
    	}
    	return c;
    }
    static boolean method(int x,double l) {
    	int t=x;
    	double s=0,n=0;
    	while(x>0) {
    		n=x%10;
    		s+=Math.pow(n, l);
    		x/=10;
    	}
    	if(t==s) {
    		return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
	    while(t--!=0) {
		int n=s.nextInt();
		ArmstrongNumber a=new ArmstrongNumber(n);
		if(method(n,a.l)) {
			System.out.printf("%d is an armstrong number\n",n);
		}else {
			System.out.printf("%d is not an armstrong number\n",n);
		}
		}
	}

}
