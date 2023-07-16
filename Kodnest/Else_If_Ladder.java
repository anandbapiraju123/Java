package Kodnest;
import java.util.*;
public class Else_If_Ladder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=scan.nextInt();
		if(marks<50) 
			System.out.println("D-Grade\nCongratulations");
		else if(marks>=50 && marks<60) 
			System.out.println("C-Grade\nCongratulations");
		else if(marks>=60 && marks<70) 
			System.out.println("B-Grade\nCongratulations");
		else if (marks>=70 && marks<80)
			System.out.println("A-Grade\nCongratulations");
		else
			System.out.println("A+-Grade\nCongratulations");
		scan.close();
	}

}
