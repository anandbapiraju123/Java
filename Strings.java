package practice;
import java.util.*;
public class Strings {

	static boolean method(char ch[],char c1){
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c1) return true;
		
		}
			return false;
	
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		char c=s.nextLine().charAt(0);
		if(Strings.method(ch, c)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
