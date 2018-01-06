package com.yuanjun.dao;

import java.util.List;

import com.yuanjun.bean.User;

public interface UserDao {
	/**
	 * ��ѯ
	 * @return
	 */
	List<User> findUser();
	/**
	 * ����
	 * @param user
	 */
	void saveUser(User user);
	/**
	 * ɾ��
	 * @param id
	 */
	void deleteUser(int id);
	/**
	 * �޸�
	 * @param user
	 */
	void updateUser(User user);
}
