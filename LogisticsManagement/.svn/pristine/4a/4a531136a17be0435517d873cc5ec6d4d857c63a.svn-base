package com.neusoft.customer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.customer.customer.model.Client;
import com.neusoft.customer.customer.model.ClientMapper;
/**
 * 客户Service实现类
 * @author DYQ
 *
 */
@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientMapper dao;
	
	@Override
	public List<Client> queryAll(Client client) {
		return dao.queryAll(client);
	}

	@Override
	public int insert(Client client) {
		return dao.insert(client);
	}

	@Override
	public int update(Client client) {
		return dao.update(client);
	}

	@Override
	public int delete(Integer clientId) {
		return dao.delete(clientId);
	}

	@Override
	public Client queryClientById(Integer clientId) {
		return dao.queryClientById(clientId);
	}

}
