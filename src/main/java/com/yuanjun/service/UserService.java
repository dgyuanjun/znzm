package com.yuanjun.service;

import java.util.List;

import com.yuanjun.bean.User;

/**
 * 
 * @author Administrator
 *
 */
public interface UserService {
	
	List<User> findUser();
	
	void saveUser(User user);
}
