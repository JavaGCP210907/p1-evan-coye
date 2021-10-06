package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.Role;
import com.revature.utils.HibernateUtil;

public class RoleDao {
	
	public void insertRole(Role r) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(r);
		
		HibernateUtil.closeSession();
	}

}
