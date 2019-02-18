package com.neusoft.depotmanage.selectform.model;
/**
 *  Mapper������ʽ�ӿڣ�	����������Ϣ
 * @author new
 *
 */

import java.util.List;

import com.neusoft.ddzx.sgdd.model.Task;

public interface FormsMapper {

	List<AllocateForm> queryAform(AllocateForm a);//�������ӿ�
	List<IoAllocateForm> queryIoAform(IoAllocateForm i);//���˻����ӿ�
	List<IoAllocateForm> queryInAform(IoAllocateForm i);//�������ӿ�
	List<IoAllocateForm> queryOutAform(IoAllocateForm i);//�˻����ӿ�
	List<IoDepotForm> queryIoDform(IoDepotForm d);//����ⵥ���ӿ�
	int addStock(AllocateForm a);//������
	int deleteStock(AllocateForm a);//�������
	int updateState(AllocateForm a);//�޸ĵ�����״̬
	int gouHuo(IoAllocateForm i);//�������ӿ�
	int tuiHuo(IoAllocateForm i);//�˻�����ӿ�
	int updateType1(IoAllocateForm i);//�޸Ĺ�����״̬
	int updateType2(IoAllocateForm i);//�޸��˻���״̬
	//������������ӳ���������⣩
	int addIodepot1(AllocateForm a);
	//������������ӳ����������⣩
	int addIodepot2(AllocateForm a);
	//�������������ӳ�����
	int addIodepot3(IoAllocateForm i);
	//�˻�����������ӳ�����
	int addIodepot4(IoAllocateForm i);
	//�޸�����״̬
	int updaterenwudan(Task t);
}