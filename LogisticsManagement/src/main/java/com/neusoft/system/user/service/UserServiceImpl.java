package com.neusoft.system.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.system.user.model.User;
import com.neusoft.system.user.model.UserMapper;
/**
 * 用户Service实现类
 * @author DYQ
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper dao;
	
	@Override
	public User login(User user) {
		return dao.login(user);
	}
	
	@Override
	public List<User> queryAll(User user) {
		return dao.queryAll(user);
	}
	
	@Override
	public int insert(User user) {
		return dao.insert(user);
	}
	
	@Override
	public int update(User user) {
		return dao.update(user);
	}
		
	@Override
	public int delete(String uname) {
		return dao.delete(uname);
	}
	
	@Override
	public List<User> verifiction(User user) {
		return dao.verifiction(user);
	}
	
	@Override
	public List<User> queryAllPage(User user) {
		return dao.queryAllPage(user);
	}
	
	@Override
	public int queryCounts(User user) {
		return dao.queryCounts(user);
	}

	@Override
	public int alterUser(User user) {
		return dao.alterUser(user);
	}

	@Override
	public int alterUserImg(User user) {
		return dao.alterUserImg(user);
	}

	@Override
	public User queryUser(User user) {
		return dao.queryUser(user);
	}

}
