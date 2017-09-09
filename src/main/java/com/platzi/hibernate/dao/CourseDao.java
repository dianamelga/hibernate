package com.platzi.hibernate.dao;
import java.util.List;

import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;
public interface CourseDao {
	
	void saveCourse(Course course);
	
	void deleteCourseById(Long idCourse);
	
	void updateCourse(Course course);
	
	List<Course> findAllCourses();
	
	Course findCourseById(Long idCourse);
	
	List<Course> findCoursesByTeacher(Teacher teacher);
	
}
