package com.chandu.design.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class StudentProxyImpl implements Student {

	StudentImpl student = new StudentImpl();

	@Override
	public int getId() {
		return student.getId();
	}

	@Override
	public List<Grade> getGrades() {
		ArrayList<Grade> grades = new ArrayList<Grade>();
		Grade grade1 = new Grade();
		grades.add(grade1);
		grade1.setId(1);
		grade1.setSubject("Maths");
		grade1.setGrade("A+");
		
		Grade grade2 = new Grade();
		grades.add(grade2);
		grade2.setId(2);
		grade2.setSubject("Physics");
		grade2.setGrade("A");

		return grades;
	}

}
