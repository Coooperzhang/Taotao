package com.taotao.order.service;

import java.util.List;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbOrder;
import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderShipping;

public interface OrderService {
	
	/**
	 * 创建订单接口实现
	 * @param order
	 * @param itemlist
	 * @param orderShipping
	 * @return
	 */
	TaotaoResult createOrder(TbOrder order,List<TbOrderItem> itemlist,TbOrderShipping orderShipping);
	
}
