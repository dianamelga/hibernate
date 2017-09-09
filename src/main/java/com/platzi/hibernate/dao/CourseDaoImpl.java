package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;

public class CourseDaoImpl implements CourseDao{

	private PlatziSession platziSession;

	public CourseDaoImpl() {
		platziSession = new PlatziSession();
	}

	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCourseById(Long idCourse) {
		// TODO Auto-generated method stub
		
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	public Course findCourseById(Long idCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> findCoursesByTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
