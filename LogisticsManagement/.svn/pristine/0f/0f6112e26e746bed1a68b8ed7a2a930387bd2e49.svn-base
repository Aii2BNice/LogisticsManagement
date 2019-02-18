package com.neusoft.finance.queryallinvoice.controller;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.finance.queryallinvoice.service.InvoiceService;


import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@Controller
public class InvoiceController {
	@Autowired
	private InvoiceService service;

	@RequestMapping("/queryallinvoice")
	public String queryAllInvoice(HttpServletRequest req, Invoice i) {
		List<Invoice> list = service.queryAll(i);
		req.setAttribute("list", list);
		return "/finance/queryallinvoice/queryallinvoice.jsp";
	}

	/**
	 * 查询-有分页功能
	 * 
	 * @param req
	 * @param u
	 * @return
	 */
	@RequestMapping("/queryallpageinvoice")
	public String queryAllPageInvoice(HttpServletRequest req, Invoice u) {
		// 获取一共有多少条记录
		int counts = service.queryCounts(u);
		// 进行分页相关数据的计算-begin
		int pageNum = u.getPageNum();// 当前第几页
		int pageCounts = u.getPageCounts();// 每页多少条
		int pages = counts / pageCounts + (counts % pageCounts > 0 ? 1 : 0);// 一共多少页
		if (pageNum < 1) {
			pageNum = 1;
		}
		if (pageNum > pages) {
			pageNum = pages;
		}
		
		u.setPageNum(pageNum);
		u.setPageCounts(pageCounts);
		u.setPages(pages);
		u.setCounts(counts);
		// 进行分页相关数据的计算-end
		
		//获取指定页的数据
		List<Invoice> list=service.queryAllPage(u);
		req.setAttribute("list", list);
		return "/finance/queryallinvoice/queryallinvoice.jsp";
	}
	@RequestMapping("/dcexcel")
	public void export(HttpServletRequest req, HttpServletResponse resp, Invoice u) throws Exception {
		// 1、获取符合条件的所有记录
		List<Invoice> list = service.queryAll(u);

		// 2、导出到excel中
		// 获得输出流，该输出流的输出介质是客户端浏览器
		OutputStream output = resp.getOutputStream();
		resp.reset();
		resp.setHeader("Content-disposition", "attachment;filename=temp.xls");
		resp.setContentType("application/msexcel");
		// 创建可写入的Excel工作薄，且内容将写入到输出流，并通过输出流输出给客户端浏览
		WritableWorkbook wk = Workbook.createWorkbook(output);
		// 创建可写入的Excel工作表
		WritableSheet sheet = wk.createSheet("发票信息表", 0);

		// 把单元格（column, row）到单元格（column1, row1）进行合并。
		// mergeCells(column, row, column1, row1);
		sheet.mergeCells(0, 0, 12, 0);// 单元格合并方法
		// 创建WritableFont 字体对象，参数依次表示黑体、字号12、粗体、非斜体、不带下划线、亮蓝色
		WritableFont titleFont = new WritableFont(WritableFont.createFont("黑体"), 12, WritableFont.BOLD, false,
				UnderlineStyle.NO_UNDERLINE, Colour.LIGHT_BLUE);

		// 创建WritableCellFormat对象，将该对象应用于单元格从而设置单元格的样式
		WritableCellFormat titleFormat = new WritableCellFormat();
		// 设置字体格式
		titleFormat.setFont(titleFont);
		// 设置文本水平居中对齐
		titleFormat.setAlignment(Alignment.CENTRE);
		// 设置文本垂直居中对齐
		titleFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
		// 设置背景颜色
		titleFormat.setBackground(Colour.GRAY_25);
		// 设置自动换行
		titleFormat.setWrap(true);

		// 添加Label对象，参数依次表示在第一列，第一行，内容，使用的格式
		Label lab_00 = new Label(0, 0, "发票信息记录", titleFormat);

		// 将定义好的Label对象添加到工作表上，这样工作表的第一列第一行的内容为‘收入信息记录’并应用了titleFormat定义的样式
		sheet.addCell(lab_00);
		WritableCellFormat cloumnTitleFormat = new WritableCellFormat();
		cloumnTitleFormat.setFont(new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.BOLD, false));
		cloumnTitleFormat.setAlignment(Alignment.CENTRE);

		// 设置表格的列标题
		Label lab_01 = new Label(0, 1, "发票id", cloumnTitleFormat);
		Label lab_11 = new Label(1, 1, "发票金额", cloumnTitleFormat);
		Label lab_21 = new Label(2, 1, "登记日期", cloumnTitleFormat);
		Label lab_31 = new Label(3, 1, "发票状态", cloumnTitleFormat);
		Label lab_41 = new Label(4, 1, "领用分站", cloumnTitleFormat);
		Label lab_51 = new Label(5, 1, "分站领用日期", cloumnTitleFormat);
		Label lab_61 = new Label(6, 1, "客户领用日期", cloumnTitleFormat);
		Label lab_71 = new Label(7, 1, "丢失日期", cloumnTitleFormat);
		Label lab_81 = new Label(8, 1, "任务单号", cloumnTitleFormat);
		Label lab_91 = new Label(9, 1, "丢失者姓名", cloumnTitleFormat);
		Label lab_101 = new Label(10, 1, "原发票号", cloumnTitleFormat);
		Label lab_111 = new Label(11, 1, "配送员id", cloumnTitleFormat);
		Label lab_121 = new Label(12, 1, "备注", cloumnTitleFormat);
		
		sheet.addCell(lab_01);
		sheet.addCell(lab_11);
		sheet.addCell(lab_21);
		sheet.addCell(lab_31);
		sheet.addCell(lab_41);
		sheet.addCell(lab_51);
		sheet.addCell(lab_61);
		sheet.addCell(lab_71);
		sheet.addCell(lab_81);
		sheet.addCell(lab_91);
		sheet.addCell(lab_101);
		sheet.addCell(lab_111);
		sheet.addCell(lab_121);
		
		// 定义数据的格式
		// 定义日期格式
		DateFormat df = new DateFormat("yyyy-MM-dd"); // yyyy-MM-dd hh:mm:ss
		// 创建WritableCellFormat对象
		WritableCellFormat datewcf = new WritableCellFormat(df);
		// 定义数字格式
		NumberFormat nf = new NumberFormat("0.00");
		WritableCellFormat wcf = new WritableCellFormat(nf);

		// 增加具体每行数据
		int row = 1;
		for (Invoice i : list) {
			row++;
			sheet.addCell(new Label(0, row, i.getId() + ""));
			// 类似于Label对象，区别Label表示文本数据，Number表示数值型数据
			Number price = new Number(1, row, i.getPrice(), wcf);
			sheet.addCell(price);
			// 类似于Label对象，区别Label表示文本数据，DateTime表示日期型数据
			if(i.getRegisterDate()!=null){
				DateTime registerdate = new DateTime(2, row, i.getRegisterDate(), datewcf);
				sheet.addCell(registerdate);
			}
			else{
				sheet.addCell(new Label(2, row,"未登记"));
			}
			sheet.addCell(new Label(3, row, i.getInvoiceStateId()+ ""));
			if( i.getSubstationId()!=null){
				sheet.addCell(new Label(4, row, i.getSubstationId()+ ""));
			}
			else{
				sheet.addCell(new Label(4, row, "分站未领用"));
			}
			
			if(i.getSubstationDate()!=null){
				DateTime substationdate = new DateTime(5, row, i.getSubstationDate(), datewcf);
				sheet.addCell(substationdate);
			}
			else{
				sheet.addCell(new Label(5, row,"分站未领用"));
			}
			if(i.getCustomerDate()!=null){
				DateTime customerdate = new DateTime(6, row, i.getCustomerDate(), datewcf);
				sheet.addCell(customerdate);
			}
			else{
				sheet.addCell(new Label(6, row,"客户未领用"));
			}
			if(i.getLostDate()!=null){
				DateTime lostdate = new DateTime(7, row, i.getLostDate(), datewcf);
				sheet.addCell(lostdate);
			}
			else{
				sheet.addCell(new Label(7, row,"未丢失"));
			}
			if( i.getTaskId()!=null){
				sheet.addCell(new Label(8, row, i.getTaskId() + ""));
			}
			else{
				sheet.addCell(new Label(8, row, "客户未领用"));
			}
			
			sheet.addCell(new Label(9, row, i.getLoseName()));
			if( i.getOringalInvoiceId()!=null){
				sheet.addCell(new Label(10, row, i.getOringalInvoiceId() + ""));
			}
			else{
				sheet.addCell(new Label(10, row, "未丢失"));
			}
			if( i.getDeliverId()!=null){
				sheet.addCell(new Label(11, row, i.getDeliverId() + ""));
			}
			else{
				sheet.addCell(new Label(11, row, "未配送"));
			}
			
			sheet.addCell(new Label(12, row, i.getRemark()));
		}

		// 将定义的工作表输出到之前指定的介质中（这里是客户端浏览器）
		wk.write();
		// 操作完成时，关闭对象，释放占用的内存空间
		wk.close();
	} 
}
