package JUNIT.testingClass;

public class Student {
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getRollNo() {
		return this.rollNo;
	}
}
