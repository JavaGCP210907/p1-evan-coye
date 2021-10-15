package com.revature.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;

import io.javalin.http.Handler;

public class ReimbursementController {
	
	ReimbursementService rs = new ReimbursementService();
	
	public Handler allReimbursementsHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			List<Reimbursement> rList = rs.allRemimbursements();
			
			Gson gson = new Gson();
			
			String JSONReimbursement = gson.toJson(rList);
			
			ctx.result(JSONReimbursement);
			
			ctx.status(200);
			
			
		}else {
			ctx.status(403);
		}
		
	};
	
	public Handler reimbursementByUsernameHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			String ra = ctx.body();
			
			List<Reimbursement> rList = rs.findReimbursementByUsername(ra);
			
			Gson gson = new Gson();
			
			String JSON = gson.toJson(rList);
			
			ctx.result(JSON);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
	};
	
	public Handler submitReimbursementHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			String r = ctx.body();
			
			Gson gson = new Gson();
			
			Reimbursement rb = gson.fromJson(r, Reimbursement.class);
			
			rs.submitReimbursement(rb);
			
			ctx.status(201);
			
		}else {
			ctx.status(403);
		}
		
	};
	
	public Handler updateStatus = (ctx) -> {
		
		
	
		
		
	};

}
