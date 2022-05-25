package com.supmti.productsapi.security.filter;

import com.supmti.productsapi.service.api.AuthServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    AuthServiceInterface authServiceInterface;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws
            ServletException, IOException {
        String userName = request.getHeader("Username");
        String password= request.getHeader("password");

        if(authServiceInterface.authUser(userName,password))
        {

            logger.info("WELCOM  " +
                    userName);
        }
      else {
          response.sendError(404,"NOT FOUND");
        }
        filterChain.doFilter(request, response);
    }
}