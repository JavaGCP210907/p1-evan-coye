package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.Reimbursement;
import com.revature.utils.HibernateUtil;

public class ReimbursementDao {
	
	public void createReimbursement(Reimbursement r) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(r);
		
		HibernateUtil.closeSession();
	}

}
