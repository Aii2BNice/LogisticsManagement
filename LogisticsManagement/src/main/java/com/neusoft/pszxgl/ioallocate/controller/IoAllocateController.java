package com.neusoft.pszxgl.ioallocate.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neusoft.pszxgl.ioallocate.model.IoAllocate;
import com.neusoft.pszxgl.ioallocate.service.IoAllocateService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 杩涢��璐ц皟搴︾鐞咰ontroller
 */
@Controller
public class IoAllocateController {
	
	@Autowired
	private IoAllocateService service;
	
	@Autowired
	private JournalService journalService;
	
	/*閫�璐�*/
	@RequestMapping(value="/querypendingoutAllocate",params="act=query")
	public String querypendingout(HttpServletRequest request,IoAllocate io){
		Integer key = Integer.valueOf(request.getParameter("ke"));
		String str = "/pszxgl/ioallocate/ioallocateoutquery.jsp";
		
		//鑾峰彇涓�鍏辨湁澶氬皯鏉¤褰�
		int counts = service.queryOutCounts(io);
				
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-begin
		int pageNum = io.getPageNum();//褰撳墠绗嚑椤�
		int pageCounts = io.getPageCounts();//姣忛〉澶氬皯鏉�
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx"+pageCounts);
		int pages = counts/pageCounts + (counts%pageCounts>0?1:0);//涓�鍏卞灏戦〉
		if(pageNum<1){
			pageNum = 1;
		}
		if(pageNum>pages){
			pageNum = pages;
		}
		io.setPageNum(pageNum);
		io.setPageCounts(pageCounts);
		io.setPages(pages);
		io.setCounts(counts);
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-end
		
		if(key==1){
			if(io.getId()!=null){
				IoAllocate lisat = service.returnPendingQueryById(io.getId());
				List<IoAllocate> lista = new ArrayList<IoAllocate>();
				lista.add(lisat);
				request.getSession().setAttribute("outlist", lista);
				request.getSession().setAttribute("ke", key);
			}else{
				List<IoAllocate> list = service.returnPendingQuery(io);
				request.getSession().setAttribute("outlist", list);
				request.getSession().setAttribute("ke", key);
			}
		}else{
			List<IoAllocate> listall = service.queryAllOut(io);
			request.getSession().setAttribute("outlist", listall);
			request.getSession().setAttribute("ke", key);
		}
		
		return str;
	}
	
	
	
	
	
	/*杩涜揣*/
	@RequestMapping(value="/querypendingIoAllocate",params="act=query")
	public String querypending(HttpServletRequest request,IoAllocate ia){
		Integer key = Integer.valueOf(request.getParameter("key"));
		String str = "/pszxgl/ioallocate/ioallocateinquery.jsp";
		
		//鑾峰彇涓�鍏辨湁澶氬皯鏉¤褰�
		int counts = service.queryCounts(ia);
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-begin
		int pageNum = ia.getPageNum();//褰撳墠绗嚑椤�
		int pageCounts = ia.getPageCounts();//姣忛〉澶氬皯鏉�
		int pages = counts/pageCounts + (counts%pageCounts>0?1:0);//涓�鍏卞灏戦〉
		if(pageNum<1){
			pageNum = 1;
		}
		if(pageNum>pages){
			pageNum = pages;
		}
		ia.setPageNum(pageNum);
		ia.setPageCounts(pageCounts);
		ia.setPages(pages);
		ia.setCounts(counts);
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-end
		
		if(key==1){
			if(ia.getId()!=null){
				IoAllocate lis = service.pendingQueryById(ia.getId());
				List<IoAllocate> lista = new ArrayList<IoAllocate>();
				lista.add(lis);
				request.getSession().setAttribute("pendinglist", lista);
				request.getSession().setAttribute("key", key);
			}else{
				List<IoAllocate> list = service.pendingQuery(ia);
				request.getSession().setAttribute("pendinglist", list);
				request.getSession().setAttribute("key", key);
			}
		}else{
			List<IoAllocate> listall = service.queryAllIn(ia);
			request.getSession().setAttribute("pendinglist", listall);
			request.getSession().setAttribute("key", key);
		}
		
		return str;
	}
	
	
	
	/**
	 * 鏌ヨ鍏ㄩ儴鏁版嵁
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/queryIoAllocate",params="act=query")
	public String query(HttpServletRequest request,IoAllocate ia){
		String str = "";
//		List<IoAllocate> list = service.queryAll(ia);
//		request.getSession().setAttribute("list", list);
		return str;
	}
	
	
	/**
	 * 閫氳繃ID鏌ヨ涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/toUpdateIoAllocate",params="act=toUpdate")
	public String toUpdate(HttpServletRequest request,IoAllocate ia){
		String str = "";
		IoAllocate ioallocate = service.queryById(ia.getId());
		request.getSession().setAttribute("ioallocate", ioallocate);
		return str;
	}
	
	
	/**
	 * 澧炲姞涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/addIoAllocate",params="act=inadd")
	public String inadd(HttpServletRequest request,IoAllocate ia){
		journalService.insert(new Journal(null, "nongkai", ia.getId(), null, null, null, "生成进货单"));
		String oid = request.getParameter("id");
		int id = Integer.parseInt(oid);
		IoAllocate io = service.pendingQueryById(id);
		io.setType(1);
		io.setId(id);
		io.setAllocateDate(new Date());
		double total=io.getOrderform().getShopNum()*io.getPro().getCost();
		io.setTotal(total);
		String str = "/pszxgl/ioallocate/ioallocateinquery.jsp";
		int i = service.add(io);
		if(i>0){
			request.setAttribute("msg", "进货单生成成功，请重新查询!");
		}else {
			request.setAttribute("msg", "增加失败");
		}
		return str;
	}
	
	@RequestMapping(value="/addIoAllocate",params="act=outadd")
	public String outadd(HttpServletRequest request,IoAllocate ia){
		journalService.insert(new Journal(null, "nongkai", ia.getId(), null, null, null, "生成退货单"));
		String oid = request.getParameter("id");
		int id = Integer.parseInt(oid);
		IoAllocate io = service.returnPendingQueryById(id);
		io.setType(0);
		io.setId(id);
		io.setAllocateDate(new Date());
		double total=io.getOrderform().getShopNum()*io.getPro().getCost();
		io.setTotal(total);
		String str = "/pszxgl/ioallocate/ioallocateoutquery.jsp";
		int i = service.add(io);
		if(i>0){ 
			request.setAttribute("msg", "退货单生成成功，请重新查询!");
		}else {
			request.setAttribute("msg", "增加失败！");
		}
		return str;
	}
	
}
