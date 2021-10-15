package com.revature.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtUtil {
	
	private static final String secret ="secretString1";
    private static final Algorithm algorithm = Algorithm.HMAC256(secret);

    
    public static String generate(String ers_username, String ers_password){

        
        String token = JWT.create()
                .withClaim("username", ers_username) 
                .withClaim("password", ers_password)
                .sign(algorithm);

        return  token;
    }

    public static DecodedJWT isValidJWT(String token){
            DecodedJWT jwt = JWT.require(algorithm).build().verify(token);
            return  jwt;
    }

}
