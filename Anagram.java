package practice;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=new String(scan.next());
		String s2=new String(scan.next());
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("anagrams");
		}else {
			System.out.println("not anagrams");
		}
	}

}
