package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_id")
	private int id;
	
	private String reimb_description;
	private double reimb_amount;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="ers_username")
	private Employee e;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="type_id")
	private ReimbType rt;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="status_id")
	private ReimbStatus rs;

	
	//boilerplate code below
	
	public Reimbursement() {
		super();
		
	}


	public Reimbursement(int id, String reimb_description, double reimb_amount, Employee e, ReimbType rt,
			ReimbStatus rs) {
		super();
		this.id = id;
		this.reimb_description = reimb_description;
		this.reimb_amount = reimb_amount;
		this.e = e;
		this.rt = rt;
		this.rs = rs;
	}


	public Reimbursement(String reimb_description, double reimb_amount, Employee e, ReimbType rt, ReimbStatus rs) {
		super();
		this.reimb_description = reimb_description;
		this.reimb_amount = reimb_amount;
		this.e = e;
		this.rt = rt;
		this.rs = rs;
	}


	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", reimb_description=" + reimb_description + ", reimb_amount=" + reimb_amount
				+ ", e=" + e + ", rt=" + rt + ", rs=" + rs + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(reimb_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((reimb_description == null) ? 0 : reimb_description.hashCode());
		result = prime * result + ((rs == null) ? 0 : rs.hashCode());
		result = prime * result + ((rt == null) ? 0 : rt.hashCode());
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
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(reimb_amount) != Double.doubleToLongBits(other.reimb_amount))
			return false;
		if (reimb_description == null) {
			if (other.reimb_description != null)
				return false;
		} else if (!reimb_description.equals(other.reimb_description))
			return false;
		if (rs == null) {
			if (other.rs != null)
				return false;
		} else if (!rs.equals(other.rs))
			return false;
		if (rt == null) {
			if (other.rt != null)
				return false;
		} else if (!rt.equals(other.rt))
			return false;
		return true;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Employee getE() {
		return e;
	}


	public void setE(Employee e) {
		this.e = e;
	}


	public ReimbType getRt() {
		return rt;
	}


	public void setRt(ReimbType rt) {
		this.rt = rt;
	}


	public ReimbStatus getRs() {
		return rs;
	}


	public void setRs(ReimbStatus rs) {
		this.rs = rs;
	}
	
	

}
	