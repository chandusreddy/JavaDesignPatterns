package com.chandu.design.patterns.prototype;

public class Student implements Cloneable {

	private int id;
	private String name;
	private Grade grade;

	@Override
	protected Student clone() throws CloneNotSupportedException {
		// Shallow copy
		// return (Student) super.clone();
		// Deep Copy using the customized clone method
		Student student = (Student) super.clone();
		student.setGrade(new Grade());
		return student;
	}
	
	//Default Constructor
	Student(){
		
	}

	// Deep Copy using the Copy Constructor
	Student(Student student) {
		this.id = student.id;
		this.name = student.name;
		this.grade = new Grade();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
