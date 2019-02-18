package com.neusoft.customer.customer.service;

import java.util.List;

import com.neusoft.customer.customer.model.Client;
/**
 * ¿Í»§²Ù×÷Service
 * @author DYQ
 *
 */
public interface ClientService {

	List<Client> queryAll(Client client);
	Client queryClientById(Integer clientId);
	int insert(Client client);
	int update(Client client);
	int delete(Integer clientId);
	
}
