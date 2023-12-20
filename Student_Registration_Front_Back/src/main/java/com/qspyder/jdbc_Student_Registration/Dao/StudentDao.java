package com.qspyder.jdbc_Student_Registration.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qspyder.jdbc_Student_Registration.Connection.StudentConnection;
import com.qspyder.jdbc_Student_Registration.Dto.StudentDto;

public class StudentDao {

	public static int result ;
	static Scanner scn = new Scanner(System.in);
		
	Connection conn = StudentConnection.getStudentConnection();
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		public StudentDto saveStudentDao (StudentDto student) {
			
			try {
				CallableStatement call = conn.prepareCall("call saveStudent(?,?,?,?,?)");
				call.setInt(1, student.getId());
				call.setString(2, student.getName());
				call.setString(3, student.getEmail()) ;
				call.setLong(4, student.getPhone());
				call.setString(5, student.getGender());
				
				call.execute();
				
				return student;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
		}
//================================================================================================================================	
		
	public List<StudentDto> getStudentAllDetailsDao() {
			
			
				try {
					CallableStatement call = conn.prepareCall("call displayAll()");
					
					ResultSet a =  call.executeQuery();
					
					List <StudentDto> students = new ArrayList<StudentDto>() ;
					
					StudentDto student ; 
					
							while(a.next()) {
								student  = new StudentDto(a.getInt("id"),
								a.getString("name"),
								a.getString("email"),
								a.getLong("phone"),
								a.getString("gender"));
								
								 students.add(student) ;
					}
							return students ;
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			return null ;	
	}
//=================================================================================================================================		
			
		public int delStudentDao(int del) {
				
			
			try {
				CallableStatement call = conn.prepareCall("call deleteById(?)");
				call.setInt(1, del);
				
				 result = call.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result ;
	}
		
//		===============================================================================
}	