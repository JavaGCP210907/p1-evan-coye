package com.revature;

import java.util.List;

import com.revature.controllers.LoginController;
import com.revature.controllers.ReimbursementController;
import com.revature.daos.ReimbursementDao;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;

import io.javalin.Javalin;


public class Launcher {

	public static void main(String[] args) {
		
		ReimbursementController rc = new ReimbursementController();
		LoginController lc = new LoginController();
		
		ReimbursementService rs = new ReimbursementService();
		
		Reimbursement r = new Reimbursement();
		
		
		
		Javalin app = Javalin.create(
				config -> {
					config.enableCorsForAllOrigins(); 
				}
				).start(8090);
		
		app.get("/allreimbursements", ctx -> ctx.json(rs.allRemimbursements()));
		
		app.post("/login", lc.loginHandler);
		
		//app.post("submit", ctx -> ctx.json(rs.submitReimbursement(Reimbursement r = new Reimbursement(r.getReimb_description(), r.getReimb_amount(), r.getReimb_author(), r.getReimb_type()))));
		
		

	}

}
