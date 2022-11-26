package com.supmti.productsapi.security.filter;

import com.supmti.productsapi.service.api.AuthServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class AuthenticationFilter /*extends OncePerRequestFilter*/ {
/*
    @Autowired
    AuthServiceInterface authServiceInterface;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws
            ServletException, IOException {
        String username = request.getHeader("username");
        String password= request.getHeader("password");

        if(authServiceInterface.authUser(username,password))
        {

            logger.info("WELCOM  " +
                    username);
        }
      else {
          response.sendError(401,"NOT AUTHENTIFICATED");
        }
        filterChain.doFilter(request, response);
    }
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request)
    {
        String path = request.getRequestURI();
        return "api/products/product".equals(path);
    }
*/
}