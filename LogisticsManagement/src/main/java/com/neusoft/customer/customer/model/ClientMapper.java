package com.neusoft.customer.customer.model;

import java.util.List;
/**
 * �ͻ�����Mapper�ӿ�
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
