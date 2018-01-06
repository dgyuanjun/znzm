package com.yuanjun.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuanjun.bean.Person;
import com.yuanjun.bean.User;
import com.yuanjun.service.PersonService;
import com.yuanjun.service.UserService;

@Controller
public class LoginControl {
	@Autowired
	private PersonService personService;
	
	@Autowired
	private UserService userService;
	@RequestMapping("/main")
	public String test(){
		
		List<Person> list = personService.findAll();
		for (Person person : list) {
			System.out.println(person);
		}
		return "main";
	}
	@RequestMapping("/addPerson")
	public void addPerson(){
		Person person = new Person();
		person.setId(2);
		person.setName("ÕÅÈý");
		person.setPassword("123456");
		personService.addPerson(person);
	}
	@RequestMapping("/user")
	public String test1(){
		
		List<User> list = userService.findUser();
		for (User user : list) {
			System.out.println(user);
		}
		return "main";
	}
	@RequestMapping("/add")
	public void saveUser(){
		User user = new User();
		user.setId(2);
		user.setName("Lisi");
		user.setPassword("123456");
		user.setAddress("beijing");
		userService.saveUser(user);
	}
}
