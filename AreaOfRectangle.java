package Kodnest_Java_Programming;
import java.util.*;
public class AreaOfRectangle {
	float getArea(float l,float b) {
		return l*b;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		AreaOfRectangle ar=new AreaOfRectangle();
		float length,breadth;
		System.out.println("enter length and breadth of the rectangle");
		length=s.nextFloat();
		breadth=s.nextFloat();
		System.out.println("area of rectangle= "+ar.getArea(length, breadth));
		s.close();
	}

}
/***1.write a java program to calculate the perimeter of a rectangle and print the result.The required input
to perform this operation has to be read from the user***/
/***2.write a java program to create a student object with the fields as age and name.Read input for student
fields***/