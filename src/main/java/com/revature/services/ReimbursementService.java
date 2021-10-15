package com.revature.services;

import java.util.List;

import com.revature.daos.ReimbursementDao;
import com.revature.models.Reimbursement;

public class ReimbursementService {
	
	ReimbursementDao rDao = new ReimbursementDao();
	
	public List<Reimbursement> allRemimbursements(){
		return rDao.allReimbursements();
	}
	
	public List<Reimbursement> findReimbursementByUsername(String reimb_author){
		return rDao.findReimbursementByUsername(reimb_author);
	}
	
	public void submitReimbursement(Reimbursement r) {
		rDao.submitReimbursement(r);
	}
	
	public void updateReimbursement(String reimb_status, int reimb_id ) {
		rDao.updateStatus(reimb_status, reimb_id);
	}

}
