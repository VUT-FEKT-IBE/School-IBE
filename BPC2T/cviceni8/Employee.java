package com.vutbr.feec6;

public class Employee implements Comparable<Employee>{
		private String nickname;
		private String email;
		private char[] password;
		enum EmployeeType {ACTIVE, INACTIVE, DELETED}
		
		public Employee(String nickname, String email, char[] password) {
			this.nickname = nickname;
			this.email = email;
			this.password = password;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public char[] getPassword() {
			return password;
		}
		public void setPassword(char[] password) {
			this.password = password;
		};
		@Override
		public int compareTo(Employee stu) {
	        return this.getEmail().compareTo(stu.getEmail());
	    }
		@Override
		public String toString() {
			return "[nickname=" + nickname + ", email=" + email + "]";
		}
		

		
}
