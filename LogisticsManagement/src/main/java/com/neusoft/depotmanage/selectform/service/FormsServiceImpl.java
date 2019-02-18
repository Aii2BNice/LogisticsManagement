package com.neusoft.depotmanage.selectform.service;
/**
 * 调拨单表信息查询Service实现类
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ddzx.sgdd.model.Task;
import com.neusoft.depotmanage.selectform.model.AllocateForm;
import com.neusoft.depotmanage.selectform.model.FormsMapper;
import com.neusoft.depotmanage.selectform.model.IoAllocateForm;
import com.neusoft.depotmanage.selectform.model.IoDepotForm;
@Service
public class FormsServiceImpl implements FormsService{

	@Autowired
	private FormsMapper dao;
	
	@Override
	public List<AllocateForm> queryAform(AllocateForm a) {
		return dao.queryAform(a);
	}
	
	@Override
	public List<IoAllocateForm> queryIoAform(IoAllocateForm i) {
		return dao.queryIoAform(i);
	}

	@Override
	public List<IoAllocateForm> queryInAform(IoAllocateForm i) {
		return dao.queryInAform(i);
	}
	
	@Override
	public List<IoAllocateForm> queryOutAform(IoAllocateForm i) {
		return dao.queryOutAform(i);
	}

	@Override
	public List<IoDepotForm> queryIoDform(IoDepotForm d) {
		return dao.queryIoDform(d);
	}

	@Override
	public int addStock(AllocateForm a) {
		return dao.addStock(a);
	}

	@Override
	public int deleteStock(AllocateForm a) {
		return dao.deleteStock(a);
	}

	@Override
	public int updateState(AllocateForm a) {
		return dao.updateState(a);
	}

	@Override
	public int gouHuo(IoAllocateForm i) {
		return dao.gouHuo(i);
	}

	@Override
	public int tuiHuo(IoAllocateForm i) {
		return dao.tuiHuo(i);
	}

	@Override
	public int updateType1(IoAllocateForm i) {
		return dao.updateType1(i);
	}

	@Override
	public int updateType2(IoAllocateForm i) {
		return dao.updateType2(i);
	}

	@Override
	public int addIodepot1(AllocateForm a) {
		return dao.addIodepot1(a);
	}

	@Override
	public int addIodepot2(AllocateForm a) {
		return dao.addIodepot2(a);
	}

	@Override
	public int addIodepot3(IoAllocateForm i) {
		return dao.addIodepot3(i);
	}
	
	@Override
	public int addIodepot4(IoAllocateForm i) {
		return dao.addIodepot4(i);
	}

	@Override
	public int updaterenwudan(Task t) {
		return dao.updaterenwudan(t);
	}

}
