package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.Employee;
import com.revature.utils.HibernateUtil;

public class EmployeeDao {
	
	public void insertEmployee(Employee e) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(e);
		
		HibernateUtil.closeSession();
	}

}
