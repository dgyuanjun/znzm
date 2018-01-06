package com.yuanjun.dao;

import java.util.List;

import com.yuanjun.bean.User;

public interface UserDao {
	/**
	 * ²éÑ¯
	 * @return
	 */
	List<User> findUser();
	/**
	 * ±£´æ
	 * @param user
	 */
	void saveUser(User user);
	/**
	 * É¾³ý
	 * @param id
	 */
	void deleteUser(int id);
	/**
	 * ÐÞ¸Ä
	 * @param user
	 */
	void updateUser(User user);
}
