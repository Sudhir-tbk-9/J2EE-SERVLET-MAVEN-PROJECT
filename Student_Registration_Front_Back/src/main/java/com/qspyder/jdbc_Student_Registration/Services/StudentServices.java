package com.qspyder.jdbc_Student_Registration.Services;

import java.util.List;

import com.qspyder.jdbc_Student_Registration.Dao.StudentDao;
import com.qspyder.jdbc_Student_Registration.Dto.StudentDto;

public class StudentServices {
//============================================================
	StudentDao dao = new StudentDao();

	
	public StudentDto saveStudentService (StudentDto student) {
		
		return dao.saveStudentDao(student);
	}
	
	
	public List<StudentDto> getStudentAllDetailsServices(){
		
		return dao.getStudentAllDetailsDao();
	}
	
	
	public int delStudentDetailsByIdServices(int del) {
		
		return dao.delStudentDao(del);
	}
	
	 
}

//============================================================












