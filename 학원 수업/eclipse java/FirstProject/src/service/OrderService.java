package service;

import java.util.List;
import java.util.Map;

import dao.OrderDAO;
import util.ProdView;

public class OrderService {
	private static OrderService instance;
	private OrderService() {}
	public static OrderService getInstance() {
		if(instance==null) instance=new OrderService();
		return instance;
	}
	
	private ProdView prodView=ProdView.getInstance();
	private OrderDAO dao=OrderDAO.getInstance();
	public void selectProd() {
		List<Map<String, Object>> list=dao.selectList();
		prodView.displayProd(list);
		System.out.println("-----------------------------");
		System.out.print("상품선택 : ");
	}
}
