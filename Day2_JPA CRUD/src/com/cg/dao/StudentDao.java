package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	public abstract Student getStudentById(int id); //retreive
	public abstract Student addStudent(Student student); //create
	public abstract Student updateStudent(Student student);//update
	public abstract Student removeStudent(Student student); //delete
	public abstract void beginTransaction();//to start the connection
	public abstract void commitTransaction(); //to end the connection



}
