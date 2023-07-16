package practice;
class Program{
	public static void main(String args[]) {
		String str="kodnest";
		String trim=str.trim();
		char ch[]=trim.toCharArray();
		for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]);
		}
	}
}