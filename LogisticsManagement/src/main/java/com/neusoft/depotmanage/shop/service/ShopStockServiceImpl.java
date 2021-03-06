package com.neusoft.depotmanage.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.depotmanage.shop.model.ShopStock;
import com.neusoft.depotmanage.shop.model.ShopStockMapper;
import com.neusoft.pszxgl.product.model.Product;

@Service
public class ShopStockServiceImpl implements ShopStockService{

	@Autowired
	private ShopStockMapper dao;
	
	@Override
	public List<ShopStock> queryShopStock(ShopStock s) {
		return dao.queryShopStock(s);
	}

	@Override
	public ShopStock queryShopStockId(Integer shopId,Integer depotId) {
		return dao.queryShopStockId(shopId,depotId);
	}

	@Override
	public int updateShopStock(ShopStock s) {
		return dao.updateShopStock(s);
	}

	@Override
	public int addShopStock(ShopStock s) {
		return dao.addShopStock(s);
	}

	@Override
	public int queryByShopId(Integer shopId) {
		return dao.queryByShopId(shopId);
	}

	@Override
	public List<Product> queryAllShop(Product pro) {
		return dao.queryAllShop(pro);
	}

	@Override
	public int queryShopStockCount(ShopStock s) {
		return dao.queryShopStockCount(s);
	}

}
