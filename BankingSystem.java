package practice;
import java.util.*;
class Bank{
	long Acc_No;
	String Acc_holder_Name,IFSC_Code;
	String User_Id="AnandBapiRaju123",Password="bapiraju123@";
	double Acc_Balance;
	  boolean login(String s,String p) {
		if(User_Id.equals(s)&&Password.equals(p)) {
			System.out.println("Congrats..Account Logged in");
			return true;
		}else {
		return false;
	}
	  }
	Bank(long a,String ah,String ic,double ab){
		Acc_No=a;
		Acc_holder_Name=ah;
		IFSC_Code=ic;
		Acc_Balance=ab;
	}
	double deposit(double x) {
		Acc_Balance+=x;
		return Acc_Balance;
	}
	double withDrawl(double y) {
		if(Acc_Balance<y) {
			return 0;
		}else {
		Acc_Balance-=y;
		return Acc_Balance;
	}
	}
	void details() {
		System.out.printf("Your Account Number = %d\n",Acc_No);
		System.out.printf("Your Name = %s\n",Acc_holder_Name);
		System.out.printf("Your ID = %s\n",User_Id);
		System.out.printf("Your Account balance= %.4f\n",Acc_No);
	}
	void LoanDetails(double salary) {
		double loan=30*salary;
		System.out.printf("You will get %f amount as loan for your %f salary\n",loan,salary);
	}
}
public class BankingSystem{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your user id and password");
		String user_id=scan.nextLine();
		String password=scan.nextLine();
		long acc_no=1234567890l;
		String acc_holdr_name="Anand Bapi Raju";
		String ifsc_code="PYTM0123456";
		double acc_balance=30000l;
		Bank b=new Bank(acc_no,acc_holdr_name,ifsc_code,acc_balance);
         if(b.login(user_id,password)==true) {
			System.out.println("enter the amount to deposit...");
			double x=scan.nextDouble();
			System.out.printf("The Amount after deposited %f is = %f\n",x,b.deposit(x));
			System.out.println("enter the amount to withdraw");
			double y=scan.nextDouble();
			if(b.withDrawl(y)==0) {
				System.out.println("Insufficient Balance");
			}else {
				System.out.printf("The Amount left after withdrawed %f is = %f",y,b.withDrawl(y));
			}
			System.out.println("Press 1 to Check your details..");
			int n=scan.nextInt();
			if(n==1) {
				b.details();
			}else {
				System.out.println("enter 1 to check your details");
			}
			System.out.println("To get loan press 2");
			int x1=scan.nextInt();
			if(x1==2) {
				System.out.println("enter your monthly salary..");
				double salary=scan.nextDouble();
				b.LoanDetails(salary);
			}
			
		}else {
			System.out.println("Error...!!enter wrong user_name or password\nenter again");
			
		}
	}

}
