//package com.springjpa.bankapplication.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.springjpa.bankapplication.services.UserService;
//
//
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//	 @Autowired
//	   MyUserDetailsService userDetailsService;
//
////	    @Override
////	    protected void configure(HttpSecurity http) throws Exception {
////	        http.authorizeRequests()
//////	                .antMatchers("/api/v1/users").hasRole("ADMIN")
////	                .antMatchers("/api/v1/users/{id}").hasAnyRole("ADMIN", "USER")
////	                .antMatchers("/api/v1/users/balance/{id}").hasRole("USER")
////	                .antMatchers("/api/v1/transactions/users").hasRole("ADMIN")
////	                .antMatchers("/api/v1/transactions/users/recent").hasAnyRole("ADMIN","USER")
////	                .antMatchers("/api/v1/transactions/users/{userId}").hasRole("USER")
////	                .antMatchers("/api/v1/transactions/users/deposit/{userId}").hasRole("USER")
////	                .antMatchers("/api/v1/transactions/users/withdraw/{userId}").hasRole("USER")
////	                .antMatchers("/api/v1/transactions/users/transfer/{userId}").hasRole("USER")
////	                .antMatchers("/api/v1/").permitAll()
////	                .and()
////	                .formLogin();
////	    }
//
//	    @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	     auth.userDetailsService(userDetailsService);
//	    }
//
//	    @Bean
//	    PasswordEncoder getPasswordEncoder(){
//	        return NoOpPasswordEncoder.getInstance();
//	    }
//
//
//
//
//
//}
