package com.neusoft.ddzx.qhddztxg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ddzx.qhddztxg.model.Order1;
import com.neusoft.ddzx.qhddztxg.model.Order1Mapper;
import com.neusoft.pszxgl.ioallocate.model.IoAllocate;
import com.neusoft.pszxgl.ioallocate.model.IoAllocateMapper;
/**
 * @author new
 *È±»õ¶©µ¥×´Ì¬ÐÞ¸Äservice
 */
@Service
public class Order1ServiceImpl implements Order1Service{
	@Autowired
	private Order1Mapper dao;
	@Autowired
	private IoAllocateMapper dao1;
	@Override
	public List<Order1> queryAllQh() {
		
		return dao.queryAllQh();
	}

	@Override
	public int updateQh(Integer orderId) {
		return dao.updateQh(orderId);
	}

	@Override
	public List<IoAllocate> queryByYrk() {
		return dao1.queryByYrk();
	}
	
}
