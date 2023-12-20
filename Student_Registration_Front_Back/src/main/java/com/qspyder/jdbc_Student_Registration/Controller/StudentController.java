package com.qspyder.jdbc_Student_Registration.Controller;

import java.util.List;
import java.util.Scanner;

import com.qspyder.jdbc_Student_Registration.Dao.StudentDao;
import com.qspyder.jdbc_Student_Registration.Dto.StudentDto;
import com.qspyder.jdbc_Student_Registration.Services.StudentServices;

public class StudentController {
	
	public static void main (String[] args){
		try (Scanner scn = new Scanner(System.in)) {
			StudentServices service = new StudentServices();
			
			System.out.println("#########################################");
			System.out.println("####    Welcome to the Application   ####");
			System.out.println("#########################################");
			
			while(true) {
				
			System.out.println("enter 1 to insert ");
			System.out.println("enter 3 to display all students data ");
			System.out.println("enter 4 to delete ");
			System.out.println("enter 0 to exit ");
			System.out.println("please select one option from above \nto continue...");
			
			int choice = scn.nextInt();
			
			if (choice == 0) {
				System.out.println("/////////////////////////////////////////////////////////");
				System.out.println("///////////////  Closing the Application  ///////////////");
				System.out.println("/////////////////////////////////////////////////////////");
				break;
			}
			switch (choice) {
			case 1 :{
//			INSERT NEW RECORD
				
				System.out.println("Please enter asked details one by one..");
				System.out.print(" ID : ");
				int id = scn.nextInt();
				scn.nextLine();
				
				System.out.print(" Name : ");
				String name = scn.nextLine();
				
				System.out.print(" email : ");
				String email = scn.nextLine();
				
				System.out.print(" Phone no. : ");
				long phone = scn.nextLong();
				scn.nextLine();
				
				System.out.println("Gender : ");
				String gender = scn.nextLine();
				
				StudentDto studSaved = new StudentDto(id , name ,email ,phone ,gender);
				StudentDto studSavedCheck = service.saveStudentService(studSaved);
				
				if(studSavedCheck != null) {
					System.out.println("==================== Data Stored Successfully ====================");
				}
				else {
					System.out.println("==================== Data Not Stored  ====================");	
				}
			}break ;
			

//		=============================================================================
			case 3 : {
//			DISPLAY ALL
				
				List<StudentDto> display = service.getStudentAllDetailsServices();
					
				for(StudentDto p : display) {
					System.out.println(p);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
				}	
				
			}break;
//		=============================================================================
			case 4: {
//			DELETE
				System.out.println("enter the id who's data u want to delete.");
				int del = scn.nextInt();
				
				service.delStudentDetailsByIdServices(del);
				
				if (StudentDao.result == 1) {
					System.out.println("***   RECORD WITH ID: "+del+" DELETED SUCCESSFULLY   ***");
				}
				else {
					System.out.println("***   NO RECORD IS ASSOCIATED WITH ENTERED ID : " +del+ "   ***");
				}
			}break;
			
//		=============================================================================			
			
			default : {
				System.out.println("^^^^PLEASE SELECT FROM ABOVE OPTIONS ONLY^^^^");
			}break;
//		=============================================================================
			}
			
			}
		}	
		}
	}