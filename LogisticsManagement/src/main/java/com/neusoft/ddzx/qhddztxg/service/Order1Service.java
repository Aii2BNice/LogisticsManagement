package com.neusoft.ddzx.qhddztxg.service;

import java.util.List;

import com.neusoft.ddzx.qhddztxg.model.Order1;
import com.neusoft.pszxgl.ioallocate.model.IoAllocate;
/**
 * @author new
 *ȱ������״̬�޸�service�ӿ�
 */
public interface Order1Service {
	public List<Order1> queryAllQh();
	public int updateQh(Integer orderId);
	public List<IoAllocate> queryByYrk();
}
