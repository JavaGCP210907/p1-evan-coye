package com.revature.models;

public class Employee {
	
	private String ers_username;
	private String ers_password;
	private String user_fname;
	private String user_lanme;
	private String user_email;
	private int role_id;
	
	
	//boilerplate code below
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String ers_username, String ers_password, String user_fname, String user_lanme, String user_email,
			int role_id) {
		super();
		this.ers_username = ers_username;
		this.ers_password = ers_password;
		this.user_fname = user_fname;
		this.user_lanme = user_lanme;
		this.user_email = user_email;
		this.role_id = role_id;
	}
	
	


	public Employee(String user_fname, String user_lanme, String user_email, int role_id) {
		super();
		this.user_fname = user_fname;
		this.user_lanme = user_lanme;
		this.user_email = user_email;
		this.role_id = role_id;
	}


	@Override
	public String toString() {
		return "Employee [ers_username=" + ers_username + ", ers_password=" + ers_password + ", user_fname="
				+ user_fname + ", user_lanme=" + user_lanme + ", user_email=" + user_email + ", role_id=" + role_id
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ers_password == null) ? 0 : ers_password.hashCode());
		result = prime * result + ((ers_username == null) ? 0 : ers_username.hashCode());
		result = prime * result + role_id;
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_fname == null) ? 0 : user_fname.hashCode());
		result = prime * result + ((user_lanme == null) ? 0 : user_lanme.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ers_password == null) {
			if (other.ers_password != null)
				return false;
		} else if (!ers_password.equals(other.ers_password))
			return false;
		if (ers_username == null) {
			if (other.ers_username != null)
				return false;
		} else if (!ers_username.equals(other.ers_username))
			return false;
		if (role_id != other.role_id)
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_fname == null) {
			if (other.user_fname != null)
				return false;
		} else if (!user_fname.equals(other.user_fname))
			return false;
		if (user_lanme == null) {
			if (other.user_lanme != null)
				return false;
		} else if (!user_lanme.equals(other.user_lanme))
			return false;
		return true;
	}


	public String getErs_username() {
		return ers_username;
	}


	public void setErs_username(String ers_username) {
		this.ers_username = ers_username;
	}


	public String getErs_password() {
		return ers_password;
	}


	public void setErs_password(String ers_password) {
		this.ers_password = ers_password;
	}


	public String getUser_fname() {
		return user_fname;
	}


	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}


	public String getUser_lanme() {
		return user_lanme;
	}


	public void setUser_lanme(String user_lanme) {
		this.user_lanme = user_lanme;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public int getRole_id() {
		return role_id;
	}


	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
	
	

}
