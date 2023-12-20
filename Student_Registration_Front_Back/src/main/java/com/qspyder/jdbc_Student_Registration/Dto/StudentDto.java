package com.qspyder.jdbc_Student_Registration.Dto;


public class StudentDto {
	
		int id ;
		String name ;
		String email ;
		long phone ;
		String gender ;
		
		public StudentDto () {
			super();
		}
		
		public StudentDto(int id, String name, String email, long phone,String gender) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.gender = gender ;
		}



		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "=> " + this.gender + "Student with id: " + id + " named " + name + " has e-mail as : " + email + " , and  can be reached on  " + phone +"." ;
		}

//=====================================================
	
	
}
