//package com.springjpa.bankapplication.security;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.springjpa.bankapplication.entities.User;
//import com.springjpa.bankapplication.repositories.UserRepository;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	UserRepository repository;
//
//	
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		Optional<User> user=repository.findByEmail(email);
//		user.orElseThrow(() -> new UsernameNotFoundException("User not found with the email" + email));
//
//        return user.map(MyUserDetails::new).get();
//	}
//}
