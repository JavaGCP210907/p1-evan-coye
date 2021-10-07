package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="reimb_type")
public class ReimbType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="type_id")
	private int id;
	
	private String type;

	//boilerplate code below
	
	public ReimbType() {
		super();
		
	}

	public ReimbType(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public ReimbType(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "ReimbType [id=" + id + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		ReimbType other = (ReimbType) obj;
		if (id != other.id)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
