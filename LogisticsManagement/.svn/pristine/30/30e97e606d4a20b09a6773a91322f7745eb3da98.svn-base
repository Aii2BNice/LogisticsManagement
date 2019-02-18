package com.neusoft.depotmanage.shop.model;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.pszxgl.product.model.Product;

public interface ShopStockMapper {

	List<ShopStock> queryShopStock(ShopStock s);//查询库存商品
	int queryShopStockCount(ShopStock s);//查询多少条记录
	ShopStock queryShopStockId(@Param("shopId")Integer shopId,@Param("depotId")Integer depotId);//根据商品Id查询商品
	int queryByShopId(Integer shopId);//根据商品Id查询
	int updateShopStock(ShopStock s);//修改商品信息
	int addShopStock(ShopStock s);//增加库存信息
	List<Product> queryAllShop(Product pro);//查询商品表信息
}
