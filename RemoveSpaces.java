package practice;

public class RemoveSpaces {
	public static void main(String[] args) {
		String s="anand bapi raju";
		String s1=s.replaceAll("\\s","");
		System.out.println(s1);
	}

}
