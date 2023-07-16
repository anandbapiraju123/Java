package Kodnest;

public class TeacherApp extends Teacher
{

	public static void main(String[] args)
	{
		System.out.println(age);
		Teacher t1=new Teacher();
		t1.id=100;
		t1.name="anand";
		t1.subject="physics";
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
		System.out.println(t1.id+" "+t1.name+" "+t1.subject);
	}
    
}
