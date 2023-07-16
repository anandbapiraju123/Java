package practice;

public class ExceptionExample {
	static int method() {
		int y=20;
		return y/0;
	}
	public static void main(String args[]) {
		try {
			int x=method();
		}catch(Exception e) {
			System.out.println(e+ " exception is caught");
		}
	}

}
