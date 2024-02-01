//package com.springstarter;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("api")
//public class UserController {
//
//	List<User> users = Arrays.asList(
//			
//			new User(101,"Kotesh","Hyderabad"),
//			new User(102,"Ramesh","Delhi"),
//			new User(103,"Rajesh","Mumbai"),
//			new User(104,"Sharusa","Chennai"),
//			new User(105,"Yasoda","Pune")
//			
//			
//			
//			
//			);
//	@RequestMapping("/users")
//	List<User> listOfUsers(){
//		
//		return users;
//	}
//	
//
//	@RequestMapping("/users/{userId}")
//	User gettIngUserById(@PathVariable Integer userId) {
//		
//		User user = users
//				.stream()
//				.filter(ref -> ref.getUserId().equals(userId))
//				.findFirst()
//				.get();
//		return user;
//	}
//	
//	@RequestMapping("/user/delete/{userId}")
//	String delettByUserId(@PathVariable Integer userId) {
//		User user = users
//				.stream()
//				.filter(ref -> ref.getUserId().equals(userId))
//				.findFirst()
//				.get();
//		users.remove(user);
//		return "user deleted successfully";
//		
//	}
//}
