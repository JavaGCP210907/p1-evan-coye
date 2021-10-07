package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ers_user_id")
	private int id;

	private String ers_username;
	private String ers_password;
	private String user_fname;
	private String user_lname;
	private String user_email;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="role_id")
	private Role role;

	
	
	//boilerplate code below
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int id, String ers_username, String ers_password, String user_fname, String user_lname,
			String user_email, Role role) {
		super();
		this.id = id;
		this.ers_username = ers_username;
		this.ers_password = ers_password;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_email = user_email;
		this.role = role;
	}



	public Employee(String ers_username, String ers_password, String user_fname, String user_lname, String user_email,
			Role role) {
		super();
		this.ers_username = ers_username;
		this.ers_password = ers_password;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_email = user_email;
		this.role = role;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", ers_username=" + ers_username + ", ers_password=" + ers_password
				+ ", user_fname=" + user_fname + ", user_lname=" + user_lname + ", user_email=" + user_email + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ers_password == null) ? 0 : ers_password.hashCode());
		result = prime * result + ((ers_username == null) ? 0 : ers_username.hashCode());
		result = prime * result + id;
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_fname == null) ? 0 : user_fname.hashCode());
		result = prime * result + ((user_lname == null) ? 0 : user_lname.hashCode());
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
		if (id != other.id)
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
		if (user_lname == null) {
			if (other.user_lname != null)
				return false;
		} else if (!user_lname.equals(other.user_lname))
			return false;
		return true;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getUser_lname() {
		return user_lname;
	}



	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}



	public String getUser_email() {
		return user_email;
	}



	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}
	
	
	

}
