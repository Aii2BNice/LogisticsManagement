package com.neusoft.fzgl.taskform.model;

import java.util.List;

/**
 * Mapper�����ӿڣ����񵥹���
 * @author new
 *
 */
public interface TaskFormMapper {
	List<TaskForm>queryAll(TaskForm tf);
	TaskForm queryById(Integer id);
	TaskForm update(TaskForm tf);
	int queryCounts(TaskForm tf);
}