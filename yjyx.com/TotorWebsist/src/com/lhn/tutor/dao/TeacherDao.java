package com.lhn.tutor.dao;

import java.util.List;

import com.lhn.tutor.entity.Teacher;

public interface TeacherDao {
	
	public List<Teacher> querybyMajor(String major);
}
