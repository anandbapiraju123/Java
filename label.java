package practice;
import java.util.*;
public class label {
	public static void main(String[] args) {
		//using label for outer for loop
		aa:
			for(int i=0;i<=10;i++) {
				bb:
					for(int j=0;j<=10;j++) {
						if(i+j<5) {
							continue aa;
						}else {
							System.out.println(i+" "+j);
						}
					}
			}
		
	}

}
