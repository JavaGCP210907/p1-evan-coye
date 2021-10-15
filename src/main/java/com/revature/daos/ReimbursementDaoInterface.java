package com.revature.daos;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementDaoInterface {
	
	public List<Reimbursement> allReimbursements();
	
	public List<Reimbursement> findReimbursementByUsername(String reimb_author);
	
	public void submitReimbursement(Reimbursement r);
	
	public void updateStatus(String reimb_status, int reimb_id);

}
