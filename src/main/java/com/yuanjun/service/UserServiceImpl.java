package com.yuanjun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanjun.bean.User;
import com.yuanjun.dao.UserDao;
import com.yuanjun.spring.DynamicDataSourceHolder;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> findUser() {
		String dataSourceType = DynamicDataSourceHolder.getDataSourceKey();
		System.out.println(dataSourceType);
		return userDao.findUser();
	}
	public void saveUser(User user) {
		String dataSourceType = DynamicDataSourceHolder.getDataSourceKey();
		System.out.println(dataSourceType);
		userDao.saveUser(user);
	}
	
	public void deleteUser(int id){
		String dataSourceType = DynamicDataSourceHolder.getDataSourceKey();
		System.out.println(dataSourceType);
		userDao.deleteUser(id);
	}

	public void updateUser(User user){
		String dataSourceType = DynamicDataSourceHolder.getDataSourceKey();
		System.out.println(dataSourceType);
		userDao.updateUser(user);
	}
}
