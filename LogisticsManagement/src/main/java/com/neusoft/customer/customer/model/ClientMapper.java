package com.neusoft.customer.customer.model;

import java.util.List;
/**
 * 客户操作Mapper接口
 * @author DYQ
 *
 */
public interface ClientMapper {
	
	List<Client> queryAll(Client client);
	Client queryClientById(Integer clientId);
	int insert(Client client);
	int update(Client client);
	int delete(Integer clientId);
	
}
