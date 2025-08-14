package javaoops;

class Course
{
	String coursename = "java programming";
	
	void showCourse() {
		
		System.out.print("COURSE:" +coursename);
		
	}
	
}
class Student extends Course
{
	String name="Amit";
	
	void showStudent()
	{
		System.out.print("Student:" +name);
	}
}

class ninth extends Student
{
	String subName = "english";
	
	void showsubject() {
		System.out.print("subname:" +subName);
	}
}

public class multiple_inheritance{
	
	public static void main(String[] args) {
		
		ninth sub = new ninth();
		sub.showStudent();
		sub.showCourse();
		sub.showsubject();
	}
}