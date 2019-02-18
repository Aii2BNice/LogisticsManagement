package com.neusoft.system.power.model;

import java.util.List;
/**
 * 权限Mapper接口
 * @author DYQ
 *
 */
public interface PowerMapper {
	
	List<Power> queryAll(Power power);
	int insert(Power power);
	int update(Power power);
	int delete(Integer powerid);
	
}
