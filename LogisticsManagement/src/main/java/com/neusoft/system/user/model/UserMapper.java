package com.neusoft.system.user.model;

import java.util.List;

/**
 * �û�Mapper�ӿ�
 * 
 * @author DYQ
 *
 */
public interface UserMapper {
	User login(User user);
	
	User queryUser(User user);
	
	List<User> queryAll(User user);

	List<User> verifiction(User user);

	int insert(User user);

	int update(User user);
	
	int alterUser(User user);

	int alterUserImg(User user);
	
	int delete(String uname);

	List<User> queryAllPage(User user);

	int queryCounts(User user);
}
