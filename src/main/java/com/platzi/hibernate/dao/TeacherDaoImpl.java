package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public class TeacherDaoImpl extends PlatziSession implements TeacherDao {
	private PlatziSession platziSession;
	
	public TeacherDaoImpl() {
		platziSession = new PlatziSession();
	}

	public void saveTeacher(Teacher teacher) {
		// persist hace lo mismo que save, pero se recomienda persist
		platziSession.getSession().persist(teacher);
		platziSession.getSession().getTransaction().commit();
	}

	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public List<Teacher> findAllTeachers() {
		return platziSession.getSession().createQuery("from Teacher").list();
	}

	public Teacher finById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
