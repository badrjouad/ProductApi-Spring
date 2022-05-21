package com.supmti.productsapi.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   /* @Override
    protected  void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.formLogin();

        httpSecurity
                .authorizeHttpRequests()
                .antMatchers("delete/**","get*").hasRole("USER");

        httpSecurity
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated();
    }
*/
    @Override
    protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("user1")
                .password("{noop}1234")
                .roles("USER");


        auth.inMemoryAuthentication()
                .withUser("user2")
                .password("{noop}1234")
                .roles("ADMIN");


        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}admin")
                .roles("ADMIN");

    }
}
