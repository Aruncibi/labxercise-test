package com.cg.vm.dao;

import javax.persistence.EntityManager;

import com.cg.vm.bean.User;
import com.cg.vm.util.DBUtil;

public class IUserRepositoryImpl implements IUserRepository{
	DBUtil dbUtil = new DBUtil();
	/**
	 * create dbutil class object and create a entity manager from createEntityManager Function
	 */
	EntityManager entityManager = dbUtil.createEntityManager();

	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
