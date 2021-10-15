package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.models.LoginDTO;
import com.revature.services.LoginService;
import com.revature.utils.JwtUtil;

import io.javalin.http.Handler;

public class LoginController {
	
	LoginService ls = new LoginService();
	
	public Handler loginHandler = (ctx) ->{
		
		String body = ctx.body();
		
		Gson gson = new Gson();
		
		LoginDTO LDTO = gson.fromJson(body, LoginDTO.class);
		
		if(ls.login(LDTO.getErs_username(), LDTO.getErs_password())) {
			
			String jwt = JwtUtil.generate(LDTO.getErs_username(), LDTO.getErs_password());
			
			ctx.req.getSession();
			
			ctx.result("Login was Successful. JWT token is " + jwt);
		}else {
			ctx.status(401);
		}
	};

}
