package com.neusoft.pszxgl.ioallocate.service;

import java.util.List;
import com.neusoft.pszxgl.ioallocate.model.IoAllocate;

/**
 * 进/退调度单管理 Service
 */
public interface IoAllocateService {
	IoAllocate pendingQueryById(Integer id);
	List<IoAllocate> pendingQuery(IoAllocate ia);
	int queryCounts(IoAllocate ia);
	
	IoAllocate returnPendingQueryById(Integer id);
	List<IoAllocate>returnPendingQuery(IoAllocate ia);
	int queryOutCounts (IoAllocate ia);
	
	List<IoAllocate> queryAllIn(IoAllocate ia);
	List<IoAllocate> queryAllOut(IoAllocate ia);

	IoAllocate queryById(Integer id);

	int add(IoAllocate ia);
	
	int pendingUpdate(Integer id);
}
