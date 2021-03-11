package com.chandu.design.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDaoPatternApplicationTests {

	@Autowired
	StudentDAO dao;

	@Test
	void testCreate() {
		Student student = new Student();
		student.setId(123);
		student.setName("Sachin");
		dao.create(student);

	}

}
