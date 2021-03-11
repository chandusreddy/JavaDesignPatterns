package com.chandu.design.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Object of this time can be created at runtime.
@Repository
public class StudentDAOImpl implements StudentDAO {

	// JDBCTemplate has different DB operations
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public void create(Student student) {

		String sql = "insert into student values(?,?)";
		jdbctemplate.update(sql, student.getId(), student.getName());
	}

}
