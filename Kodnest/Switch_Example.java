package Kodnest;
import java.util.*;
public class Switch_Example{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers from 1 to 7");
		int n=scan.nextInt();
		switch(n) {
		case 1:
			System.out.println("Super Sunday");
			break;
		case 2:
			System.out.println("Namassivaya Monday");
			break;
		case 3:
			System.out.println("Hanuman Tuesday");
			break;
		case 4:
			System.out.println("Ayyappa Wednesday");
			break;
		case 5:
			System.out.println("SaiBaba Thursday");
			break;
		case 6:
			System.out.println("Kali Matha Friday");
			break;
		case 7:
			System.out.println("Tirumala Saturday");
			break;
		default:
			System.out.println("Govindaa....Govindaa..its gone i say!!");
		}
		scan.close();
	}

}
