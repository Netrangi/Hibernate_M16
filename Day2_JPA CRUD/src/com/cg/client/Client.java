package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService obj=new StudentServiceImpl();
		Student student=new Student();
		
		//create
		student.setStudentId(101);
		student.setName("Netrangi");
		obj.addStudent(student);
		
		}

}
