package com.revature.models;

public class Reimbursement {
	
	private int reimb_id;
	private String reimb_description;
	private double reimb_amount;
	private String reimb_author;
	private String reimb_type;
	private String reimb_status;
	
	
	
	//boilerplate code below
	
	
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Reimbursement(int reimb_id, String reimb_description, double reimb_amount, String reimb_author,
			String reimb_type, String reimb_status) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_description = reimb_description;
		this.reimb_amount = reimb_amount;
		this.reimb_author = reimb_author;
		this.reimb_type = reimb_type;
		this.reimb_status = reimb_status;
	}



	public Reimbursement(String reimb_description, double reimb_amount, String reimb_author, String reimb_type,
			String reimb_status) {
		super();
		this.reimb_description = reimb_description;
		this.reimb_amount = reimb_amount;
		this.reimb_author = reimb_author;
		this.reimb_type = reimb_type;
		this.reimb_status = reimb_status;
	}
	
	



	public Reimbursement(String reimb_description, double reimb_amount, String reimb_author, String reimb_type) {
		super();
		this.reimb_description = reimb_description;
		this.reimb_amount = reimb_amount;
		this.reimb_author = reimb_author;
		this.reimb_type = reimb_type;
	}



	@Override
	public String toString() {
		return "Reimbursement [reimb_id=" + reimb_id + ", reimb_description=" + reimb_description + ", reimb_amount="
				+ reimb_amount + ", reimb_author=" + reimb_author + ", reimb_type=" + reimb_type + ", reimb_status="
				+ reimb_status + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(reimb_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((reimb_author == null) ? 0 : reimb_author.hashCode());
		result = prime * result + ((reimb_description == null) ? 0 : reimb_description.hashCode());
		result = prime * result + reimb_id;
		result = prime * result + ((reimb_status == null) ? 0 : reimb_status.hashCode());
		result = prime * result + ((reimb_type == null) ? 0 : reimb_type.hashCode());
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
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(reimb_amount) != Double.doubleToLongBits(other.reimb_amount))
			return false;
		if (reimb_author == null) {
			if (other.reimb_author != null)
				return false;
		} else if (!reimb_author.equals(other.reimb_author))
			return false;
		if (reimb_description == null) {
			if (other.reimb_description != null)
				return false;
		} else if (!reimb_description.equals(other.reimb_description))
			return false;
		if (reimb_id != other.reimb_id)
			return false;
		if (reimb_status == null) {
			if (other.reimb_status != null)
				return false;
		} else if (!reimb_status.equals(other.reimb_status))
			return false;
		if (reimb_type == null) {
			if (other.reimb_type != null)
				return false;
		} else if (!reimb_type.equals(other.reimb_type))
			return false;
		return true;
	}



	public int getReimb_id() {
		return reimb_id;
	}



	public void setReimb_id(int reimb_id) {
		this.reimb_id = reimb_id;
	}



	public String getReimb_description() {
		return reimb_description;
	}



	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}



	public double getReimb_amount() {
		return reimb_amount;
	}



	public void setReimb_amount(double reimb_amount) {
		this.reimb_amount = reimb_amount;
	}



	public String getReimb_author() {
		return reimb_author;
	}



	public void setReimb_author(String reimb_author) {
		this.reimb_author = reimb_author;
	}



	public String getReimb_type() {
		return reimb_type;
	}



	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}



	public String getReimb_status() {
		return reimb_status;
	}



	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}
	
	
	
	
	
	
	
	
	
	
	

}
