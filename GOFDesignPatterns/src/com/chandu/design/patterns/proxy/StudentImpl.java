package com.chandu.design.patterns.proxy;

import java.util.List;

public class StudentImpl implements Student {

	private int id;
	private List<Grade> grades;
	
	StudentImpl(){
		this.id=143;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

}
