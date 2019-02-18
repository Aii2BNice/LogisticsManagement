package com.neusoft.depotmanage.selectform.model;
/**
 *  Mapper代理方式接口：	调拨单表信息
 * @author new
 *
 */

import java.util.List;

import com.neusoft.ddzx.sgdd.model.Task;

public interface FormsMapper {

	List<AllocateForm> queryAform(AllocateForm a);//调拨单接口
	List<IoAllocateForm> queryIoAform(IoAllocateForm i);//进退货单接口
	List<IoAllocateForm> queryInAform(IoAllocateForm i);//进货单接口
	List<IoAllocateForm> queryOutAform(IoAllocateForm i);//退货单接口
	List<IoDepotForm> queryIoDform(IoDepotForm d);//出入库单表接口
	int addStock(AllocateForm a);//入库操作
	int deleteStock(AllocateForm a);//出库操作
	int updateState(AllocateForm a);//修改调拨单状态
	int gouHuo(IoAllocateForm i);//购货入库接口
	int tuiHuo(IoAllocateForm i);//退货出库接口
	int updateType1(IoAllocateForm i);//修改购货单状态
	int updateType2(IoAllocateForm i);//修改退货单状态
	//调拨单完成增加出入库表（入库）
	int addIodepot1(AllocateForm a);
	//调拨单完成增加出入库表（出库）
	int addIodepot2(AllocateForm a);
	//购货入库完成增加出入库表
	int addIodepot3(IoAllocateForm i);
	//退货出库完成增加出入库表
	int addIodepot4(IoAllocateForm i);
	//修改任务单状态
	int updaterenwudan(Task t);
}
