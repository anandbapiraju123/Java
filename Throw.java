package practice;

public class Throw {

	public static void main(String[] args) {
		try {
			int age=10;
			if(age<18) throw new ArithmeticException("age is less than 18\n");
			
		}catch(Exception e) {
			System.out.println(e+" the exception is caught");
		}finally {
			System.out.println("enter the value greater than 18");
		}
	}

}
