package main;

public class Quiz5 {

	public static void main(String[] args) {
		
		Student student = new Student(1001, "둘리");
		Student student2 = new Student(1002, "또치");
		Student student3 = new Student(1003, "도우너");
		
		System.out.println("Student["+ "Student ID: " + student.number + " Student Name: " + student.name+"]");
		System.out.println("Student["+ "Student ID: " + student2.number + " Student Name: " + student2.name+"]");
		System.out.println("Student["+ "Student ID: " + student3.number + " Student Name: " + student3.name+"]");
		
	}

}
class Student {
	int number;
	String name;
	
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
}


