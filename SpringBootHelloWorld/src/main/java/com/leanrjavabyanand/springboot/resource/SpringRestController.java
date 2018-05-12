package com.leanrjavabyanand.springboot.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anand
 *
 */

@RestController
public class SpringRestController {

	List<UserBean> usersList=new ArrayList<UserBean>(Arrays.asList(
			new UserBean("Anand","anand","password"),
			new UserBean("Ajeet","ajeet","ajeetpassword"),
			new UserBean("Antrish","antrish","antrishpassword")
			));
	
	@RequestMapping("/users")
	public List<UserBean> getListOfUsers() {
		return usersList;
	}
	
	@RequestMapping("/users/{userId}")
	public UserBean getUsersById(@PathVariable String userId) {
		return usersList.stream().filter(t -> t.getUserId().equals(userId)).findFirst().get();
		
	}
	
}