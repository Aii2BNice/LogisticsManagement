package com.neusoft.finance.invoicedj.model;

import java.util.List;

/**
 * ���ɷ�Ʊ��mapper
 * @author new
 *
 */
public interface InvoiceDJMapper {
	public int updateDJ(Integer id);
	public List<InvoiceCXDJ> invoiceCXDJ(InvoiceCXDJ in);
	public List<InvoiceCXDJ> invoiceCXQBDJ();
}
